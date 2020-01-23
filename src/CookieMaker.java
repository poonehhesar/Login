

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import a.Package.aBean;

/**
 * Servlet implementation class CookieMaker
 */
@WebServlet("/CookieMaker")
public class CookieMaker extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CookieMaker() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.getWriter().append("Served at: ").append(request.getContextPath());


	}
		
		

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		aBean bean=new aBean();
		
		try {

			response.setContentType("text/html");
			PrintWriter out = response.getWriter();

			String c = request.getParameter("username");
			out.print("Welcome " + c);

			Cookie ck[] = request.getCookies();
			out.print("Hello " + ck[0].getValue());
			out.close();			

		} catch (Exception e) {
			System.out.println(e);
		}
		
		Cookie cookie2 = new Cookie("username", bean.getName());
		response.addCookie(cookie2);;
		cookie2.setMaxAge(30*60);

	}

}
