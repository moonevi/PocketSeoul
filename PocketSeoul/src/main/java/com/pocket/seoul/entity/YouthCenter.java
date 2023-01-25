package com.pocket.seoul.entity;

import lombok.Data;

@Data
public class YouthCenter extends Unit {

	private String title;
	private String date;
	private String url;
	
	public YouthCenter(String title) {
		this.title = title;
	}

	public YouthCenter() {
		
	}
	
	
	
	
}
