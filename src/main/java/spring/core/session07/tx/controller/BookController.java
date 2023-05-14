package spring.core.session07.tx.controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Propagation;

import spring.core.session07.tx.service.BookManyService;
import spring.core.session07.tx.service.BookOneService;

@Controller
public class BookController {
	@Autowired
	private BookOneService bookOneService;
	@Autowired
	private BookManyService bookManyService;

	public void buyOneBook(String username, Integer bookId) {

		bookOneService.buyOne(username, bookId);
		System.out.println("buyOneBook OK");
	}

	public void buyManyBook(String username, Integer... bookIds) {

		bookManyService.buyMany(username, bookIds);
		System.out.println("bookManyBooks OK");
	}
}