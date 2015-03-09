
package org.acappelli.sunshine.response;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;

@Generated("org.jsonschema2pojo")
public class Temp {

    @Expose
    private double day;
    @Expose
    private double min;
    @Expose
    private double max;
    @Expose
    private double night;
    @Expose
    private double eve;
    @Expose
    private double morn;

    /**
     * 
     * @return
     *     The day
     */
    public double getDay() {
        return day;
    }

    /**
     * 
     * @param day
     *     The day
     */
    public void setDay(double day) {
        this.day = day;
    }

    public Temp withDay(double day) {
        this.day = day;
        return this;
    }

    /**
     * 
     * @return
     *     The min
     */
    public double getMin() {
        return min;
    }

    /**
     * 
     * @param min
     *     The min
     */
    public void setMin(double min) {
        this.min = min;
    }

    public Temp withMin(double min) {
        this.min = min;
        return this;
    }

    /**
     * 
     * @return
     *     The max
     */
    public double getMax() {
        return max;
    }

    /**
     * 
     * @param max
     *     The max
     */
    public void setMax(double max) {
        this.max = max;
    }

    public Temp withMax(double max) {
        this.max = max;
        return this;
    }

    /**
     * 
     * @return
     *     The night
     */
    public double getNight() {
        return night;
    }

    /**
     * 
     * @param night
     *     The night
     */
    public void setNight(double night) {
        this.night = night;
    }

    public Temp withNight(double night) {
        this.night = night;
        return this;
    }

    /**
     * 
     * @return
     *     The eve
     */
    public double getEve() {
        return eve;
    }

    /**
     * 
     * @param eve
     *     The eve
     */
    public void setEve(double eve) {
        this.eve = eve;
    }

    public Temp withEve(double eve) {
        this.eve = eve;
        return this;
    }

    /**
     * 
     * @return
     *     The morn
     */
    public double getMorn() {
        return morn;
    }

    /**
     * 
     * @param morn
     *     The morn
     */
    public void setMorn(double morn) {
        this.morn = morn;
    }

    public Temp withMorn(double morn) {
        this.morn = morn;
        return this;
    }

}
