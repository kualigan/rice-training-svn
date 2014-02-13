package train.bookstore.document;

import java.util.ArrayList;
import java.util.List;

import org.kuali.rice.krad.document.TransactionalDocumentBase;

import train.bookstore.bo.BookOrderEntry;

public class BookOrderDocument extends TransactionalDocumentBase {

	private static final long serialVersionUID = -1727087229360900329L;

	private List<BookOrderEntry> bookOrderEntries = new ArrayList<BookOrderEntry>();

	public List<BookOrderEntry> getBookOrderEntries() {
		return bookOrderEntries;
	}

	public void setBookOrderEntries(List<BookOrderEntry> bookOrderEntries) {
		this.bookOrderEntries = bookOrderEntries;
	}
	
	public void addBookOrderEntry(BookOrderEntry bookOrderEntry) {
		bookOrderEntry.setDocumentId(getDocumentNumber());
		bookOrderEntries.add(bookOrderEntry);
	}
	
	public void removeBookOrderEntry(int deleteIndex) {
		bookOrderEntries.remove(deleteIndex);
	}
	
}
