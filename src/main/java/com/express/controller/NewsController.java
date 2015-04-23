package com.express.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.express.bean.News;

@Controller
@RequestMapping(value="/news")
public class NewsController extends BaseController{

	@RequestMapping("/save.do")
	public void addNews(HttpServletRequest request, HttpServletResponse response) throws Exception{
		try{
			String title = request.getParameter("title");
			String content = new String(request.getParameter("content").getBytes("ISO-8859-1"),"UTF-8");
			String newstype = request.getParameter("newstype");
			System.out.println("title:"+title);
			System.out.println("content:"+content);
			System.out.println("newstype:"+newstype);
			outputJsonResponse(response, true, "uploadSuccess");
		}catch (RuntimeException e) {
			System.out.println(e.getMessage());
			outputJsonResponse(response, false, e.getMessage());
		}
	}
}
