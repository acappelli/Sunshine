
package org.acappelli.sunshine.response;

import java.util.ArrayList;
import javax.annotation.Generated;
import javax.validation.Valid;
import com.google.gson.annotations.Expose;

@Generated("org.jsonschema2pojo")
public class Weather {

    @Expose
    private String cod;
    @Expose
    private double message;
    @Expose
    @Valid
    private City city;
    @Expose
    private long cnt;
    @Expose
    @Valid
    private java.util.List<DayForecast> list = new ArrayList<DayForecast>();

    /**
     * 
     * @return
     *     The cod
     */
    public String getCod() {
        return cod;
    }

    /**
     * 
     * @param cod
     *     The cod
     */
    public void setCod(String cod) {
        this.cod = cod;
    }

    public Weather withCod(String cod) {
        this.cod = cod;
        return this;
    }

    /**
     * 
     * @return
     *     The message
     */
    public double getMessage() {
        return message;
    }

    /**
     * 
     * @param message
     *     The message
     */
    public void setMessage(double message) {
        this.message = message;
    }

    public Weather withMessage(double message) {
        this.message = message;
        return this;
    }

    /**
     * 
     * @return
     *     The city
     */
    public City getCity() {
        return city;
    }

    /**
     * 
     * @param city
     *     The city
     */
    public void setCity(City city) {
        this.city = city;
    }

    public Weather withCity(City city) {
        this.city = city;
        return this;
    }

    /**
     * 
     * @return
     *     The cnt
     */
    public long getCnt() {
        return cnt;
    }

    /**
     * 
     * @param cnt
     *     The cnt
     */
    public void setCnt(long cnt) {
        this.cnt = cnt;
    }

    public Weather withCnt(long cnt) {
        this.cnt = cnt;
        return this;
    }

    /**
     * 
     * @return
     *     The list
     */
    public java.util.List<DayForecast> getList() {
        return list;
    }

    /**
     * 
     * @param list
     *     The list
     */
    public void setList(java.util.List<DayForecast> list) {
        this.list = list;
    }

    public Weather withList(java.util.List<DayForecast> list) {
        this.list = list;
        return this;
    }

}
