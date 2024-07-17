package in.pwskills.nitin.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import in.pwskills.nitin.entity.Customer;

public interface ICustomeRepository extends JpaRepository<Customer, Integer> {

}
