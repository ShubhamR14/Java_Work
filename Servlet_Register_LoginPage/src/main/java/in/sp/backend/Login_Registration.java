package in.sp.backend;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/regform")
public class Login_Registration extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		PrintWriter out=resp.getWriter();
		
		String Name=req.getParameter("name1");
		String Email=req.getParameter("email1");
		String Password=req.getParameter("pass");
		String Gender=req.getParameter("gender");
		String City=req.getParameter("city");
	
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/shubham","root","Nopass@123");
			
			PreparedStatement s=con.prepareStatement("insert into register values(?,?,?,?,?)");
			s.setString(1,Name);
			s.setString(2,Email);
			s.setString(3,Password);
			s.setString(4,Gender);
			s.setString(5,City);
		
			int count =s.executeUpdate();
			if(count > 0) {
				
				resp.setContentType("text/html; charset=utf-8");
				out.print("<h3 sytle='colour:green'> User Register Sucessfully </h3> ");
				RequestDispatcher rd = req.getRequestDispatcher("/register_Form.jsp");
				rd.include(req, resp);
			}
			
			else {
				resp.setContentType("text/html");
				out.print("<h3 style='color:red' > User Fail </h3>");
				
				RequestDispatcher rd = req.getRequestDispatcher("/register_Form.jsp");
				rd.include(req, resp);
			}
			
		}
		
		catch(Exception e) {
			e.printStackTrace();
			
			
			resp.setContentType("text/html");
			out.print("<h1 style='color:red' > User fail due to back end problem "+e.getMessage()+"</h1>");
			
			RequestDispatcher rd = req.getRequestDispatcher("/register_Form.jsp");
			rd.include(req, resp);
		}
	}
}
