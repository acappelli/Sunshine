
package org.acappelli.sunshine.response;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Generated;
import javax.validation.Valid;
import com.google.gson.annotations.Expose;

@Generated("org.jsonschema2pojo")
public class DayForecast {

    @Expose
    private long dt;
    @Expose
    @Valid
    private Temp temp;
    @Expose
    private double pressure;
    @Expose
    private long humidity;
    @Expose
    @Valid
    private List<WeatherDetail> weather = new ArrayList<WeatherDetail>();
    @Expose
    private double speed;
    @Expose
    private long deg;
    @Expose
    private long clouds;
    @Expose
    private long rain;

    /**
     * 
     * @return
     *     The dt
     */
    public long getDt() {
        return dt;
    }

    /**
     * 
     * @param dt
     *     The dt
     */
    public void setDt(long dt) {
        this.dt = dt;
    }

    public DayForecast withDt(long dt) {
        this.dt = dt;
        return this;
    }

    /**
     * 
     * @return
     *     The temp
     */
    public Temp getTemp() {
        return temp;
    }

    /**
     * 
     * @param temp
     *     The temp
     */
    public void setTemp(Temp temp) {
        this.temp = temp;
    }

    public DayForecast withTemp(Temp temp) {
        this.temp = temp;
        return this;
    }

    /**
     * 
     * @return
     *     The pressure
     */
    public double getPressure() {
        return pressure;
    }

    /**
     * 
     * @param pressure
     *     The pressure
     */
    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    public DayForecast withPressure(double pressure) {
        this.pressure = pressure;
        return this;
    }

    /**
     * 
     * @return
     *     The humidity
     */
    public long getHumidity() {
        return humidity;
    }

    /**
     * 
     * @param humidity
     *     The humidity
     */
    public void setHumidity(long humidity) {
        this.humidity = humidity;
    }

    public DayForecast withHumidity(long humidity) {
        this.humidity = humidity;
        return this;
    }

    /**
     * 
     * @return
     *     The weather
     */
    public java.util.List<WeatherDetail> getWeather() {
        return weather;
    }

    /**
     * 
     * @param weather
     *     The weather
     */
    public void setWeather(java.util.List<WeatherDetail> weather) {
        this.weather = weather;
    }

    public DayForecast withWeather(java.util.List<WeatherDetail> weather) {
        this.weather = weather;
        return this;
    }

    /**
     * 
     * @return
     *     The speed
     */
    public double getSpeed() {
        return speed;
    }

    /**
     * 
     * @param speed
     *     The speed
     */
    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public DayForecast withSpeed(double speed) {
        this.speed = speed;
        return this;
    }

    /**
     * 
     * @return
     *     The deg
     */
    public long getDeg() {
        return deg;
    }

    /**
     * 
     * @param deg
     *     The deg
     */
    public void setDeg(long deg) {
        this.deg = deg;
    }

    public DayForecast withDeg(long deg) {
        this.deg = deg;
        return this;
    }

    /**
     * 
     * @return
     *     The clouds
     */
    public long getClouds() {
        return clouds;
    }

    /**
     * 
     * @param clouds
     *     The clouds
     */
    public void setClouds(long clouds) {
        this.clouds = clouds;
    }

    public DayForecast withClouds(long clouds) {
        this.clouds = clouds;
        return this;
    }

    /**
     * 
     * @return
     *     The rain
     */
    public long getRain() {
        return rain;
    }

    /**
     * 
     * @param rain
     *     The rain
     */
    public void setRain(long rain) {
        this.rain = rain;
    }

    public DayForecast withRain(long rain) {
        this.rain = rain;
        return this;
    }

}
