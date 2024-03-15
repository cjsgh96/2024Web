package cjsgh;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/mainpagelogin")
public class Login extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.getRequestDispatcher("WEB-INF/views/mainpagelogin.jsp").forward(request, response);
		
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		if(id.equals(pw)) {
			
			HttpSession session = request.getSession();
			session.setAttribute("id", id);
			
			request.getRequestDispatcher("WEB-INF/views/main.jsp").forward(request, response);
		
		}else {
			request.getRequestDispatcher("WEB-INF/views/mainpagelogin.jsp").forward(request, response);
		}
		
	}
}
