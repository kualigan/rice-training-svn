package train.bookstore.document.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.kuali.rice.kns.web.struts.action.KualiTransactionalDocumentActionBase;
import org.kuali.rice.kns.web.struts.form.KualiForm;
import org.kuali.rice.krad.service.KRADServiceLocator;

import train.bookstore.bo.Book;
import train.bookstore.bo.BookOrderEntry;
import train.bookstore.document.BookOrderDocument;

public class BookOrderAction extends KualiTransactionalDocumentActionBase {

	public ActionForward addBookOrderEntry(ActionMapping mapping, ActionForm actionForm, HttpServletRequest request, HttpServletResponse response) throws Exception {

		BookOrderForm form = (BookOrderForm) actionForm;
        BookOrderDocument document = form.getBookOrderDocument();

        BookOrderEntry newBookOrderEntry = form.getNewBookOrderEntry();
        document.addBookOrderEntry(newBookOrderEntry);

        // clear the used book order entry
        form.setNewBookOrderEntry(new BookOrderEntry());

        return mapping.findForward("basic");
    }
	
	public ActionForward deleteBookOrderEntry(ActionMapping mapping, ActionForm actionForm, HttpServletRequest request, HttpServletResponse response) throws Exception {
        		
		BookOrderForm form = (BookOrderForm) actionForm;
        BookOrderDocument document = form.getBookOrderDocument();
        
        int deleteIndex = getLineToDelete(request);
        document.removeBookOrderEntry(deleteIndex);

        return mapping.findForward("basic");        
    }

	@Override
	protected void doProcessingAfterPost(KualiForm actionForm, HttpServletRequest request) {
		super.doProcessingAfterPost(actionForm, request);

		BookOrderForm form = (BookOrderForm) actionForm;
        BookOrderDocument document = form.getBookOrderDocument();
        for (BookOrderEntry entry : document.getBookOrderEntries()) {
        	Book book = KRADServiceLocator.getBusinessObjectService().findBySinglePrimaryKey(Book.class, entry.getBookId());
        	entry.setBook(book);
        }
		
	}
	
}
