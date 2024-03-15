package PP;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/acornlist")
public class AcornList extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		AcornService service = new AcornService();
		
		ArrayList<Acorn> list	= service.getMemberReal();
		
		request.setAttribute("list", list);
		
		request.getRequestDispatcher("WEB-INF/list.jsp").forward(request, response);
	}
}
