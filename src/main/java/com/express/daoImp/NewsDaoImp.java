package com.express.daoImp;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.express.bean.News;
import com.express.dao.BaseDao;
import com.express.dao.NewsDao;
import com.express.query.NewsQuery;

@Repository
public class NewsDaoImp extends BaseDao implements NewsDao{

	@SuppressWarnings("unchecked")
	public List<News> getNewsListByNewsType(int newstype) {
		List<News> news = null;
		try {
			news = getSqlMapClientTemplate().queryForList("getNewsListByNewsType", newstype);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return news; 
	}

	@SuppressWarnings("unchecked")
	public List<News> getNewsListByNewsTypeAndSubType(int newstype, int subtype) {
		List<News> news = null;
		NewsQuery newsQuery = new NewsQuery();
		newsQuery.setNewstype(newstype);
		newsQuery.setSubtype(subtype);
		try {
			news = getSqlMapClientTemplate().queryForList("getNewsListByNewsTypeAndSubType", newsQuery);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return news;
	}

	public News getByNewsId(String newsid) {
		News news = null;
		try {
			news = (News) getSqlMapClientTemplate().queryForObject("getByNewsId",newsid);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return news; 
	}

	public boolean addNews(News news) {
		String object = null;
		boolean flag = false;
		try {
			object =(String) getSqlMapClientTemplate().insert("addNews", news);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (object != null) {
			flag = true;
		}
		return flag;
	}

	public boolean updateNews(News news) {
		Object object = null;
		boolean flag = false;
		try {
			object =(Integer) getSqlMapClientTemplate().update("updateNews", news);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (object != null) {
			flag = true;
		}
		return flag;
	}

}
