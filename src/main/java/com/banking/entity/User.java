package com.banking.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name="tbl_user")
public class User {
	
	@Id
	@GeneratedValue
	private int uid;
	private String fname;
	private String lname;
	private String address;
	private String typeofuser;
	private String password;
	public User(int uid, String fname, String lname, String address, String typeofuser, String password) {
		super();
		this.uid = uid;
		this.fname = fname;
		this.lname = lname;
		this.address = address;
		this.typeofuser = typeofuser;
		this.password = password;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTypeofuser() {
		return typeofuser;
	}
	public void setTypeofuser(String typeofuser) {
		this.typeofuser = typeofuser;
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", fname=" + fname + ", lname=" + lname + ", address=" + address + ", typeofuser="
				+ typeofuser + ", password=" + password + "]";
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int uid, String fname, String lname, String address, String typeofuser) {
		super();
		this.uid = uid;
		this.fname = fname;
		this.lname = lname;
		this.address = address;
		this.typeofuser = typeofuser;
	}
	
	

}
