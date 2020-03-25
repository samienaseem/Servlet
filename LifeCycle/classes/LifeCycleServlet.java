import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletConfig;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet.*;
public class LifeCycleServlet extends HttpServlet{

	public LifeCycleServlet() {

		System.out.println("<>LifeCycleServlet: 0 param Constructor");
	}

	public void init(ServletConfig config){

		System.out.println("<>LifeCycleServlet: init called");


	}

	public void service(HttpServletRequest req, HttpServletResponse res)throws IOException{

		System.out.println("<>LifeCycleServlet: service method called");

		res.setContentType("Text/html");
		PrintWriter pw=res.getWriter();
		System.out.println("<Strong>Date: <Strong>"+new java.util.Date().toString());

		pw.close();

	}
	public void destroy(){

		System.out.println("<>LifeCycleServlet: destroy method called");
	}
}