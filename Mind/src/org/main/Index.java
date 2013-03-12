package org.main;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Index.
 */
public class Index extends HttpServlet {
	private static final long serialVersionUID = 1L;
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Index() {
		super();

	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		//������ HTML ��������
		out.println("<Html>");
		out.println("<Head>");
		out.println("<Title>");
		out.println("Index Pages");
		out.println("</Title>");
		out.println("</Head>");
		out.println("<Body>");
		//����������� Bootstrap � ������ ��������
		out.println(org.BootStrapConnection.CSSinclude.HTMLBOOTSTRAPLINK);
		out.println(org.BootStrapConnection.JSinclude.HTMLBOOTSTRAPSCRIPT);

		out.println("</Body>");
		out.println("</Html>");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
	}

}
