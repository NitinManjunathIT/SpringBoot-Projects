package in.pwskills.nitin.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import in.pwskills.nitin.entity.User;

public interface IUserRepository extends JpaRepository<User, Integer> {

}
