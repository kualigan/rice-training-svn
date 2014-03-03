package train.bookstore.document.web;

import org.kuali.rice.kns.web.struts.form.KualiTransactionalDocumentFormBase;

import train.bookstore.bo.BookOrderEntry;
import train.bookstore.document.BookOrderDocument;

public class BookOrderForm extends KualiTransactionalDocumentFormBase {

	private static final long serialVersionUID = -5259424291285504003L;

	private BookOrderEntry newBookOrderEntry;
	
	public BookOrderEntry getNewBookOrderEntry() {
		return newBookOrderEntry;
	}

	public void setNewBookOrderEntry(BookOrderEntry newBookOrderEntry) {
		this.newBookOrderEntry = newBookOrderEntry;
	}

	public BookOrderDocument getBookOrderDocument() {
		return (BookOrderDocument) getDocument();
	}
	
}
