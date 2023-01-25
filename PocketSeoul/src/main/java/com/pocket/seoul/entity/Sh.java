package com.pocket.seoul.entity;

import lombok.Data;

@Data
public class Sh extends Unit{

	private String title;
	private String date;
	private String url;
	
	
	public Sh(String title, String date, String url) {
		this.title = title;
		this.date = date;
		this.url = url;
	}
	


	public Sh(String title, String url) {
		this.url = url;
		this.title = title;
	}

	public Sh() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
