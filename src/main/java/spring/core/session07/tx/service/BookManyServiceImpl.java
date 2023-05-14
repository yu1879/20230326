package spring.core.session07.tx.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookManyServiceImpl implements BookManyService {
	@Autowired
	private BookOneService bookOneService;

	@Override
	public void BookManyService(String username, Integer... bookIds) {
		// TODO Auto-generated method stub
		for (Integer bookId : bookIds) {
			bookOneService.buyOne(username, bookId);
		}
	}

}
