package com.express.bean;

import java.sql.Timestamp;

public class Blacklist {
	
	private String name; 			// �ļ�id

	private String compname; 		// �ļ�����

	private Timestamp crtime; 		// �ļ�·��

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompname() {
		return compname;
	}

	public void setCompname(String compname) {
		this.compname = compname;
	}

	public Timestamp getCrtime() {
		return crtime;
	}

	public void setCrtime(Timestamp crtime) {
		this.crtime = crtime;
	}

}