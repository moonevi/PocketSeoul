package com.pocket.member.entity;

import lombok.Data;

@Data
public class Mark {

	private String title;
	private String url;
	private String date;

	public Mark(String title, String url, String date) {
		
		this.title = title;
		this.url = url;
		this.date = date;
	}

	public Mark() {
		// TODO Auto-generated constructor stub
	}
	
	
}
