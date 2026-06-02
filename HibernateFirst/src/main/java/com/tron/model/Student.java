package com.tron.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//if we don't have table in DB then Student table will be created.
//@Table - this is optional.
@Entity
@Table(name="StudentTable") //Want to explicitly specify table name.
public class Student
{
	@Id //for primary key
	@Column(name="SID") //optional and can explicitly specify coln name.
	private Integer sid;

	@Column(name="SNAME")
	private String sName;
	
	@Column(name="SCITY")
	private String scity;
	
	//compulsory create a 0 param const - Hibernate will use it internally
	public Student()
	{
		System.out.println("Zero Param Constructor for Hibernate");
	}

	public Integer getSid() {
		return sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getScity() {
		return scity;
	}

	public void setScity(String scity) {
		this.scity = scity;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sName=" + sName + ", scity=" + scity + "]";
	}
	
	
}
