package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.CelsToFahrenConverter;

/**
 * Servlet implementation class celsToFahrenServlet
 */
@WebServlet("/celsToFahrenServlet")
public class celsToFahrenServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public celsToFahrenServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
String celsius = request.getParameter("celsius");
		
		CelsToFahrenConverter userTemp = new
		CelsToFahrenConverter(Double.parseDouble(celsius));
				
		request.setAttribute("fahrenheitResult", userTemp);
		
		getServletContext().getRequestDispatcher("/CelsToFahrenResult.jsp").forward(request, response);
	}

}
