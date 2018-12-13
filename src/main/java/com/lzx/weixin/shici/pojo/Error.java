package com.lzx.weixin.shici.pojo;

import java.util.*;
import java.sql.*;
import java.util.Date;

@SuppressWarnings("unused")
public class Error {
    private Integer id;
    private String url;
    

    public Integer getId() {
    
        return this.id;
    }
    public void setId(Integer id) {
    
        this.id = id;
    }
    public String getUrl() {
    
        return this.url;
    }
    public void setUrl(String url) {
    
        this.url = url;
    }

}