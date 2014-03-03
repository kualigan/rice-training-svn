package train.bookstore.lookup;

import java.util.Map;

import org.kuali.rice.core.api.util.RiceKeyConstants;
import org.kuali.rice.kns.lookup.KualiLookupableHelperServiceImpl;
import org.kuali.rice.krad.util.GlobalVariables;

public class BookLookupableHelperServiceImpl extends
		KualiLookupableHelperServiceImpl {

	@Override
	public void validateSearchParameters(Map parameterMap) {
		String category = (String)parameterMap.get("category");
		if (category != null && !"".equals(category.trim())) {
			if (category.contains("*")) {
				GlobalVariables.getMessageMap().putError("category", RiceKeyConstants.ERROR_CUSTOM, "Category does not support wildcards on search.");
			}
		}
		super.validateSearchParameters(parameterMap);
	}	

}
