package com.pocket.member.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component @Service
public class MemberService {

	// 세션추가
	public void session(HttpServletRequest reqeust, Long id) {
		
		HttpSession session = reqeust.getSession();
		Long userid = id;
		session.setAttribute("userid", userid);
		
	}
}
