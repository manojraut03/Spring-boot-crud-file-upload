package com.demo.classicone.model;

import java.util.Arrays;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;

@Entity
@Table
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column
	private String name;
	@Column
	private String address;
	@Column
	private String dob;
	@Column
	private String post;
	@Column
	private String photo;
	@Column
	private String aadhar;
	@Column
	private String pancard;
	@Column
	private String licence;
	@Column(length=1000)
	@Lob
	private byte[] imgdata;
	

//	public User(int id, String name, String address, String dob, String post, String photo, String aadhar,
//			String pancard, String licence) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.address = address;
//		this.dob = dob;
//		this.post = post;
//		this.photo = photo;
//		this.aadhar = aadhar;
//		this.pancard = pancard;
//		this.licence = licence;
//	}
	

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", address=" + address + ", dob=" + dob + ", post=" + post
				+ ", photo=" + photo + ", aadhar=" + aadhar + ", pancard=" + pancard + ", licence=" + licence
				+ ", imgdata=" + Arrays.toString(imgdata) + "]";
	}

	public User(String name, String address, String dob, String post, String photo, String aadhar, String pancard,
		String licence) {
	super();
	this.name = name;
	this.address = address;
	this.dob = dob;
	this.post = post;
	this.photo = photo;
	this.aadhar = aadhar;
	this.pancard = pancard;
	this.licence = licence;
	//this.imgdata = imgdata;
}

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getDob() {
		return dob;
	}


	public void setDob(String dob) {
		this.dob = dob;
	}


	public String getPost() {
		return post;
	}


	public void setPost(String post) {
		this.post = post;
	}


	public String getPhoto() {
		return photo;
	}


	public void setPhoto(String photo) {
		this.photo = photo;
	}


	public String getAadhar() {
		return aadhar;
	}


	public void setAadhar(String aadhar) {
		this.aadhar = aadhar;
	}


	public String getPancard() {
		return pancard;
	}


	public void setPancard(String pancard) {
		this.pancard = pancard;
	}


	public String getLicence() {
		return licence;
	}


	public void setLicence(String licence) {
		this.licence = licence;
	}




	public byte[] getImgdata() {
		return imgdata;
	}




	public void setImgdata(byte[] imgdata) {
		this.imgdata = imgdata;
	}
	
	
	

}
