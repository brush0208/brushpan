package org.brush.manage.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import org.brush.manage.pojo.ItemCat;
import org.brush.manage.service.ItemCatService;

@Controller
public class ItemCatController {
	@Autowired
	private ItemCatService itemCatService;
	
	//查询分类表的所有数据，返回json
	@RequestMapping("/itemcat/all")
	@ResponseBody	//会自动转换当前的java对象为json字符串，背后ObjectMapper，fastxml，jackjson
	public List<ItemCat> queryAll(){
		List<ItemCat> itemCatList = itemCatService.queryAll();
		return itemCatList;
	}
	
}
