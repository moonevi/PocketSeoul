package com.pocket.member.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pocket.bookmark.entity.Bookmark;
import com.pocket.bookmark.mapper.bookmarkMapper;
import com.pocket.member.entity.KakaoToken;
import com.pocket.member.entity.Member;
import com.pocket.member.entity.User;
import com.pocket.member.service.KakaoService;
import com.pocket.member.service.LoginService;
import com.pocket.member.service.MemberService;
import com.pocket.seoul.entity.Unit;
import com.pocket.seoul.service.ListService;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@Controller
public class MemberController {//?
	 private KakaoService kakaoService;
	 private final LoginService loginService;
	 MemberService memservice = new MemberService();
	 @Autowired
	 bookmarkMapper bookmapper;
	 
	 public MemberController(LoginService loginService) {
	        this.loginService = loginService;
	    }

	//login 페이지 mapping
	    @RequestMapping("/login")
	    public String loginPage(){
	    	System.out.println("login");
	        return "LoginMain";
	    }
	    
	    //redirect 경로 mapping
	    @RequestMapping("/login/kakao-redirect")
	    public String kakaoLogin(@RequestParam(value = "code",required = false) String code, Model model, HttpServletRequest reqeust){
	    	ListService listservice = new ListService();
	    	
	    	if(code!=null){
	            System.out.println("code = " + code);

	             //추가됨: 카카오 토큰 요청
	            KakaoToken kakaoToken = loginService.requestToken(code);
	            	
	         log.info("kakoToken = {}", kakaoToken);
	         
	         //추가됨: 유저정보 요청
	            User user = loginService.requestUser(kakaoToken.getAccess_token());
	            log.info("user = {}",user);
	            
	            System.out.println("email " + user.getEmail());
	            System.out.println("name " + user.getNickname());
	            System.out.println("id " + user.getId());
	         
	            //user id가 db상 id에 없다면 -> db 에 인서트 
	            // 위 객체로 user 만들기 
	            int result = loginService.findUser(user.getId(), user.getEmail(), user.getNickname());
	   
	            model.addAttribute("user", user);
	            
	            Long id = user.getId();
		        // 세션 추가 
		       memservice.session(reqeust, id);
		        List<Bookmark> list = bookmapper.showList(id);
		        System.out.println(list);
		        model.addAttribute("list", list);
		        
		        int arr[];
		        arr = listservice.makeIndex();
		        model.addAttribute("arr", arr);
	        }
	        
	     
	        
	        return "MyPage"; //만들어둔 응답받을 View 페이지 redirectPage.html 리턴
	    }
	 
	}
