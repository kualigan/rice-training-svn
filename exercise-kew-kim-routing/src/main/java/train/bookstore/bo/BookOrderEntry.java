package train.bookstore.bo;

import org.kuali.rice.krad.bo.PersistableBusinessObjectBase;

public class BookOrderEntry extends PersistableBusinessObjectBase {
	
	private static final long serialVersionUID = -1960335867620982491L;

	private Long id;
	private Integer quantity;
	private String documentId;
	private Long bookId;
	private Book book;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public String getDocumentId() {
		return documentId;
	}
	public void setDocumentId(String documentId) {
		this.documentId = documentId;
	}
	public Long getBookId() {
		return bookId;
	}
	public void setBookId(Long bookId) {
		this.bookId = bookId;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}

}
