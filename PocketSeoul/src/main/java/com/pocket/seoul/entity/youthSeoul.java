package com.pocket.seoul.entity;

import lombok.Data;


@Data
public class youthSeoul extends Unit {
	
	private String title;
//	private String date;
	private String url;
	
	public youthSeoul(String title,  String url) {
	
		this.title = title;
		//this.date = date;
		this.url = url;
	}
	
	

	 public youthSeoul(String title){
		 this.title = title; 
		 //this.url = url; 
		 }
	 






	public youthSeoul() {
		
		// TODO Auto-generated constructor stub
	}
	
	
	

}
