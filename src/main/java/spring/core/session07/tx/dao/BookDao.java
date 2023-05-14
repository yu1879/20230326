package spring.core.session07.tx.dao;

public interface BookDao {
	Integer getBookPrice(Integer bookId);

	Integer getBookStocket(Integer bookId);

	Integer updateBookStock(Integer bookId);

	Integer getWalletBalance(String username);

	Integer updateWallet(String username, Integer bookPrice);
}
