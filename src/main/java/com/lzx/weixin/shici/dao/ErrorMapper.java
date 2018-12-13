package com.lzx.weixin.shici.dao;

import com.lzx.weixin.shici.pojo.*;
import com.lzx.weixin.shici.pojo.Error;

import java.util.*;
import java.sql.*;

@SuppressWarnings("unused")
public interface ErrorMapper {

	public Error get(Integer id);
    
    public void set(Error obj);
    
    public void add(Error obj);
    
    public void remove(Integer id);
    
    public List<Error> list(Map<String, Object> params);
    
    public Integer count(Map<String, Object> params);
    
}