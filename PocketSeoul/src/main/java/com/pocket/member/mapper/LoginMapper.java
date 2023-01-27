package com.pocket.member.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


@Mapper
public interface LoginMapper {
	
	
	
	//id로 유저 유무 체크
    public int CheckById(@Param("id") Long id);
    // 회원가입 
    public int SignUp(@Param("id") Long id, @Param("email") String email, @Param("nickname") String nickname);

  
}
