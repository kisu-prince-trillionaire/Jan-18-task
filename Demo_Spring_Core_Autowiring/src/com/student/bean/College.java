package com.student.bean;

import java.util.List;

public class College {
	private int id;
	private String name;
	private Student student;
	private List<Student> students;

	public College() {
		super();
	}

	public College(int id, String name, Student student) {
		super();
		this.id = id;
		this.name = name;
		this.student = student;
	}

	public College(int id, String name, Student student, List<Student> students) {
		super();
		this.id = id;
		this.name = name;
		this.student = student;
		this.students = students;
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

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	@Override
	public String toString() {
		return "College [id=" + id + ", name=" + name + ", student=" + student + ", students=" + students + "]";
	}
}
