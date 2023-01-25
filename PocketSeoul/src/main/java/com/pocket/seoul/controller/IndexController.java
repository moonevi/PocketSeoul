package com.pocket.seoul.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.ParseConversionEvent;

import org.jsoup.nodes.Element;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pocket.seoul.service.ListService;
import com.pocket.seoul.service.crawler;
import com.pocket.seoul.service.crawler.*;
import com.pocket.seoul.service.crawlerex;
import com.pocket.member.entity.Bookmark;
import com.pocket.member.entity.Mark;
import com.pocket.member.entity.Site;
import com.pocket.member.mapper.LoginMapper;
import com.pocket.member.service.LoginService;
import com.pocket.member.service.MainService;
import com.pocket.seoul.entity.Lh;
import com.pocket.seoul.entity.Sh;
import com.pocket.seoul.entity.Unit;
import com.pocket.seoul.entity.YouthCenter;
import com.pocket.seoul.entity.youthSeoul;

@Controller
public class IndexController {
	
	@Autowired
	MainService mainservice;
	LoginMapper loginmapper;
	
	
	
	@RequestMapping(value = {"/"})
	public String mainList(Model model) throws IOException{
		
		ListService listservice = new ListService();
		List<Mark> list = new ArrayList<>();
		int arr[];
		
		list = listservice.makeList();
		arr = listservice.makeIndex();
	
		model.addAttribute("arr", arr);
		model.addAttribute("list", list);
		

		return "AllPage1";
	}
	
	@RequestMapping(value = {"/allPage2"})
	public String allPagetwo(Model model) throws IOException{
		
		ListService listservice = new ListService();
		List<Mark> list = new ArrayList<>();
		int arr[];
		
		list = listservice.makeList();
		arr = listservice.makeIndex();
	
		model.addAttribute("arr", arr);
		model.addAttribute("list", list);
		

		return "AllPage2";
	}
	

	

}
