package com.lzx.weixin.shici.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.lzx.weixin.shici.pojo.Shici;
import com.lzx.weixin.shici.service.ShiciService;

@RestController
@RequestMapping("/shici")
public class ShiciController {
	
	@Autowired
	private ShiciService shiciService;
	
	@RequestMapping(value="/list")
	@ResponseBody
	public JSONObject list(String key,@RequestParam(defaultValue="1")Integer page,@RequestParam(defaultValue="15")Integer pageSize) {
		List list=shiciService.list(key, page, pageSize);
		JSONObject o=new JSONObject();
		int totalCount=shiciService.count(key, page, pageSize);
		o.put("totalCount", totalCount);
		o.put("page", page);
		o.put("pageSize", pageSize);
		o.put("data", list);
		if(page*pageSize>=totalCount) {
			o.put("isEnded",true);
		}else{
			o.put("isEnded",false);
		}
		return o;
		
	}
	@RequestMapping(value="/detail")
	@ResponseBody
	public Shici detail(Integer id) {
		if(id!=null) {
			return shiciService.detail(id);
		}
		return new Shici();
	}
	
	

}
