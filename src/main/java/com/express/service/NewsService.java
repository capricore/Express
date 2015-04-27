package com.express.service;

import java.util.List;

import com.express.bean.News;

public interface NewsService {
	/* ��ѯ���д����µ����� */
    public List<News> getNewsListByNewsType(int newstype);
    
    /* ���ݴ����ͺź�֮���ͺŲ�ѯ����������*/
    public List<News> getNewsListByNewsTypeAndSubType(int newstype, int subtype);  
    
    /* ����newsid��ѯָ������ */
    public News getByNewsId(String newsid); 
    
    /* ��������*/
    public boolean addNews(News news);
    
    /* ��������*/
    public boolean updateNews(News news);

}