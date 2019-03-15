package com.pack.Model;

public class User {
private String name;
private String password;
private String country;
private String[] community;
private String gender;
private Boolean mailinglist;
private String aboutYou;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String[] getCommunity() {
	return community;
}
public void setCommunity(String[] community) {
	this.community = community;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public Boolean getMailinglist() {
	return mailinglist;
}
public void setMailinglist(Boolean mailinglist) {
	this.mailinglist = mailinglist;
}
public String getAboutYou() {
	return aboutYou;
}
public void setAboutYou(String aboutYou) {
	this.aboutYou = aboutYou;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}

}
