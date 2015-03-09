package adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.koushikdutta.async.Util;

import org.acappelli.sunshine.R;
import org.acappelli.sunshine.Utils;
import org.acappelli.sunshine.response.DayForecast;
import org.acappelli.sunshine.response.Weather;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * @author Andrea Cappelli
 */
public class SevenDaysWeatherAdapter extends BaseAdapter{

    private LayoutInflater mInflater;
    private Context mContext = null;
    private Weather mWeather;

    public SevenDaysWeatherAdapter(Context context, Weather objects) {
        mContext = context;
        mWeather = objects;
        mInflater = LayoutInflater.from(context);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.list_item_forecast, null);
        }
        ViewHolder holder = new ViewHolder();
        holder.image = (ImageView) convertView.findViewById(R.id.imageWeather);
        holder.date = (TextView) convertView.findViewById(R.id.days);
        holder.min = (TextView) convertView.findViewById(R.id.minTemp);
        holder.max = (TextView) convertView.findViewById(R.id.maxTemp);
        DayForecast item = (DayForecast) getItem(position);
        if (item.getWeather().get(0).getMain().equals("Clear")){
            holder.image.setImageResource(R.drawable.sereno);
        }
        else if (item.getWeather().get(0).getMain().equals("Clouds")){
            holder.image.setImageResource(R.drawable.nuvoloso);
        }
        else if (item.getWeather().get(0).getMain().equals("Rain")) {
            holder.image.setImageResource(R.drawable.pioggia_moderata);
        }
        holder.date.setText(Utils.getDate(item.getDt()));
        holder.max.setText("MAX: " + item.getTemp().getMax() + "°");
        holder.min.setText("MIN: " + item.getTemp().getMin() + "°");
        return convertView;
    }

    @Override
    public int getCount() {
        return mWeather.getList().size();
    }

    @Override
    public Object getItem(int position) {
        return mWeather.getList().get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    static class ViewHolder {

      ImageView image;
      TextView date, min, max;

    }

}
