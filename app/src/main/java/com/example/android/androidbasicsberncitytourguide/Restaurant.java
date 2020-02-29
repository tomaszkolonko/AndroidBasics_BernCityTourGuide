package com.example.android.androidbasicsberncitytourguide;

public class Restaurant {
    private String name;
    private String adress;
    private String phone;
    private String email;
    private int imageResource;

    public Restaurant(String name, String adress, String phone, String email) {
        this.name = name;
        this.adress = adress;
        this.phone = phone;
        this.email = email;
        //this.imageResource = imageResource;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getImageResource() {
        return imageResource;
    }

    public void setImageResource(int imageResource) {
        this.imageResource = imageResource;
    }
}
