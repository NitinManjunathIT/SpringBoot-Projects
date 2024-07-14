package in.pwskills.nitin.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import in.pwskills.nitin.entity.Role;

public interface IRoleRepository extends JpaRepository<Role, Integer> {

}
