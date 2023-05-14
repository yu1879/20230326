package spring.core.session07.tx.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements BookDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public Integer getBookPrice(Integer bookId) {
		String sql = "select book_price from book where book_id";
		Object[] args = { bookId };
		Integer bookPrice = jdbcTemplate.queryForObject(sql, args, Integer.class);
		return bookPrice;
	}

	@Override
	public Integer getBookStocket(Integer bookId) {
		String sql = "select book_amount from stock where book_id";
		Object[] args = { bookId };
		Integer bookStock = jdbcTemplate.queryForObject(sql, args, Integer.class);
		return bookStock;
	}

	@Override
	public Integer updateBookStock(Integer bookId) {
		Integer bookStock = getBookStocket(bookId);
		if (bookStock <= 0) {
			throw new RuntimeException("書本庫存量不足: book id=" + bookId + ", book stock=" + bookStock);
		}
		String sql = "update stock set book_amount = book_amount-1 where book_id = ? ";
		int rowcount = jdbcTemplate.update(sql, bookId);
		return rowcount;
	}

	@Override
	public Integer updateWallet(String username, Integer bookPrice) {
		Integer balance = getWalletBalance(username);
		if (balance < bookPrice) {
			throw new RuntimeException("餘額不足: balance= $" + balance + ", bookPrice=$" + bookPrice);

		}
		String sql = "update wallet set balance = balance-? where  username= ? ";
		int rowcount = jdbcTemplate.update(sql, bookPrice, username);
		return rowcount;
	}

	@Override
	public Integer getWalletBalance(String username) {
		// TODO Auto-generated method stub
		return null;
	}

}
