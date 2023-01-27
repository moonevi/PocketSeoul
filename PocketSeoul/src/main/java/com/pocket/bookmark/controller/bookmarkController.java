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
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pocket.bookmark.mapper.bookmarkMapper;
import com.pocket.bookmark.service.BookmarkService;
import com.pocket.member.entity.Mark;
import com.pocket.member.service.MemberService;
import com.pocket.seoul.service.ListService;

@Controller
public class bookmarkController {
		
	private bookmarkMapper bookmark;
	private ListService listservice;
	private BookmarkService bookmarkservice;
	
	@Autowired
	public bookmarkController(ListService listservice, bookmarkMapper bookmark, BookmarkService bookmarkservice) {
		this.bookmark = bookmark;
		this.listservice = listservice;
		this.bookmarkservice = bookmarkservice;
	}
	
	// 북마크 생성
	@ResponseBody
	@RequestMapping("/bookmark")
	public int makeMark(@RequestParam("site") String site , @RequestParam("num") String num, HttpServletRequest request) throws IOException {
		
		int number = Integer.parseInt(num);

		List<Mark> list = new ArrayList<>();
		
		list = listservice.makeList();
		
		// 접속 중인 userid 불러오기
		HttpSession session = request.getSession();
		Long userid = (Long) session.getAttribute("userid");
		

		if( site.equals("two") ) {
			number += 5;
		}else if( site.equals("thr") ) {
			number += 10;
		}else if( site.equals("fou") ) {
			number += 15;
		}
		

		int result = bookmarkservice.makeBmark(list, number, userid);
		
		return result;
		
		
	}
	
	// 북마크 삭제
	@ResponseBody
	@RequestMapping(value = {"/deletemark"})
	public int deleteMark(@RequestParam("index") String index,  HttpServletRequest reqeust) {
	
		int number = Integer.parseInt(index);
		int num = number + 1;
		
		HttpSession session = reqeust.getSession();
		Long userid = (Long) session.getAttribute("userid");
		
		// 해당 북마크 삭제
		int result = bookmark.deleteList(num, userid);

		return result;
	}
}