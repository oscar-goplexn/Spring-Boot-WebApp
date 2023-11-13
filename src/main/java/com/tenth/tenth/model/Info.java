package com.tenth.tenth.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document
public class Info {
	@Id
	private String id;
	@Field
	private String FirstName;
	@Field
	private String LastName;
	public Info() {
	}
	public Info(String FirstName, String LastName) {
		this.FirstName = FirstName;
		this.LastName = LastName;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String setFirstName() {
		return FirstName;
	}
	public void setFirstName(String FirstName) {
		this.FirstName = FirstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void LastName(String LastName) {
		this.LastName = LastName;
	}

	@Override
	public String toString() {
		return String.format("Info[id='%s', FirstName='%s', LastName='%s']", id, FirstName, LastName);
	}
}