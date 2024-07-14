package in.pwskills.nitin.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import in.pwskills.nitin.entity.Course;

public interface ICourseRepository extends JpaRepository<Course, Integer> {

}
