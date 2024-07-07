package in.pwskills.nitin.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "booktab")
public class Book implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "bid")
	private Integer bookId;

	@Column(name = "bname")
	private String bookName;

	@Column(name = "bauth")
	private String author;

	@Column(name = "bcost")
	private Double bookCost;

	@Column(name = "btype")
	private String bookType;
	
	public Book() {
		
	}

	public Book(Integer bookId, String bookName, String author, Double bookCost, String bookType) {
		this.bookId = bookId;
		this.bookName = bookName;
		this.author = author;
		this.bookCost = bookCost;
		this.bookType = bookType;
	}

	public Integer getBookId() {
		return bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Double getBookCost() {
		return bookCost;
	}

	public void setBookCost(Double bookCost) {
		this.bookCost = bookCost;
	}

	public String getBookType() {
		return bookType;
	}

	public void setBookType(String bookType) {
		this.bookType = bookType;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", author=" + author + ", bookCost=" + bookCost
				+ ", bookType=" + bookType + "]";
	}

}
