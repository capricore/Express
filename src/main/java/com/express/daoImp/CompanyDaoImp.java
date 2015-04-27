package com.express.daoImp;

import java.util.List;

import org.apache.log4j.Logger;

import com.express.bean.Company;
import com.express.dao.BaseDao;
import com.express.dao.CompanyDao;

public class CompanyDaoImp extends BaseDao implements CompanyDao{
	
	private static final Logger logger = Logger.getLogger(CompanyDaoImp.class);  

	@SuppressWarnings("unchecked")
	@Override
	public List<Company> getCompanyList() {
		List<Company> Company = null;
		try {
			Company = getSqlMapClientTemplate().queryForList("getCompanyList");
		} catch (Exception e) {
			logger.error("获取公司信息列表出错！" +  ",errMsg=" + e.getMessage());
		}
		return Company; 
	}

	@Override
	public Company getByCompanyName(String compname) {
		Company company = null;
		try {
			company = (Company) getSqlMapClientTemplate().queryForObject("getByCompanyName",compname);
		} catch (Exception e) {
			logger.error("根据公司名获取公司信息出错！" +  ",errMsg=" + e.getMessage());
		}
		return company;
	}

	@Override
	public Company getByCompanyId(String compid) {
		Company company = null;
		try {
			company = (Company) getSqlMapClientTemplate().queryForObject("getByCompanyId",compid);
		} catch (Exception e) {
			logger.error("根据公司id获取公司信息出错！" +  ",errMsg=" + e.getMessage());
		}
		return company;  
	}

	@Override
	public boolean addCompany(Company company) {
		String object = null;
		boolean flag = false;
		try {
			object =(String) getSqlMapClientTemplate().insert("addCompany", company);
		} catch (Exception e) {
			logger.error("添加公司信息出错！" +  ",errMsg=" + e.getMessage());
		}
		if (object != null) {
			flag = true;
		}
		return flag;
	}

	@Override
	public boolean updateCompany(Company company) {
		Object object = null;
		boolean flag = false;
		try {
			object =(Integer) getSqlMapClientTemplate().update("updateCompany", company);
		} catch (Exception e) {
			logger.error("更新公司信息出错！" +  ",errMsg=" + e.getMessage());
		}
		if (object != null) {
			flag = true;
		}
		return flag;
	}

}
