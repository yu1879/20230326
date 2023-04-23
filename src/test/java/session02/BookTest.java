package session02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.core.session02.bean.Author;
import spring.core.session02.bean.Book;

public class BookTest {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-config2.xml");
		Author author1 = ctx.getBean("author1", Author.class);
		// System.out.println("author1:" + author1);
		author1.setName("Bob");
		author1.setSex('男');
		author1.setAge(24);
		Book book1 = ctx.getBean("book1", Book.class);
		book1.setName("Java");
		book1.setPrice(500);
		book1.setAuthor(author1);
		System.out.println("book1:" + book1);
		Book book2 = ctx.getBean("book2", Book.class);
		System.out.println("book2:" + book2);
		Book book3 = ctx.getBean("book3", Book.class);
		System.out.println("book3:" + book3);
		Book book4 = ctx.getBean("book4", Book.class);
		System.out.println("book:" + book4);
		Book book5 = ctx.getBean("book5", Book.class);
		System.out.println("book5:" + book5);

	}
}
