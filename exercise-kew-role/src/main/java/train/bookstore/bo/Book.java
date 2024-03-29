package train.bookstore.bo;

import java.util.ArrayList;
import java.util.List;

import org.kuali.rice.krad.bo.PersistableBusinessObjectBase;

public class Book extends PersistableBusinessObjectBase {

	private static final long serialVersionUID = -7850668919837546145L;

	private Long id;
	private String title;
	private Long authorId;
	private String category;
	private String isbn;
	private String publisher;
	private java.sql.Date publicationDate;
	
	private Author author;
	
	private List<Chapter> chapters = new ArrayList<Chapter>();
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Long getAuthorId() {
		return authorId;
	}
	public void setAuthorId(Long authorId) {
		this.authorId = authorId;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public java.sql.Date getPublicationDate() {
		return publicationDate;
	}
	public void setPublicationDate(java.sql.Date publicationDate) {
		this.publicationDate = publicationDate;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public List<Chapter> getChapters() {
		return chapters;
	}
	public void setChapters(List<Chapter> chapters) {
		this.chapters = chapters;
	}
	
}
