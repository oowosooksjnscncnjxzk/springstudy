import com.cz.pojo.Student;
import com.cz.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mtest {
    public static void main(String[] args) {
       ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student);
//        Student{
//        name='陈倬',
//        address=Address{address='北京'},
//        books=[《Java编程思想》, 《深入理解Java虚拟机》, 《Spring实战》],
//        hobbies=[篮球, 足球, 乒乓球],
//        scores={语文=80, 数学=90, 英语=85},
//                courses=[JavaWeb, Spring, Hibernate],
//        properties={age=25, gender=男}, wife='null'}

    }
    @Test
    public void test2(){
    ApplicationContext context = new ClassPathXmlApplicationContext("userbeans.xml");
        User user = context.getBean("user2", User.class);
        System.out.println(user);

    }

}
