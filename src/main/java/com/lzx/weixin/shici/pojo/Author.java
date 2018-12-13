package com.lzx.weixin.shici.pojo;

import java.util.*;
import java.sql.*;
import java.util.Date;

@SuppressWarnings("unused")
public class Author {
    private Integer id;
    private String dynasty;
    private String name;
    private String describe;
    

    public Integer getId() {
    
        return this.id;
    }
    public void setId(Integer id) {
    
        this.id = id;
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
    public String getDescribe() {
    
        return this.describe;
    }
    public void setDescribe(String describe) {
    
        this.describe = describe;
    }

}