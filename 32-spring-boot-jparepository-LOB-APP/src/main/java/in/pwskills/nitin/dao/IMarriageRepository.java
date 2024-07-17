package in.pwskills.nitin.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import in.pwskills.nitin.entity.MarriageSeeker;

public interface IMarriageRepository extends JpaRepository<MarriageSeeker, Long> {

}
