package com.example.Dbconnection.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CCM")
public class DbEntity {

	@Id
	@GeneratedValue
	
	@Column(name="Id")
	int Id;
	@Column(name="Name")
	String Name;
	
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
	public String toString()
	{
		return Id+" "+Name;
	}
	
	
	
}
