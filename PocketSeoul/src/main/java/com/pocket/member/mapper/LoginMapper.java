package com.pocket.member.mapper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.pocket.member.entity.Bookmark;
import com.pocket.member.entity.Site;
import com.pocket.member.entity.User;

@Mapper
public interface LoginMapper {
	
	
	
	  //id로 유저 유무 체크
    public int CheckById(@Param("id") Long id);
    // 회원가입 
    public int SignUp(@Param("id") Long id, @Param("email") String email, @Param("nickname") String nickname);
    // id로 북마크 사이트명 가져오기
    public ArrayList Checkmark(Long id);
    // site 객체 만들기 
    public Site makeMark(String title);
  
}
