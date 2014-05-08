package trnapp.bookstore;

import org.kuali.rice.krad.bo.PersistableBusinessObjectBase;

public class BookOrderEntry extends PersistableBusinessObjectBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = 17538068571789466L;
	
	private Long id;
	private Long bookId;
	private Integer quantity;
	private String documentNumber;
	
	private Book book;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getBookId() {
		return bookId;
	}
	public void setBookId(Long bookId) {
		this.bookId = bookId;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public String getDocumentNumber() {
		return documentNumber;
	}
	public void setDocumentNumber(String documentNumber) {
		this.documentNumber = documentNumber;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}	
}
