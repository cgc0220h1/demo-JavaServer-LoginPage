import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

/*
 * @project demo-JavaServer-LoginPage
 * @author Duc on 5/13/2020
 */
@WebServlet(name = "LoginServlet", urlPatterns ="/login")
public class LoginServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        try (PrintWriter printWriter = response.getWriter()) {
            printWriter.println("<html>");
            if (username.equals("admin") && password.equals("admin")) {
                printWriter.println("<h1>Welcome " + username + "<h1>");
            } else {
                printWriter.println("<h1>Login Error</h1>");
            }
            printWriter.println("</html>");
        }
    }
}
