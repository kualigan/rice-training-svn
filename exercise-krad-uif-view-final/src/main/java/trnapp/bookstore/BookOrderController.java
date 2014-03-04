package trnapp.bookstore;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kuali.rice.krad.web.controller.TransactionalDocumentControllerBase;
import org.kuali.rice.krad.web.form.DocumentFormBase;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/bookOrder")
public class BookOrderController extends TransactionalDocumentControllerBase {

	@Override
	@RequestMapping(params = "methodToCall=save")
	public ModelAndView save(
			@ModelAttribute("KualiForm") DocumentFormBase form,
			BindingResult result, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		return super.save(form, result, request, response);
	}

	@Override
	protected DocumentFormBase createInitialForm(HttpServletRequest request) {
		return new BookOrderForm();
	}

}
