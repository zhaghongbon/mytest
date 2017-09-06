package cn.itcast.springboot.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="notice")
public class Notice {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long ID; // bigint(20) NOT NULL AUTO_INCREMENT,
	private String CONTENT; // longtext,
	private String TITLE; // varchar(200) DEFAULT NULL,
	public Long getID() {
		return ID;
	}
	public void setID(Long iD) {
		ID = iD;
	}
	public String getCONTENT() {
		return CONTENT;
	}
	public void setCONTENT(String cONTENT) {
		CONTENT = cONTENT;
	}
	public String getTITLE() {
		return TITLE;
	}
	public void setTITLE(String tITLE) {
		TITLE = tITLE;
	}
	
}
