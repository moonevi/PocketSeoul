package com.pocket.seoul.entity;

import lombok.Data;

@Data
public class Lh extends Unit {

	private String title;
	private String date;
	private String url;
	
	public Lh(String title, String url) {
		this.title = title;
		this.url = url;
	}
	
	public Lh(String title) {
		this.title = title;
		
	}

	@Override
	public String toString() {
		return "Lh [title=" + title + ", date=" + date + ", url=" + url + "]";
	}

	public Lh() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
