
package org.acappelli.sunshine.response;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;

@Generated("org.jsonschema2pojo")
public class Coord {

    @Expose
    private double lon;
    @Expose
    private double lat;

    /**
     * 
     * @return
     *     The lon
     */
    public double getLon() {
        return lon;
    }

    /**
     * 
     * @param lon
     *     The lon
     */
    public void setLon(double lon) {
        this.lon = lon;
    }

    public Coord withLon(double lon) {
        this.lon = lon;
        return this;
    }

    /**
     * 
     * @return
     *     The lat
     */
    public double getLat() {
        return lat;
    }

    /**
     * 
     * @param lat
     *     The lat
     */
    public void setLat(double lat) {
        this.lat = lat;
    }

    public Coord withLat(double lat) {
        this.lat = lat;
        return this;
    }

}
