package in.pwskills.nitin.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import in.pwskills.nitin.entity.Person;

public interface IPersonRepository extends JpaRepository<Person, Integer> {

}
