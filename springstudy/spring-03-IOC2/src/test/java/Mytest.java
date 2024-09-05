import com.cz.pojo.User;
import com.cz.pojo.userT;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mytest {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        User user = (User) context.getBean("user");
        user.show();

        //
        ApplicationContext context1 = new ClassPathXmlApplicationContext("beans.xml");
        userT user2 = (userT)context1.getBean("user2");
        user2.show();
    }
}
