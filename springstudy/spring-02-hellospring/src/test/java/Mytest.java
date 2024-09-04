import com.kuang.pojo.Hello;
import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mytest {
    public static void main(String[] args) {
        //获取spring的上下文对象
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //注意为什么ClassPathXmlApplicationContext返回的对象是ApplicationContext类型，而不是Hello类型
        //对象在spring中管理，通过getBean方法获取对象
        Hello hello = (Hello) context.getBean("hello");
        System.out.println(hello);

    }
}
