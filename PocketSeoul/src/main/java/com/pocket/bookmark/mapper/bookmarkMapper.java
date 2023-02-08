package com.pocket.bookmark.mapper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.pocket.bookmark.entity.Bookmark;
import com.pocket.seoul.entity.Unit;

@Mapper
public interface bookmarkMapper {

	// 현재 사이트 리스트 저장 
	public int insertList(@Param("title") String title, @Param("date") String date, @Param("url") String url, @Param("userid") Long userid);

	// 북마크 리스트
	public List<Bookmark> showList(@Param("userid") Long userid);
	
	// 북마크 삭제
	public int deleteList(@Param("num") int num, @Param("userid") Long userid);
	
	// 북마크 나에게 보내기
	public Bookmark sendBookmark(@Param("num") int numer, @Param("userid") Long userid);
}
