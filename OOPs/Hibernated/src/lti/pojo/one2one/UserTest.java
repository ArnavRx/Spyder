package lti.pojo.one2one;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import lti.util.HibernateUtil;
import oracle.net.aso.a;

public class UserTest {
	@Test
	public void testCase1() {
		Session session =HibernateUtil.getSession();
		Transaction tx= session.beginTransaction();
		
		User u = new User();
				u.setFirstname("munch");
				u.setLastname("nuts");
				u.setUsername("boomer");
				u.setPassword("boomer123");
				
		Address address= new Address();
		address.setCity("mumbai");
		address.setStreet("powai");
		address.setZipcode("400083");
		
		u.setAddress(address);
		address.setUser(u);
		
		session.save(u);
		tx.commit();
		
	}

}
