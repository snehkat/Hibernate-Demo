package com.orm.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Course {

	@Id
	private Integer cno;
	@Column
	private String name;
	
	@ManyToMany(mappedBy = "courses" , cascade = CascadeType.ALL)
	
	private Set<Trainer> trainer;
	public Set<Trainer> getTrainer() {
		return trainer;
	}

	public void setTrainer(Set<Trainer> trainer) {
		this.trainer = trainer;
	}

	public Integer getCno() {
		return cno;
	}

	public void setCno(Integer cno) {
		this.cno = cno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Course(Integer sno, String name) {
		super();
		this.cno = cno;
		this.name = name;
	}

	public Course() {}
	
}
