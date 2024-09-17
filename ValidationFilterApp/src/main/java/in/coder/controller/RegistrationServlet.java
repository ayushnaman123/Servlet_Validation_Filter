package in.coder.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.coder.dao.EmployeeDaoImpl;
import in.coder.dao.IEmployeeDao;
import in.coder.dto.Employee;

/**
 * Servlet implementation class RegistrationServlet
 */
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String eid = request.getParameter("eid");
		String ename = request.getParameter("ename");
		String eage = request.getParameter("eage");
		String email = request.getParameter("email");
		String emobile = request.getParameter("emobile");
		
		IEmployeeDao employeeDao = new EmployeeDaoImpl();
		
		Employee employee = new Employee();
		employee.seteId(eid);
		employee.seteName(ename);
		employee.seteAge(Integer.parseInt(eage));
		employee.seteMail(email);
		employee.seteMobile(emobile);
		
		String status = employeeDao.doInsert(employee);
		
		PrintWriter out = response.getWriter();
		out.println("<html><head><title>Output</title></head>");
		out.println("<body>");
		out.println("<center>");
		out.println("<h1 style='color:red; text-align:center;'>Employee Registration Details</h1>");
		out.println("<table border='1'>");
		out.println("<tr><th>EID</th><td>" + eid + "</td></tr>");
		out.println("<tr><th>ENAME</th><td>" + ename + "</td></tr>");
		out.println("<tr><th>EAGE</th><td>" + eage + "</td></tr>");
		out.println("<tr><th>EMAIL</th><td>" + email + "</td></tr>");
		out.println("<tr><th>MOBILE</th><td>" + emobile + "</td></tr>");
		out.println("<tr><th>STATUS</th><td>" + status + "</td></tr>");
		out.println("</table>");
		out.println("</center>");
		out.println("</body>");
		out.println("</html>");
		out.close();
	}

}
