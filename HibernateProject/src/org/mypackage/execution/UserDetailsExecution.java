package org.mypackage.execution;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.mypackage.hibernate.UserDetails;

public class UserDetailsExecution {

	public static void main(String[] args) {

		UserDetails userDetails = new UserDetails();
		userDetails.setId(2);
		userDetails.setUserName("Second User");
		
		SessionFactory sessiosFactory = new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = sessiosFactory.openSession();
		session.beginTransaction();
		session.save(userDetails);
		session.beginTransaction().commit();
	}

}
