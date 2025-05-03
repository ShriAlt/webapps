import sun.print.PSStreamPrinterFactory;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
@WebServlet(urlPatterns = "/water",loadOnStartup = 1)
public class WaterServlet extends GenericServlet {
    public  WaterServlet(){
        System.out.println("instance created fire tomcat");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("running method water tomcat");
        String name=servletRequest.getParameter("name");
        String location=servletRequest.getParameter("location");
        String quantity=servletRequest.getParameter("quality");
        System.out.println(name);
        System.out.println(location);
        System.out.println(quantity);
    }
}
