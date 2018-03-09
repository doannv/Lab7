package poly.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import poly.entity.Customer;
import poly.util.HibernateUtil;

public class CustomerDAO {
	@SuppressWarnings("unchecked")
	public boolean checkLogin(String Makh, String Matkhau) {
		List<Customer> list = null;
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		String sql = "from Customer where Makh= '" + Makh + "' and " + " Matkhau= '" + Matkhau + "'";
		System.out.println(sql);
		Query query = session.createQuery(sql);
		list = query.list();
		if (list.size() > 0) {
			return true;
		}
		return false;
	}

	@SuppressWarnings("unchecked")
	public static List<Customer> getListCustomer(String Hovaten) {

		List<Customer> list = new ArrayList<Customer>();
		Session session = HibernateUtil.openSession();
		Transaction tx = null;
		try {
			tx = session.getTransaction();
			tx.begin();
			String sql = "from Customer ";
			if (Hovaten.length() > 0) {
				sql += "where Hovaten like '%" + Hovaten + "%'";
			}
			System.out.println(sql);
			list = session.createQuery(sql).list();
			tx.commit();
		} catch (Exception e) {
			if (tx != null) {
				tx.rollback();
			}
			e.printStackTrace();
		} finally {
			session.close();
		}
		return list;
	}

	public static boolean insertCustomer(Customer kh) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		try {
			session.beginTransaction();
			session.save(kh);
			session.getTransaction().commit();
			return true;
		} catch (Exception e) {
			session.getTransaction().rollback();
			System.out.println(e);
			return false;
		}
	}

	public static boolean updateCustomer(Customer kh) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		try {
			session.getTransaction().begin();
			session.update(kh);
			session.getTransaction().commit();
			return true;
		} catch (Exception e) {
			session.getTransaction().rollback();
			System.out.println(e);
			return false;
		}
	}

	@SuppressWarnings("unused")
	public static boolean deleteCustomer(String Makh) {
		List<Customer> list = new ArrayList<Customer>();
		Session session = HibernateUtil.openSession();
		Customer kh = (Customer) session.get(Customer.class, Makh);
		if (kh == null) {
			return false;
		}

		Transaction tx = null;
		try {
			tx = session.getTransaction();
			tx.begin();
			session.delete(kh);
			tx.commit();

			return true;

		} catch (Exception e) {
			if (tx != null) {
				tx.rollback();
			}
			e.printStackTrace();
			return true;
		} finally {
			session.close();
		}
	}

}
