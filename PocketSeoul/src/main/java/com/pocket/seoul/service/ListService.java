package com.pocket.seoul.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.pocket.member.entity.Mark;
import com.pocket.seoul.entity.Lh;
import com.pocket.seoul.entity.YouthCenter;

@Component @Service
public class ListService {
	
	crawlerex cwlex = new crawlerex();
	
	// 전체 게시글 list, 북마크 리스트
	public List<Mark> makeList() throws IOException{
		
		List<Mark> listYS = cwlex.getyth();
		List<Mark> listSH = cwlex.getSh();
		List<Mark> listLh = cwlex.getLh();
		List<Mark> listYC = cwlex.getYouthCenter();


		ArrayList<Mark> list = new ArrayList<>();
		
		for(Mark i : listYS) {
			list.add(i);
		}
		
		for(Mark i : listSH) {
			list.add(i);
		}
		
		for(Mark i : listYC) {
			list.add(i);
		}
		
		for(Mark i : listLh) {
			list.add(i);
		}
		
		
		System.out.println(list);
		return list;
	}


	public int[] makeIndex() {
		int arr[] = new int[100];
		return arr;
	}
	
}
