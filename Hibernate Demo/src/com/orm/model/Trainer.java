package com.orm.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Trainer {
	
	@Id
	private Integer tno;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "course_trainer",joinColumns=@JoinColumn(name="tno"),inverseJoinColumns = @JoinColumn(name="cno"))
	private Set<Course> courses;
	
	public Set<Course> getCourses() {
		return courses;
	}

	public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}

	@Column
	private String name;
	
	public Trainer() {}

	public Integer getTno() {
		return tno;
	}

	public void setTno(Integer tno) {
		this.tno = tno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Trainer(Integer tno, String name) {
		super();
		this.tno = tno;
		this.name = name;
	}
	

}
