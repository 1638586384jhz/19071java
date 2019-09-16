package cn.itcast.ssm.controller;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import cn.itcast.ssm.pojo.Item;
import cn.itcast.ssm.service.ItemService;

@Controller
public class ItemController {
	@Autowired
	private ItemService itemService;
	@RequestMapping("/itemList.action")
	public ModelAndView queryItemList() {
		System.out.println("controll启动成功");
		  List<Item> items=itemService.queryItemList();
		  ModelAndView modelAndView=new ModelAndView();
		  modelAndView.setViewName("itemList"); 
		  modelAndView.addObject("itemList",items);
		return modelAndView;
	}
	@RequestMapping("/itemEdit.action")
	public ModelAndView queryItemEdit(int id) {
		Item item=itemService.selectItemEdit(id);
		 ModelAndView modelAndView=new ModelAndView();
		 modelAndView.setViewName("editItem");
		 modelAndView.addObject("item",item);
		return modelAndView;
		
	}
	@RequestMapping("/itemUpdate.action")
	public ModelAndView updateItem(Item item,MultipartFile pictureFile) throws IllegalStateException, IOException {
		String picName=UUID.randomUUID().toString();
		String oriName=pictureFile.getOriginalFilename();
		String extName=oriName.substring(oriName.lastIndexOf("."));
		pictureFile.transferTo(new File("F:\\Program Files\\sts\\SSM\\SpringMvcAndMybatis\\WebContent\\pic\\"+picName+extName));
		item.setPic(picName+extName);
		itemService.updateItem(item);
		System.out.println(item);
		/*
		 * System.out.println(item); ModelAndView modelAndView=new ModelAndView();
		 * modelAndView.setViewName("editItem"); modelAndView.addObject("item",item);
		 */

		  List<Item> items=itemService.queryItemList();
		  ModelAndView modelAndView=new ModelAndView();
		  modelAndView.setViewName("itemList"); 
		  modelAndView.addObject("itemList",items);
		return modelAndView;
		
	}
}
