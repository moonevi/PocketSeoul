package com.pocket.member.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.pocket.member.entity.Bookmark;
import com.pocket.member.mapper.LoginMapper;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component @Service
public class MainService {
	@Autowired
	LoginMapper loginmapper;

	public ArrayList<String> checkMark(Long id) {
		System.out.println("checkmark");
		System.out.println(id);
		ArrayList<String> list = new ArrayList<String>();
	//	list.add(loginmapper.Checkmark(id));
		// 2 -> site id가 2인 사이트 제목을 뿌린다. 
		System.out.println("cheeck");
		return list;
	}
}
