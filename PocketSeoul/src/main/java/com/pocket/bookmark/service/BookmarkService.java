package com.pocket.bookmark.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.pocket.bookmark.mapper.bookmarkMapper;
import com.pocket.member.entity.Mark;

@Component @Service
public class BookmarkService {
	
	private bookmarkMapper bookmark;
	
	@Autowired
	public BookmarkService(bookmarkMapper bookmark) {
		this.bookmark = bookmark;
		
	}
	
	public int makeBmark(List<Mark> list, int number, Long userid) {
		
		String title = list.get(number).getTitle();
		String date = list.get(number).getDate();
		String url = list.get(number).getUrl();
		
		int result = bookmark.insertList(title, date, url, userid);
		
		return result;
	}
	

}
