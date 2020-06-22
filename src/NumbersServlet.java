import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/calcmeter")
public class NumbersServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String meters = request.getParameter("metry");
        String centimeters = request.getParameter("centymetry");
        String milimeters = request.getParameter("milimetry");

        String result = "";
        if(meters != null) {
            result += "metry: " + meters;
        } else {
          //  result += metoda która przelicza centymetry lub milimetry na metry ;
        }

        if(centimeters != null) {
            result += "centymetry: " + centimeters;
        } else {
          //  result += metoda która przelicza metry i milimetry na centymetry;
        }

        if(milimeters != null) {
            result += "milimetry: " + milimeters;
        } else {
           // result += metoda która przelicza metry lub centymetry na milimetry;
        }

        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");

        response.getWriter().println(result);

    }
}
