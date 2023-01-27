package com.pocket.member.controller;


import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.pocket.bookmark.entity.Bookmark;
import com.pocket.bookmark.mapper.bookmarkMapper;
import com.pocket.member.entity.KakaoToken;
import com.pocket.member.entity.User;
import com.pocket.member.service.KakaoService;
import com.pocket.member.service.LoginService;
import com.pocket.member.service.MemberService;
import com.pocket.seoul.service.ListService;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@Controller
public class MemberController {
	
	 @Autowired
	 private KakaoService kakaoService;
	 private MemberService memservice;
	 private bookmarkMapper bookmapper;
	 private LoginService loginService;
	
	
	 public MemberController(LoginService loginService, bookmarkMapper bookmapper, MemberService memservice) {
	        this.loginService = loginService;
	        this.bookmapper = bookmapper;
	        this.memservice = memservice;
	    }

	 	//login 페이지 mapping
	    @RequestMapping("/login")
	    public String loginPage(){
	    	
	        return "LoginMain";
	    }
	    
	    //redirect 경로 mapping
	    @RequestMapping("/login/kakao-redirect")
	    public String kakaoLogin(@RequestParam(value = "code",required = false) String code, Model model, HttpServletRequest request){
	    	
	    	if(code!=null){
	            System.out.println("code = " + code);

	            //추가됨: 카카오 토큰 요청
	            KakaoToken kakaoToken = loginService.requestToken(code);
	            	
	         log.info("kakoToken = {}", kakaoToken);
	         
	         	//추가됨: 유저정보 요청
	            User user = loginService.requestUser(kakaoToken.getAccess_token());
	            log.info("user = {}",user);
	            
	            //userid가 DB에 없으면 회원가입
	            loginService.findUser(user.getId(), user.getEmail(), user.getNickname());
	   
	            Long id = user.getId();
	            System.out.println(id);
		        
		        memservice.session(request, id);
				
		        return "redirect:/mypage"; 
	
	        }
	        
	     
	        
	        return "MyPage"; //만들어둔 응답받을 View 페이지 redirectPage.html 리턴
	    }
	 
	    
	    @RequestMapping("/logout")
	    public String logput(HttpServletRequest reqeust){
	    	
	    	HttpSession session = reqeust.getSession();
	    	session.invalidate();
	    	
	        return "redirect:/";
	    }
	    
	    
	    @RequestMapping("/mypage")
	    public String mypage(HttpServletRequest request, Model model){
	    
	    	HttpSession session = request.getSession(false);	
	    	
			if(session == null) {
				
				return "LoginMain";
				
	    	}else { // 로그인 중
	    		
	    		Long userid = (Long) session.getAttribute("userid");
	    		List<Bookmark> list = bookmapper.showList(userid);
		        model.addAttribute("list", list);    
		       
	    	}
	    	
	    	
	        return "MyPage";
	    }
	    
	}
