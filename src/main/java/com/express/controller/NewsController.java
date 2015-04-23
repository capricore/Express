package com.express.controller;

import java.sql.Timestamp;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.express.bean.News;
import com.express.service.NewsService;
import com.express.util.CodeGenerator;
import com.express.util.DateUtils;

@Controller
@RequestMapping(value="/news")
public class NewsController extends BaseController{

	@Autowired
	private NewsService newsService;
	
	@RequestMapping("/save.do")
	public void addNews(HttpServletRequest request, HttpServletResponse response) throws Exception{
		try{
			String title = new String(request.getParameter("title").getBytes("ISO-8859-1"),"UTF-8");
			String content = new String(request.getParameter("content").getBytes("ISO-8859-1"),"UTF-8");
			String type = request.getParameter("type");
			int newstype = type.charAt(0)-'0';
			int subtype = type.charAt(1)-'0';
			Timestamp crtime = Timestamp.valueOf(DateUtils.getCurrDateTimeStr());
			System.out.println("title:"+title);
			System.out.println("content:"+content);
			System.out.println("newstype:"+newstype);
			News news = new News();
			news.setNewsid(CodeGenerator.createUUID());				
			news.setTitle(title);				
			news.setContent(content);
			news.setNewstype(newstype);
			news.setSubtype(subtype);
			news.setCrtime(crtime);
			news.setDel(0);
			newsService.addNews(news);
			outputJsonResponse(response, true, "uploadSuccess");
		}catch (RuntimeException e) {
			System.out.println(e.getMessage());
			outputJsonResponse(response, false, e.getMessage());
		}
	}
}
