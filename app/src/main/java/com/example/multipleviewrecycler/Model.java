package com.example.multipleviewrecycler;

public class Model {
    String name,date,desc,modeltype;

    public Model(String name,String date, String desc, String modeltype) {
        this.name=name;
        this.date = date;
        this.desc = desc;
        this.modeltype = modeltype;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getModeltype() {
        return modeltype;
    }

    public void setModeltype(String modeltype) {
        this.modeltype = modeltype;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
