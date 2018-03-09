package poly.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import poly.entity.Book;
import poly.util.hbUtil;

public class BookDAO {
	@SuppressWarnings("unchecked")
	public static List<Book> getListBook(String tensach) {

		List<Book> list = new ArrayList<Book>();
		Session session = hbUtil.openSession();
		Transaction tx = null;
		try {
			tx = session.getTransaction();
			tx.begin();
			String hql = "from Book b";
			if (tensach.length() > 0) {
				hql += " where b.TenSach like '" + tensach + "' ";
			}
			System.out.println(hql);
			list = session.createQuery(hql).list();
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
}
