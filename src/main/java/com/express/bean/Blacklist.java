package com.express.bean;

import java.sql.Timestamp;

public class Blacklist {
	
	private String name; 			// 文件id

	private String compname; 		// 文件名称

	private Timestamp crtime; 		// 文件路径

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
