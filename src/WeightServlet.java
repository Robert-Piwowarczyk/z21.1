import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/calcweight")
public class WeightServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String kilograms = request.getParameter("kilogramy");
        String grams = request.getParameter("gramy");
        String miligrams = request.getParameter("miligramy");

        String result = "";
        if(kilograms != null) {
            result += "kilogramy: " +kilograms;
        } else {
            //  result += metoda która przelicza miligramy lub gramy na kilogramy ;
        }

        if(grams != null) {
            result += "gramy: " + grams;
        } else {
            //  result += metoda która przelicza kilogramy lub miligramy na gramy ;
        }

        if(miligrams != null) {
            result += "milgramy: " + miligrams;
        } else {
            //  result += metoda która przelicza kilogramy lub gramy na miligramy ;
        }

        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");

        response.getWriter().println(result);

    }
}
