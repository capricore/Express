package com.express.daoImp;

import java.util.List;

import org.apache.log4j.Logger;

import com.express.bean.Blacklist;
import com.express.dao.BaseDao;
import com.express.dao.BlacklistDao;

public class BlacklistDaoImp extends BaseDao implements BlacklistDao {
	
	private static final Logger logger = Logger.getLogger(BlacklistDaoImp.class); 

	@SuppressWarnings("unchecked")
	@Override
	public List<Blacklist> getBlackList() {
		List<Blacklist> blacklists = null;
		try {
			blacklists = getSqlMapClientTemplate().queryForList("getBlackList");
		} catch (Exception e) {
			logger.error("��ȡ��������Ϣ�б����" +  ",errMsg=" + e.getMessage());
		}
		return blacklists; 
	}

	@Override
	public Blacklist getByName(String name) {
		Blacklist blacklist = null;
		try {
			blacklist = (Blacklist) getSqlMapClientTemplate().queryForObject("getByName",name);
		} catch (Exception e) {
			logger.error("����������ȡ��������Ϣ����" +  ",errMsg=" + e.getMessage());
		}
		return blacklist;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Blacklist> getBlackListByCompanyName(String compname) {
		List<Blacklist> blacklists = null;
		try {
			blacklists = getSqlMapClientTemplate().queryForList("getBlackListByCompanyName", compname);
		} catch (Exception e) {
			logger.error("���ݹ�˾���ƻ�ȡ��������Ϣ�б����" +  ",errMsg=" + e.getMessage());
		}
		return blacklists;
	}

	@Override
	public boolean addBlackList(Blacklist blacklist) {
		String object = null;
		boolean flag = false;
		try {
			object =(String) getSqlMapClientTemplate().insert("addBlackList", blacklist);
		} catch (Exception e) {
			logger.error("��Ӻ�������Ϣ����" +  ",errMsg=" + e.getMessage());
		}
		if (object != null) {
			flag = true;
		}
		return flag;
	}

	@Override
	public boolean updateBlackList(Blacklist blacklist) {
		Object object = null;
		boolean flag = false;
		try {
			object =(Integer) getSqlMapClientTemplate().update("updateBlackList", blacklist);
		} catch (Exception e) {
			logger.error("���º�������Ϣ����" +  ",errMsg=" + e.getMessage());
		}
		if (object != null) {
			flag = true;
		}
		return flag;
	}

}
