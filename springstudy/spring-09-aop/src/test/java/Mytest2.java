import com.cz.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mytest2 {
    public static void main(String[] args) {
       ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserService userservice = (UserService) context.getBean("userServiceImpl");
        userservice.add();
    }
}
