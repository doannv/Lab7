package poly.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import poly.dao.CustomerDAO;
import poly.entity.Customer;

@WebServlet("/ControllerCustomer")
public class ControllerCustomer extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ControllerCustomer() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		// processRequest(request,response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		try {
			String action = request.getParameter("action");
			System.out.println("action=" + action);
			if (action.equals("Login")) {
				System.out.println("do Login");
				String user = request.getParameter("txtUser");
				String pass = request.getParameter("txtPass");
				CustomerDAO cus = new CustomerDAO();
				System.out.print(user);
				System.out.print(pass);
				boolean check = cus.checkLogin(user, pass);
				String url = "error.jsp";
				if (check == true) {
					HttpSession session = request.getSession(true);
					session.setAttribute("User", user);
					url = "search.jsp";
				}
				System.out.println("URL: " + url);
				RequestDispatcher rd = request.getRequestDispatcher(url);
				rd.forward(request, response);

			} else if (action.equals("New")) {
				System.out.println("do New");
				RequestDispatcher rd = request.getRequestDispatcher("new.jsp");
				rd.forward(request, response);
			} else if (action.equals("Insert")) {
				System.out.println("do Insert");
				String Makh = request.getParameter("txtMakh");
				String Matkhau = request.getParameter("txtMatkhau");
				String Hovaten = request.getParameter("txtHovaten");
				String Email = request.getParameter("txtEmail");
				String Dienthoai = request.getParameter("txtDienthoai");
				Customer newkh = new Customer(Makh, Matkhau, Hovaten, Email, Dienthoai);
				CustomerDAO.insertCustomer(newkh);
				RequestDispatcher rd = request.getRequestDispatcher("search.jsp");
				rd.forward(request, response);
			} else if (action.equals("Edit")) {
				System.out.println("do Edit");
				RequestDispatcher rd = request.getRequestDispatcher("update.jsp");
				rd.forward(request, response);
			} else if (action.equals("Update")) {
				System.out.println("do Update");
				String makh = request.getParameter("txtMakh");
				String matkhau = request.getParameter("txtMatkhau");
				String hovaten = request.getParameter("txtHovaten");
				String email = request.getParameter("txtEmail");
				String dienthoai = request.getParameter("txtDienthoai");
				Customer kh = new Customer(makh, matkhau, hovaten, email, dienthoai);
				CustomerDAO.updateCustomer(kh);
				RequestDispatcher rd = request.getRequestDispatcher("search.jsp");
				rd.forward(request, response);
			} else if (action.equals("Search")) {
				System.out.println("do Search");
				String Hovaten = request.getParameter("txtHovaten");
				List<Customer> list = CustomerDAO.getListCustomer(Hovaten);
				System.out.println("size" + list.size());
				request.setAttribute("listKH", list);
				String url = "search.jsp";
				RequestDispatcher rd = request.getRequestDispatcher(url);
				rd.forward(request, response);
			} else if (action.equals("Delete")) {
				System.out.println("do Delete");
				String Makh = request.getParameter("txtMakh");
				boolean xoa = CustomerDAO.deleteCustomer(Makh);
				if (xoa) {
					String url = "ControllerCustomer?txtHovaten=&action=Search";
					RequestDispatcher rd = request.getRequestDispatcher(url);
					rd.forward(request, response);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
	}

}
