package com.alina.homework34;

import java.io.Serializable;

public class Continent implements Serializable {
    private String name;
    private  String country;
    private String picture;


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;

    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }



    public Continent(String name, String country,String picture) {
        this.name = name;
        this.country=country;
        this.picture=picture;

    }
}
