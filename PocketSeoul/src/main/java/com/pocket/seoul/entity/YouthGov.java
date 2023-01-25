package com.pocket.seoul.entity;

import lombok.Data;

@Data
public class YouthGov extends Unit {

	private String title;
	private String date;
	private String url;
	
	public YouthGov(String title, String url) {
		super();
		this.title = title;
		this.url = url;
	}

	public YouthGov() {
		super();
		// TODO Auto-generated constructor stub
	}

	public YouthGov(String titleStr) {
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
