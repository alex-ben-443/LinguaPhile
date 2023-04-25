package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class pojo {
	@Id
	private int id;
	private String name;
	private String gender;
	private int age;
	private String native_language;
	private String nationality;
	private String course;
	private String role;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getNative_language() {
		return native_language;
	}
	public void setNative_language(String native_language) {
		this.native_language = native_language;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "pojo [id=" + id + ", name=" + name + ", gender=" + gender + ", age=" + age + ", native_language="
				+ native_language + ", nationality=" + nationality + ", course=" + course + ", role=" + role + "]";
	}	
}
