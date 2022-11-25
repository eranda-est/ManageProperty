package com.property;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class propertyServlet
 */
@WebServlet("/propertyServlet")
public class propertyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		int ProID =Integer.parseInt ("proID");
		String proName = request.getParameter("proName"); 
		String location = request.getParameter("location");
		int price = Integer.parseInt("price");
		String des = request.getParameter("des");
		
		List<property> proDetails =propertyDBUtil.validate(ProID, proName, location, price, des);
		request.setAttribute("proDetails", proDetails);
		
		try {
			List <property> proDetails = propertDBUtil.validate(ProID,proName,location,price,des);;
		    request.setAttribute("proDetails", proDetails);
		}
		catch (Exception e){
			e.printStackTrace();
		}
		

		
		RequestDispatcher dis = request.getRequestDispatcher("AdminPanel.jsp");
		dis.forward(request, response); 
		
	} 

}
 