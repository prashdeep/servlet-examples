import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyContextListerner implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		System.out.println("Context/Application is  shutting down.");
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		System.out.println("Context/Application is  starting.");
	}
}
