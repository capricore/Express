package com.express.bean;

public class File {
	
	private String fileid; 			// 文件id

	private String filename; 		// 文件名称

	private String filesrc; 		// 文件路径

	private Double filesize; 		// 文件大小

	public String getFileid() {
		return fileid;
	}

	public void setFileid(String fileid) {
		this.fileid = fileid;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public String getFilesrc() {
		return filesrc;
	}

	public void setFilesrc(String filesrc) {
		this.filesrc = filesrc;
	}

	public Double getFilesize() {
		return filesize;
	}

	public void setFilesize(Double filesize) {
		this.filesize = filesize;
	}
	

}
