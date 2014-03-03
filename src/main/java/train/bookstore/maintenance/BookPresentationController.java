package train.bookstore.maintenance;

import org.kuali.rice.kns.document.authorization.MaintenanceDocumentPresentationControllerBase;
import org.kuali.rice.krad.document.Document;

public class BookPresentationController extends
		MaintenanceDocumentPresentationControllerBase {
	
	@Override
	public boolean canBlanketApprove(Document document) {
		return false;
	}

}
