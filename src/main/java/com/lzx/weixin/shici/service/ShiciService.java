package com.lzx.weixin.shici.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.lzx.weixin.shici.dao.ShiciMapper;
import com.lzx.weixin.shici.pojo.Shici;

@Service
public class ShiciService {

	@Autowired
	private ShiciMapper shiciMapper;
	public List list(String key,Integer page,Integer pageSize) {
		Map<String,Object> params=new HashMap<String,Object>();
		if(!StringUtils.isEmpty(key)) {
			params.put("key", "%"+key+"%");
		}
		if(pageSize!=null) {
			pageSize=15;
			params.put("pageSize", pageSize);
		}
		if(page!=null) {
			int start=(page-1)*pageSize+1;
			params.put("pageStartPos", start);
		}
		
		return  shiciMapper.list2(params);
	}
	
	public int count(String key,Integer page,Integer pageSize) {
		Map<String,Object> params=new HashMap<String,Object>();
		if(!StringUtils.isEmpty(key)) {
			params.put("key", "%"+key+"%");
		}
		
		return  shiciMapper.count2(params);
	}
	
	public Shici detail(Integer id) {
		return  shiciMapper.get(id);
	}
}
