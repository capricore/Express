package com.express.dao;

import java.util.List;

import com.express.bean.Company;

public interface CompanyDao {
	/* ��ѯ��˾�б� */
    public List<Company> getCompanyList();
    
    /* ����compname��ѯָ���û� */
    public Company getByCompanyName(String compname);  
    
    /* ����compid��ѯָ���û� */
    public Company getByCompanyId(String compid); 
    
    /* �����¹�˾ */
    public boolean addCompany(Company company);
    
    /* ���¹�˾��Ϣ*/
    public boolean updateCompany(Company company);

}