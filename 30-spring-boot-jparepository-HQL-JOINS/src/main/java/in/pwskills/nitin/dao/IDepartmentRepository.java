package in.pwskills.nitin.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import in.pwskills.nitin.entity.Department;

public interface IDepartmentRepository extends JpaRepository<Department, Integer> {

}
