package com.pocket.member.entity;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data @Component
public class User {
	private Long id;
	private String email;
	
	private String nickname;
}
