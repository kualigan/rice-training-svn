package train.bookstore.maintenance;

import java.util.Map;

import org.kuali.rice.kns.document.MaintenanceDocument;
import org.kuali.rice.kns.maintenance.KualiMaintainableImpl;

import train.bookstore.bo.Book;

public class BookMaintainable extends KualiMaintainableImpl {

	@Override
	public void processAfterCopy(MaintenanceDocument document, Map<String, String[]> parameters) {
		super.processAfterCopy(document, parameters);
		Book book = ((Book)document.getNewMaintainableObject().getBusinessObject());
		book.setIsbn(null);
	}

	
	
}
