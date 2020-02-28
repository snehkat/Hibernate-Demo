package com.orm.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Emp {
@Id
private Integer eno;

public Department getDept() {
	return dept;
}

public void setDept(Department dept) {
	this.dept = dept;
}

@Column
private String name;

@Column
private String city;

public Emp(Integer eno, String name, String city, String design) {
	super();
	this.eno = eno;
	this.name = name;
	this.city = city;
	this.design = design;
	//this.dept = dept;
}

@Column(name="desig")
private String design;

@ManyToOne(cascade = CascadeType.ALL)
@JoinColumn(name="dno")
private Department dept;

@OneToOne(mappedBy = "employee",cascade=CascadeType.ALL)
private Contact contact;

public Contact getContact() {
	return contact;
}

public void setContact(Contact contact) {
	this.contact = contact;
}

public Emp() {
	super();
	// TODO Auto-generated constructor stub
}


public Integer getEno() {
	return eno;
}

public void setEno(Integer eno) {
	this.eno = eno;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

public String getDesign() {
	return design;
}

public void setDesign(String design) {
	this.design = design;
}

}
