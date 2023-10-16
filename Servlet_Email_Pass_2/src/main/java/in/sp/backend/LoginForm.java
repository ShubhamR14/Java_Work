package in.sp.backend;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import jakarta.websocket.Session;

@WebServlet("/submit")
public class LoginForm extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String Email =(String) req.getParameter("email");
		String Password = (String) req.getParameter("password");
		
		PrintWriter out=resp.getWriter();
		
		if(Email.equals("shubham@gmail.com") && Password.equals("Shubham"))
		{
//				req.setAttribute("name_key","Shubham Rathod");
			
			HttpSession session=req.getSession();
			session.setAttribute("name_key", "Shubham Rathod");
			
			RequestDispatcher rd=req.getRequestDispatcher("/profile.jsp");
			rd.forward(req, resp);
		}
		
		
		else
		{
			resp.setContentType("text/html");
			out.println(" <h2 style='colour:red'> Login Dosent Match user and password </h2>");
			RequestDispatcher rd=req.getRequestDispatcher("/Index.html");
			rd.include(req, resp);
		}
	
	}

}
