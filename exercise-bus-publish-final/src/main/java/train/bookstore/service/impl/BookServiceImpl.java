package train.bookstore.service.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.kuali.rice.krad.service.KRADServiceLocator;

import train.bookstore.bo.Book;
import train.bookstore.bo.BookDTO;
import train.bookstore.service.BookService;

public class BookServiceImpl implements BookService {

	@Override
	public List<BookDTO> getAllBooks() {
		Collection<Book> allBooks = KRADServiceLocator.getBusinessObjectService().findAll(Book.class);
		List<BookDTO> allBookDTOs = new ArrayList<BookDTO>();
		for (Book book : allBooks) {
			allBookDTOs.add(new BookDTO(book));
		}
		return allBookDTOs;
	}

	@Override
	public BookDTO getBookById(String bookId) {
		Book book = KRADServiceLocator.getBusinessObjectService().findBySinglePrimaryKey(Book.class, bookId);
		if (book == null) {
			return null;
		}
		return new BookDTO(book);
	}


}
