package com.example.pocketshop;

public class Item {

    private String id;
    private String unitsSold;
    private String percentChange;
    private String description;

    public Item(String id, String unitsSold, String percentChange, String description) {
        this.id = id;
        this.unitsSold = unitsSold;
        this.percentChange = percentChange;
        this.description = description;
    }

    public String getName() {
        return id;
    }

    public void setName(String name) {
        this.id = name;
    }

    public String getUnitsSold() {
        return unitsSold;
    }

    public void setUnitsSold(String unitsSold) {
        this.unitsSold = unitsSold;
    }

    public String getPercentChange() {
        return percentChange;
    }

    public void setPercentChange(String percentChange) {
        this.percentChange = percentChange;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
