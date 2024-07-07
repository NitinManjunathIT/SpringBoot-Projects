package in.pwskills.nitin.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import in.pwskills.nitin.entity.Book;

public interface IBookRepository extends JpaRepository<Book, Integer> {
	// R.T findByVariableNameCondition(params)
	
	//select * from booktab where bauth=?
	List<Book> findByAuthor(String authorName);
}
