
package spring.core.session07.tx.service;

import org.springframework.stereotype.Service;

import spring.core.session07.tx.exception.InsufficientAmount;
import spring.core.session07.tx.exception.InsufficientStock;

@Service
public interface BookOneService {
	void buyOne(String username, Integer bookId) throws InsufficientAmount, InsufficientStock;
}
