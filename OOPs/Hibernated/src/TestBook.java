import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import lti.pojo.Book;
import lti.util.HibernateUtil;

public class TestBook {
	@Test
	public void testSavebook()
	{
		Session session = HibernateUtil.getSession();
		
		Transaction txn = session.beginTransaction();
		Book alc = new Book(345254,"The Alchemist","Paulo Coehlo",350);
		session.save(alc);
		txn.commit();
		
		
	}

	@Test
	public void testGetBook()
	{
		Session session = HibernateUtil.getSession();
		Book bc = (Book) session.get(Book.class, 1);
		System.out.println(bc);
	}
	@Test
	public void testGetByIsbn()
	{
		Session session = HibernateUtil.getSession();
		Book bk = (Book) session.bySimpleNaturalId(Book.class).load(345254);
		System.out.println(bk);
		
	}
	
}
