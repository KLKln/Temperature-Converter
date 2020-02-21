package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.FahrenToCelsConverter;

/**
 * Servlet implementation class fahrenToCelsServlet
 */
@WebServlet("/fahrenToCelsServlet")
public class fahrenToCelsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public fahrenToCelsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String fahrenheit =request.getParameter("fahrenheit");
		
		FahrenToCelsConverter userTemp = new
		FahrenToCelsConverter(Double.parseDouble(fahrenheit));		
		
		request.setAttribute("celsiusResult", userTemp);
		
		getServletContext().getRequestDispatcher("/fahrenToCelsResult.jsp").forward(request, response);
	}

}
