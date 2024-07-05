package com.app.nitin.repo;

import java.util.List;

import com.app.nitin.beans.Student;

public interface IStudentRepo {
	public String saveStudent(Student student);

	public Student findById(Integer sid);

	public String delete(Integer sid);

	public String updateStudent(Student student);
	
	public List<Student> findAllStudents();
}
