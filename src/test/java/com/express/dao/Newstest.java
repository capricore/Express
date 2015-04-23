package com.express.dao;

import java.sql.Timestamp;
import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.express.bean.News;

public class Newstest {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"classpath:/applicationContext.xml");

		NewsDao newsDao = (NewsDao) context.getBean("newsDao");
		News news2 = new News();
		news2.setNewsid("2");
		news2.setTitle("second news");
		news2.setContent("this is second piece of news");
		news2.setNewstype(1);
		news2.setSubtype(1);
		news2.setDel(0);
		news2.setCrtime(new Timestamp(System.currentTimeMillis()));
		
		if (newsDao.updateNews(news2)) {
			System.out.println("添加成功");
		}else {
			System.out.println("添加失败");
		}
		
		List<News> news = newsDao.getNewsListByNewsType(1);
		System.out.println("获得全查询列表");

		for (Iterator<News> iter = news.iterator(); iter.hasNext();) {

			News element = (News) iter.next();

			System.out.println(element.getTitle());
			System.out.println(element.getContent());
		}
	}

}
