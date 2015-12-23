package com.shijing.daoImp;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import com.shijing.bean.Myuser;
import com.shijing.dao.UserBaseDao;

public class UserDaoImp implements UserBaseDao{
    private SessionFactory sessionFactory;
    
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public boolean checkUserLogin(Myuser user) {
		// TODO Auto-generated method stub
		Session session=getMySession();
		String queryString="from Myuser user where userName=:userName and password=:password";
		Query query=session.createQuery(queryString);
		query.setParameter("userName", user.getUserName());
		query.setParameter("password", user.getPassword());
		System.out.println(user.getPassword());
		List<Myuser>list=query.list();
		System.out.println(list);
		if(!list.isEmpty())
			return true;
		else 
		  return false;
	}

	public Session getMySession()  throws HibernateException {
//        SessionFactory sessionFactory=null;
//		Configuration configuration=new Configuration().configure();
//		ServiceRegistryBuilder builder=new ServiceRegistryBuilder().applySettings(configuration.getProperties());
//		ServiceRegistry registry=builder.buildServiceRegistry();
//		sessionFactory=configuration.buildSessionFactory(registry);
		if (sessionFactory.getCurrentSession() != null) {
			return sessionFactory.getCurrentSession();
		} else {
			return sessionFactory.openSession();
		}
	}
}
