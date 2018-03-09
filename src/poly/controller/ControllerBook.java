package poly.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import poly.dao.BookDAO;
import poly.entity.Book;

/**
 * Servlet implementation class ControllerBook
 */
@WebServlet("/ControllerBook")
public class ControllerBook extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ControllerBook() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		try {
			String action = request.getParameter("action");
			if (action.equals("Search")) {
				System.out.println("do Search");
				String tensach = request.getParameter("txtTensach");
				List<Book> list = BookDAO.getListBook(tensach);
				System.out.println("size" + list.size());
				request.setAttribute("listBook", list);
				String url = "searchBook.jsp";
				RequestDispatcher rd = request.getRequestDispatcher(url);
				rd.forward(request, response);

			}
		} catch (Exception e) {
		}
	}

}
