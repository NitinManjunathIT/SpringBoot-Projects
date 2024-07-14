package in.pwskills.nitin.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import in.pwskills.nitin.entity.Model;

public interface IModelRepository extends JpaRepository<Model, Integer> {

}
