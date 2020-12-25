package com.hgx.entity;

public class Area {
    private int id;
    private String name;
private String Weather_id;

    public Area() {
    }

    public String getWeather_id() {
        return Weather_id;
    }

    public void setWeather_id(String weather_id) {
        Weather_id = weather_id;
    }

    public Area(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Area{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
