package com.squaregps.interview;

import java.time.ZonedDateTime;
import java.util.Objects;

/**
 * Геолокационное сообщение, полученное с устройства (GPS-маячок или иное).
 * {@code null} в поле означает отсутствие данных во входящем сообщении.
 */
public class LocationMessage {

    /**
     * Время отправки сообщения (Timestamp) или фиксации координат, UTC+0
     */
    private ZonedDateTime dateTime;

    /**
     * Долгота, градусы
     */
    private Double longitude;

    /**
     * Широта, градусы
     */
    private Double latitude;

    /**
     * Высота, м
     */
    private Integer altitude;

    /**
     * Азимут, градусы
     */
    private Integer angle;

    /**
     * Количество спутников
     */
    private Integer satellites;

    /**
     * Скорость, км/ч
     */
    private Integer speed;

    /**
     * Состояние дискретного входа 1
     */
    private Boolean digitalInputStatus1;

    /**
     * Состояние дискретного входа 2
     */
    private Boolean digitalInputStatus2;

    /**
     * Напряжение на аналоговом входе 1, В
     */
    private Double analogInput1;

    /**
     * Уровень сигнала GSM, 1-5
     */
    private Integer gsmLevel;

    public ZonedDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(ZonedDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Integer getAltitude() {
        return altitude;
    }

    public void setAltitude(Integer altitude) {
        this.altitude = altitude;
    }

    public Integer getAngle() {
        return angle;
    }

    public void setAngle(Integer angle) {
        this.angle = angle;
    }

    public Integer getSatellites() {
        return satellites;
    }

    public void setSatellites(Integer satellites) {
        this.satellites = satellites;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    public Boolean getDigitalInputStatus1() {
        return digitalInputStatus1;
    }

    public void setDigitalInputStatus1(Boolean digitalInputStatus1) {
        this.digitalInputStatus1 = digitalInputStatus1;
    }

    public Boolean getDigitalInputStatus2() {
        return digitalInputStatus2;
    }

    public void setDigitalInputStatus2(Boolean digitalInputStatus2) {
        this.digitalInputStatus2 = digitalInputStatus2;
    }

    public Double getAnalogInput1() {
        return analogInput1;
    }

    public void setAnalogInput1(Double analogInput1) {
        this.analogInput1 = analogInput1;
    }

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

