import com.kuang.dao.UserDaoImpl;
import com.kuang.services.UserService;
import com.kuang.services.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mytest {
    public static void main(String[] args) {
//        //用户实际调用的是业务层，不接触Dao层
//       UserService userService = new UserServiceImpl();
//        //userService.getUser(); //报错，因为没有实现接口方法
//        ((UserServiceImpl) userService).setUserDao(new UserDaoImpl());
//        //好
//        userService.getUser();
        //获取ApplicationContext对象
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //只要创建好容器之后需要什么就去GET什么
        UserServiceImpl userService = (UserServiceImpl) context.getBean("UserService");
        //整个过程没有自主创建对象，都是通过容器来获取对象
        userService.getUser();
    }
}
