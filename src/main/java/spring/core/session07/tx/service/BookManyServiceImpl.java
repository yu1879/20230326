package spring.core.session07.tx.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BookManyServiceImpl implements BookManyService {
	@Autowired
	private BookOneService bookOneService;

	@Transactional
	@Override
	public void buyMany(String username, Integer... bookIds) {
		// TODO Auto-generated method stub
		for (Integer bookId : bookIds) {
			bookOneService.buyOne(username, bookId);
		}

	}

}
