
package spring.core.session07.tx.service;

import org.springframework.stereotype.Service;

@Service
public interface BookOneService {
	void buyOne(String username, Integer bookId);
}
