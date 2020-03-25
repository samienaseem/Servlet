import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/curl")
public class CalculatorServlet extends HttpServlet
{

protected void service(HttpServletRequest request,
HttpServletResponse response) throws ServletException,
IOException
{

response.setContentType("text/html");
PrintWriter pw=response.getWriter();
// read Form Data
int a=Integer.parseInt(request.getParameter("a"));
int b=Integer.parseInt(request.getParameter("b"));
//Read caption of Submit Button
String caption=request.getParameter("s1");
if (caption.equals("add")) {

pw.print("Hi Welcome to my calculator");
pw.print("<br>you have clicked the Add button");
pw.print("<br>Sum of A and B is :"+(a+b));

}

else if (caption.equals("Sub")) {
pw.print("Hi Welcome to my calculator");
pw.print("<br>you have clicked the Sub button");
pw.print("<br>Subtraction of A and B is :"+(a-b));
}
else if (caption.equals("Div")) {

pw.print("Hi Welcome to my calculator");
pw.print("<br>you have clicked the Div button");
pw.print("<br>Division of A and B is :"+(a/b));

}
pw.close();

}

}