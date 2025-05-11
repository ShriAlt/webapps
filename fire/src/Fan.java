import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/fan" , loadOnStartup = 1)
public class Fan extends GenericServlet {
    public Fan(){
        System.out.println("running the servlet by tom cat");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

        System.out.println("running the fan Servlet");
        String name=servletRequest.getParameter("name");
        System.out.println(name);
    }
}
