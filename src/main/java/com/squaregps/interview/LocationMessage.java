package com.squaregps.interview;

import java.time.ZonedDateTime;
import java.util.Objects;

/**
 * A geolocation message received from a device (GPS tracker or similar).
 * {@code null} in a field indicates missing data in the incoming message.
 */
public class LocationMessage {
    private ZonedDateTime dateTime;
    private Double latitude;
    private Double longitude;
    private Integer altitude;
    private Integer angle;
    private Integer satellites;
    private Integer speed;
    private Boolean digitalInputStatus1;
    private Boolean digitalInputStatus2;
    private Double analogInput1;
    private Integer gsmLevel;

    /**
     * Time the message was sent (Timestamp) or the coordinates were recorded, in UTC+0
     */
    public ZonedDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(ZonedDateTime dateTime) {
        this.dateTime = dateTime;
    }

    /**
     * Latitude, degrees
     */
    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    /**
     * Longitude, degrees
     */
    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    /**
     * Altitude, meters
     */
    public Integer getAltitude() {
        return altitude;
    }

    public void setAltitude(Integer altitude) {
        this.altitude = altitude;
    }

    /**
     * Azimuth (heading), degrees
     */
    public Integer getAngle() {
        return angle;
    }

    public void setAngle(Integer angle) {
        this.angle = angle;
    }

    /**
     * Satellites amount
     */
    public Integer getSatellites() {
        return satellites;
    }

    public void setSatellites(Integer satellites) {
        this.satellites = satellites;
    }

    /**
     * Speed, km/h
     */
    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    /**
     * State of the digital input 1
     */
    public Boolean getDigitalInputStatus1() {
        return digitalInputStatus1;
    }

    public void setDigitalInputStatus1(Boolean digitalInputStatus1) {
        this.digitalInputStatus1 = digitalInputStatus1;
    }

    /**
     * State of the digital input 2
     */
    public Boolean getDigitalInputStatus2() {
        return digitalInputStatus2;
    }

    public void setDigitalInputStatus2(Boolean digitalInputStatus2) {
        this.digitalInputStatus2 = digitalInputStatus2;
    }

    /**
     * Analog input 1 voltage, volts
     */
    public Double getAnalogInput1() {
        return analogInput1;
    }

    public void setAnalogInput1(Double analogInput1) {
        this.analogInput1 = analogInput1;
    }

    /**
     * GSM signal level, 1-5
     */
    public Integer getGsmLevel() {
        return gsmLevel;
    }

    public void setGsmLevel(Integer gsmLevel) {
        this.gsmLevel = gsmLevel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LocationMessage that = (LocationMessage) o;
        return Objects.equals(dateTime, that.dateTime) &&
               Objects.equals(longitude, that.longitude) &&
               Objects.equals(latitude, that.latitude) &&
               Objects.equals(altitude, that.altitude) &&
               Objects.equals(angle, that.angle) &&
               Objects.equals(satellites, that.satellites) &&
               Objects.equals(speed, that.speed) &&
               Objects.equals(digitalInputStatus1, that.digitalInputStatus1) &&
               Objects.equals(digitalInputStatus2, that.digitalInputStatus2) &&
               Objects.equals(analogInput1, that.analogInput1) &&
               Objects.equals(gsmLevel, that.gsmLevel);
    }

    @Override
    public int hashCode() {
        //noinspection ObjectInstantiationInEqualsHashCode
        return Objects.hash(dateTime, longitude, latitude, altitude, angle, satellites, speed,
                digitalInputStatus1, digitalInputStatus2, analogInput1, gsmLevel);
    }

    @Override
    public String toString() {
        return "LocationMessage{" +
               "dateTime=" + dateTime +
               ", longitude=" + longitude +
               ", latitude=" + latitude +
               ", altitude=" + altitude +
               ", angle=" + angle +
               ", satellites=" + satellites +
               ", speed=" + speed +
               ", digitalInputStatus1=" + digitalInputStatus1 +
               ", digitalInputStatus2=" + digitalInputStatus2 +
               ", analogInput1=" + analogInput1 +
               ", gsmLevel=" + gsmLevel +
               '}';
    }


}

