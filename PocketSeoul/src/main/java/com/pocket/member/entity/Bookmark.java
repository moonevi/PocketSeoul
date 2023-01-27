package com.pocket.member.entity;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
@AllArgsConstructor @Data
public class Bookmark {

	private int bm_id;
	private Long user_id;
	private String bm_title;
	private String bm_url;
	private String bm_date;
	private String bm_memo;

}
