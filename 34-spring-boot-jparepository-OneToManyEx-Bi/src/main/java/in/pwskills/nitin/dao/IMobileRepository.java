package in.pwskills.nitin.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import in.pwskills.nitin.entity.MobileNumber;

public interface IMobileRepository extends JpaRepository<MobileNumber, Long> {

}
