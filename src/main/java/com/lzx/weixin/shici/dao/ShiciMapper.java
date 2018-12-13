package com.lzx.weixin.shici.dao;

import com.lzx.weixin.shici.pojo.*;
import java.util.*;
import java.sql.*;

@SuppressWarnings("unused")
public interface ShiciMapper {

	public Shici get(Integer id);
    
    public void set(Shici obj);
    
    public void add(Shici obj);
    
    public void remove(Integer id);
    
    public List<Shici> list(Map<String, Object> params);
    
    public Integer count(Map<String, Object> params);
    
    public List<Shici> list2(Map<String, Object> params);
    
    public Integer count2(Map<String, Object> params);
    
}