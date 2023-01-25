package com.pocket.bookmark.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.ParameterizedPreparedStatementSetter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pocket.bookmark.mapper.bookmarkMapper;
import com.pocket.member.entity.Mark;
import com.pocket.seoul.service.ListService;

@Controller
public class bookmarkController {
	// 
	@Autowired
	bookmarkMapper bookmark;
	@RequestMapping("/bookmark")
	public void makeMark(@RequestParam("site") String site , @RequestParam("num") String num, HttpServletRequest reqeust) throws IOException {
		System.out.println(site); // one
		System.out.println(num); // 1 
		
		// one1-> one => list[1]
		// two1 -> two => 5~9 list[5+1] 
		
		//
		ListService listservice = new ListService();
		List<Mark> list = new ArrayList<>();
		
		list = listservice.makeList();
		int number = Integer.parseInt(num);
		// System.out.println(list.get(number)); // title date url 나옴
		
		// 이걸 북마크에 insert 
		
		HttpSession session = reqeust.getSession();
		Long userid = (Long) session.getAttribute("userid");
		// title 비교해서 이미 있는지 아닌지 비교 

		if( site == "two") {
			number += 5;
		}else if( site == "three") {
			number += 10;
		}else if( site == "four") {
			number += 15;
		}
		
		String title = list.get(number).getTitle();
		String date = list.get(number).getDate();
		String url = list.get(number).getUrl();
		
		bookmark.insertList(title, date, url, userid);
		
		
	}
	
	@RequestMapping(value = {"/login/deletemark"})
	public void deleteMark(@RequestParam("index") String index,  HttpServletRequest reqeust) {
		System.out.println("deletet");
		System.out.println(index);
		
		HttpSession session = reqeust.getSession();
		Long userid = (Long) session.getAttribute("userid");
		// userid =    조건이랑 추가 
		int num = Integer.parseInt(index) +1;
		// 1을 받아와서 해당 행 삭제 
		bookmark.deleteList(num, userid);
	}
}