package spring.core.session07.tx.dao;

import spring.core.session07.tx.exception.InsufficientAmount;
import spring.core.session07.tx.exception.InsufficientStock;

public interface BookDao {
	Integer getBookPrice(Integer bookId);

	Integer getBookStocket(Integer bookId);

	Integer updateBookStock(Integer bookId) throws InsufficientStock;

	Integer getWalletBalance(String username);

	Integer updateWallet(String username, Integer bookPrice)throws InsufficientAmount;
}
