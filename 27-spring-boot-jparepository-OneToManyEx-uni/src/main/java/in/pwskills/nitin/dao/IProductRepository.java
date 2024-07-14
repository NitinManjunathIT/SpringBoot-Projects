package in.pwskills.nitin.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import in.pwskills.nitin.entity.Product;

public interface IProductRepository extends JpaRepository<Product, Integer> {

}
