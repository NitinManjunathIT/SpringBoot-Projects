package com.app.nitin.repo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.app.nitin.beans.Student;

@Repository
@Transactional
public class StudentRepoImpl implements IStudentRepo {

	@Autowired
	private HibernateTemplate template;

	@Override
	public String saveStudent(Student student) {
		System.out.println(template);
		Integer id = (int) template.save(student);
		return "Object is saved with the id :: " + id;
	}

	@Override
	public Student findById(Integer sid) {
		Student student = template.get(Student.class, sid);
		return student;
	}

	@Override
	public String delete(Integer sid) {
		Student student = findById(sid);
		String status = "";
		if (student != null) {
			template.delete(student);
			status = "Record deleted succesfully";
		} else {
			status = "Student record not available for given id :: " + sid;
		}
		return status;
	}

	@Override
	public String updateStudent(Student student) {
		template.saveOrUpdate(student);
		return "Record updated succesfully";
	}

	@Override
	public List<Student> findAllStudents() {
		//select * from students;
		return template.loadAll(Student.class);
		
	}

}
