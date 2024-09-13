import com.cz.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mytest {
    @Test
    public void test() {
     ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
     User user = (User) context.getBean("user");
        System.out.println(user.name);
    }
}
