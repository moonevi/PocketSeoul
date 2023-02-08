package com.pocket.member.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.pocket.member.entity.KakaoToken;
import com.pocket.member.entity.User;

@Component @Service
public class MemberService {

	// 세션추가
	public void session(HttpServletRequest request, Long id, String accesstoken) {
		
		HttpSession session = request.getSession();
		Long userid = id;
		String access_token = accesstoken;
		session.setAttribute("userid", userid);
		session.setAttribute("access_token", access_token);
		
	}
	
	public long getid(HttpServletRequest request) {
		
		  HttpSession session = request.getSession();
		  Long userid = (Long)session.getAttribute("userid");
		  return userid;
	}
	

}
