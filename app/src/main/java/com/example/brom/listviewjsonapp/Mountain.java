package com.example.brom.listviewjsonapp;

import java.util.ArrayList;

public class Mountain {
    private int id, size, cost;
    private String name, type, company, location, category;

    public Mountain(int id, int size, int cost, String name, String type, String company, String location, String category) {
        this.id = id;
        this.size = size;
        this.cost = cost;
        this.name = name;
        this.type = type;
        this.company = company;
        this.location = location;
        this.category = category;
    }

    public Mountain(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getToastInformation() {
        return "You've clicked on " + name + " which is located in " + location + " and is " + size + " meters tall!";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
