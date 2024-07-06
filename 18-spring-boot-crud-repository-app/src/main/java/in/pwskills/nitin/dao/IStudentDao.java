package in.pwskills.nitin.dao;

import org.springframework.data.repository.CrudRepository;

import in.pwskills.nitin.entity.Student;

public interface IStudentDao extends CrudRepository<Student, Integer> {
	//C R U D operation methods are autocoming from CrudRepository
}
