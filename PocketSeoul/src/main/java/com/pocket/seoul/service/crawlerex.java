package com.pocket.seoul.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.pocket.member.entity.Mark;
import com.pocket.seoul.entity.Lh;
import com.pocket.seoul.entity.Sh;
import com.pocket.seoul.entity.YouthCenter;
import com.pocket.seoul.entity.youthSeoul;

public class crawlerex {

	  
		public List<Mark> getyth() throws IOException{
		
			List<Mark> list = new ArrayList<>();
			
			Document doc = Jsoup.connect("https://youth.seoul.go.kr/site/main/board/notice/list?baCategory1=basic&baCommSelec=true").get();
			Elements titles =  doc.getElementsByAttributeValue("class", "tlt");
			Elements url = doc.select(".tlt a");
			
			for (int i = 0; i < 5; i++) {
	            Element title = titles.get(i);
	            Element urls = url.get(i);
	            
	            String titleStr = title.text();
	            String urlStr = urls.attr("abs:href");
	            String dateStr = "날짜";
	            
	            Mark mark = new Mark(titleStr, urlStr, dateStr);

	            list.add(mark);
	        }
				return list;
		}
		
		public List<Mark> getSh() throws IOException{
			
			List<Mark> list = new ArrayList<>();
			
			Document doc = Jsoup.connect("https://www.i-sh.co.kr/main/lay2/program/S1T294C295/www/brd/m_241/list.do").get();
			Elements titles =  doc.getElementsByAttributeValue("class", "txtL");
			Elements url = doc.select(".txtL a");
			for (int i = 0; i < 5; i++) {
				 Element title = titles.get(i);
				 Element urls = url.get(i);
				 
				 String titleStr = title.text();
				 String urlStr = urls.attr("abs:href");
				 String dateStr = "날짜";
				 
				 Mark mark = new Mark(titleStr, urlStr, dateStr);

				 
				 // url 절대값 안넘어감 list->view로 바꿔야 됨
				 list.add(mark);
			}
			System.out.println(list);
			return list;
		}
		
		public List<Mark> getLh() throws IOException{
			
			List<Mark> list = new ArrayList<>();
			// System.out.println("LH");
			Document doc = Jsoup.connect("https://www.lh.or.kr/bbs/list.do?sCode=user&mId=633&mPid=26&bbsSeq=&nttSeq=").get();
			Elements titles =  doc.getElementsByAttributeValue("class", "subject");
			// Elements titles = doc.select(".notice_web li a");
		//	System.out.println(titles);
			// Elements url = doc.select(".txtL a");
			for (int i = 0; i < 5; i++) {
				 Element title = titles.get(i);
			
				 
				 String titleStr = title.text();
				 String urlStr = ("url");
				 String dateStr = "날짜";
				 
				 Mark mark = new Mark(titleStr, urlStr, dateStr);

				 
				 // url 절대값 안넘어감 list->view로 바꿔야 됨
				 list.add(mark);
			}
			System.out.println(list);
			return list;
		}
		
		public List<Mark> getYouthCenter() throws IOException{	
			List<Mark> list = new ArrayList<>();
			
			Document doc = Jsoup.connect("https://www.youthcenter.go.kr/jynTips/jynTipsEachList.do?categoryCode=0004&pageIndex=1&tipsId=&actionFlag=&srchKeyAll=&srchValueAll=&srchSortOrder=4&srchKeyEach=&srchValueEach=").get();
			Elements titles =  doc.getElementsByAttributeValue("class", "txt");
			for (int i = 0; i < 5; i++) {
				 Element title = titles.get(i);
			
				 
				 String titleStr = title.text();
				 String urlStr = ("url");
				 String dateStr = "날짜";
				 
				 Mark mark = new Mark(titleStr, urlStr, dateStr);

				 
				 // url 절대값 안넘어감 list->view로 바꿔야 됨
				 list.add(mark);
			}
			System.out.println(list);
			return list;
		}
			
		}
		

