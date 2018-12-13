package com.lzx.weixin.shici.pojo;

import java.util.*;
import java.sql.*;
import java.util.Date;

@SuppressWarnings("unused")
public class Shici {
    private Integer id;
    private String annotation;
    private String author;
    private String atlas;
    private String introduce;
    private String ownform;
    private String appreciation;
    private String url;
    private String moral;
    private String dynasty;
    private String name;
    private String shichi;
    private String transfor;
    

    public Integer getId() {
    
        return this.id;
    }
    public void setId(Integer id) {
    
        this.id = id;
    }
    public String getAnnotation() {
    
        return this.annotation;
    }
    public void setAnnotation(String annotation) {
    
        this.annotation = annotation;
    }
    public String getAuthor() {
    
        return this.author;
    }
    public void setAuthor(String author) {
    
        this.author = author;
    }
    public String getAtlas() {
    
        return this.atlas;
    }
    public void setAtlas(String atlas) {
    
        this.atlas = atlas;
    }
    public String getIntroduce() {
    
        return this.introduce;
    }
    public void setIntroduce(String introduce) {
    
        this.introduce = introduce;
    }
    public String getOwnform() {
    
        return this.ownform;
    }
    public void setOwnform(String ownform) {
    
        this.ownform = ownform;
    }
    public String getAppreciation() {
    
        return this.appreciation;
    }
    public void setAppreciation(String appreciation) {
    
        this.appreciation = appreciation;
    }
    public String getUrl() {
    
        return this.url;
    }
    public void setUrl(String url) {
    
        this.url = url;
    }
    public String getMoral() {
    
        return this.moral;
    }
    public void setMoral(String moral) {
    
        this.moral = moral;
    }
    public String getDynasty() {
    
        return this.dynasty;
    }
    public void setDynasty(String dynasty) {
    
        this.dynasty = dynasty;
    }
    public String getName() {
    
        return this.name;
    }
    public void setName(String name) {
    
        this.name = name;
    }
    public String getShichi() {
    
        return this.shichi;
    }
    public void setShichi(String shichi) {
    
        this.shichi = shichi;
    }
    public String getTransfor() {
    
        return this.transfor;
    }
    public void setTransfor(String transfor) {
    
        this.transfor = transfor;
    }

}