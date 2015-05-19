package com.express.dao;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.express.bean.Company;

public class Companytest {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"classpath:/applicationContext.xml");

		CompanyDao companyDao = (CompanyDao) context.getBean("companyDao");
		List<Company> company = companyDao.getMainCompanyList();
		for (Company company2 : company) {
			System.out.println(company2.getCompname());
		}
	}
}
