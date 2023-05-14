package spring.core.session07.tx.service;

import org.springframework.beans.factory.annotation.Autowired;

import spring.core.session07.tx.dao.BookDao;

public class BookOneServiceImpl implements BookOneService {
	@Autowired
	private BookDao bookDao;

	@Override
	public void buyOne(String username, Integer bookId) {
		Integer bookPrice = bookDao.getBookPrice(bookId);
		bookDao.updateBookStock(bookId);
		bookDao.updateWallet(username, bookPrice);
	}

}
