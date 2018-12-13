package com.lzx.weixin.shici.dao;

import com.lzx.weixin.shici.pojo.*;
import java.util.*;
import java.sql.*;

@SuppressWarnings("unused")
public interface AuthorMapper {
public Author get(Integer id);
    
    public void set(Author obj);
    
    public void add(Author obj);
    
    public void remove(Integer id);
    
    public List<Author> list(Map<String, Object> params);
    
    public Integer count(Map<String, Object> params);
    
}