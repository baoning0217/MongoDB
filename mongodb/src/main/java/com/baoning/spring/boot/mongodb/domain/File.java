package com.baoning.spring.boot.mongodb.domain;

import java.util.Date;
import java.util.Objects;

import org.bson.types.Binary;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class File {
	
	@Id
	private String id;
	private String name;//文件名称
	private String contentType;//文件类型
	private long size;
	private Date uploadDate;
	private String md5;
	private Binary content;//文件内容
	private String path;//文件路径
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContentType() {
		return contentType;
	}
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}
	public long getSize() {
		return size;
	}
	public void setSize(long size) {
		this.size = size;
	}
	public Date getUploadDate() {
		return uploadDate;
	}
	public void setUploadDate(Date uploadDate) {
		this.uploadDate = uploadDate;
	}

	public String getMd5() {
		return md5;
	}
	public void setMd5(String md5) {
		this.md5 = md5;
	}
	public Binary getContent() {
		return content;
	}
	public void setContent(Binary content) {
		this.content = content;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	
	
	protected File() {
		
	}
	
	public File(String name, String contentType, long size, Binary content) {
		this.name = name;
		this.contentType = contentType;
		this.size = size;
		this.uploadDate = new Date();
		this.content = content;
	}
	
	public boolean equals(Object object) {
		if(this == object) {
			return true;
		}
		if(object == null || getClass() != object.getClass()) {
			return false;
		}
		File fileInfo = (File) object;
		return 	Objects.equals(size, fileInfo.size)
			&& 	Objects.equals(name, fileInfo.name)
			&& 	Objects.equals(contentType, fileInfo.contentType)
			&& 	Objects.equals(uploadDate, fileInfo.uploadDate)
			&& 	Objects.equals(md5, fileInfo.md5)
			&& 	Objects.equals(id, fileInfo.id);
		
	}
	
	public int hashCode() {
		return Objects.hash(name,contentType,size,uploadDate,md5,id);
	}
	
	@Override
	public String toString() {
		return "File [id=" + id + ", name=" + name + ", contentType=" + contentType + ", size=" + size + ", uploadDate="
				+ uploadDate + ", MD5=" + md5 + "]";
	}
	
	
	
	
	
	
	

}
