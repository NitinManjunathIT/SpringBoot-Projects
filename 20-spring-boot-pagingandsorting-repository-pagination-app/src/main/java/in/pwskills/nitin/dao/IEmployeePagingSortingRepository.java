package in.pwskills.nitin.dao;

import org.springframework.data.repository.PagingAndSortingRepository;

import in.pwskills.nitin.entity.Employee;

public interface IEmployeePagingSortingRepository extends PagingAndSortingRepository<Employee, Integer> {
	
}
