package com.pocket.bookmark.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.pocket.bookmark.entity.Bookmark;
import com.pocket.bookmark.mapper.bookmarkMapper;
import com.pocket.member.entity.Mark;

@Component @Service
public class BookmarkService {
	
	private bookmarkMapper bookmarkmapper;
	
	@Autowired
	public BookmarkService(bookmarkMapper bookmarkmapper) {
		this.bookmarkmapper = bookmarkmapper;
		
	}
	
	public int makeBmark(List<Mark> list, int number, Long userid) {
		
		String title = list.get(number).getTitle();
		String date = list.get(number).getDate();
		String url = list.get(number).getUrl();
		
		int result = bookmarkmapper.insertList(title, date, url, userid);
		
		return result;
	}
	
	public Bookmark sendBmark(int number, Long userid) {
		
		Bookmark bookmark1 = bookmarkmapper.sendBookmark(number, userid);
	
		return bookmark1;
	}

}
