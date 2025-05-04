import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
@WebServlet(urlPatterns = "/powerbank",loadOnStartup = 1)
public class PowerBank extends GenericServlet {


    public PowerBank(){
        System.out.println("no arg const of Powerbank");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("running powerbank servlet");
        String name
    }
}
