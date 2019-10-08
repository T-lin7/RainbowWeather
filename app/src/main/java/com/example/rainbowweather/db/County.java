package com.example.rainbowweather.db;

import org.litepal.crud.DataSupport;

public class County extends DataSupport {
    private  int id;
    private  int weatherId;
    private  String countyName;
    private  int cityId;

    public int getId() {
        return id;
    }

    public int getWeatherId() {
        return weatherId;
    }

    public String getCountyName() {
        return countyName;
    }

    public int getCityId() {
        return cityId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setWeatherId(int weatherId) {
        this.weatherId = weatherId;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
