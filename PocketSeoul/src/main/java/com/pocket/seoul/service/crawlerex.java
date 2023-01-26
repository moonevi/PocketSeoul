package com.pocket.seoul.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.pocket.member.entity.Mark;


public class crawlerex {

	  
		public List<Mark> getyth() throws IOException{
		
			List<Mark> list = new ArrayList<>();
			
			try {
				
				Document doc = Jsoup.connect("https://youth.seoul.go.kr/site/main/board/notice/list?baCategory1=basic&baCommSelec=true").get();
				
				Elements titles =  doc.getElementsByAttributeValue("class", "tlt");
				Elements url = doc.select(".tlt a");
				Elements data = doc.select(".pc");
				
				ArrayList<String> dateArr = new ArrayList<String>();
				
				for(int i = 4 ; i < 13; i+=2 ) {
					 Element datas = data.get(i);
			         String date = datas.text();
			         dateArr.add(date);
			        
				}
				
				for (int i = 0; i < 5; i++) {
		            Element title = titles.get(i);
		            Element urls = url.get(i);
		           
		            String titleStr = title.text();
		            String urlStr = urls.attr("abs:href");
		            String dateStr = dateArr.get(i);
		     
		            Mark mark = new Mark(titleStr, urlStr, dateStr);

		            list.add(mark);
		        }
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			
				return list;
		}
		
		
		public List<Mark> getSh() throws IOException{
			
			List<Mark> list = new ArrayList<>();
			
			try {
					
				Document doc = Jsoup.connect("https://www.i-sh.co.kr/main/lay2/program/S1T294C295/www/brd/m_241/list.do").get();
				Elements titles =  doc.getElementsByAttributeValue("class", "txtL");
				Elements url = doc.select(".txtL a");
				Elements data = doc.select(".num");
				
				ArrayList<String> dateArr = new ArrayList<String>();
				
				for(int i = 0 ; i < 9; i+=2 ) {
					 Element datas = data.get(i);
			         String date = datas.text();
			         
			         dateArr.add(date);
			        
				}
				
				for (int i = 0; i < 5; i++) {
					 Element title = titles.get(i);
					 Element urls = url.get(i);
					 data.get(i);
					 String titleStr = title.text();
					 String urlStr = urls.attr("abs:href");
					 String dateStr = dateArr.get(i);
					 
					 Mark mark = new Mark(titleStr, urlStr, dateStr);
	
					 list.add(mark);
				}
				
			} catch (IOException e) {
				e.printStackTrace();
			}
				return list;
		}
		
		
		public List<Mark> getLh() throws IOException{
			
			List<Mark> list = new ArrayList<>();
		
			try {
				
			
				Document doc = Jsoup.connect("https://www.lh.or.kr/bbs/list.do?sCode=user&mId=633&mPid=26&bbsSeq=&nttSeq=").get();
				Elements titles =  doc.getElementsByAttributeValue("class", "subject");
				Elements data = doc.select("tr td+td+td+td+td");
				
				ArrayList<String> dateArr = new ArrayList<String>();
				
				for(int i = 0 ; i < 9; i+=2 ) {
					 Element datas = data.get(i);
			         String date = datas.text();
			         System.out.println("date :" + date);
			         dateArr.add(date);
			        
				}
				
				
				for (int i = 0; i < 5; i++) {
					 Element title = titles.get(i);
					 Element datas = data.get(i);
					
					 
					 String titleStr = title.text();
					 String urlStr = ("https://www.lh.or.kr/bbs/list.do?sCode=user&mId=633&mPid=26&bbsSeq=&nttSeq=");
					 String dateStr = dateArr.get(i);
					 
					 Mark mark = new Mark(titleStr, urlStr, dateStr);
	
					 
				
					 list.add(mark);
				}
				
			} catch (IOException e) {
				e.printStackTrace();
			}

				return list;
		}
		
		
		public List<Mark> getYouthCenter() throws IOException{	
			
			List<Mark> list = new ArrayList<>();
			
			try {
					
				Document doc = Jsoup.connect("https://www.youthcenter.go.kr/jynTips/jynTipsEachList.do?categoryCode=0004&pageIndex=1&tipsId=&actionFlag=&srchKeyAll=&srchValueAll=&srchSortOrder=4&srchKeyEach=&srchValueEach=").get();
				Elements titles = doc.select(".txt strong");
				Elements data = doc.select(".date");
				
				for (int i = 0; i < 5; i++) {
					 Element title = titles.get(i);
					 Element datas = data.get(i+1);
					
					 String titleStr = title.text();
					 String urlStr = ("https://www.youthcenter.go.kr/jynTips/jynTipsEachList.do?categoryCode=0004&pageIndex=1&tipsId=&actionFlag=&srchKeyAll=&srchValueAll=&srchSortOrder=4&srchKeyEach=&srchValueEach=");
					 String dateStr = datas.text();
					 
					 Mark mark = new Mark(titleStr, urlStr, dateStr);
	
					 
				
					 list.add(mark);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			return list;
	}
			
	}
		

