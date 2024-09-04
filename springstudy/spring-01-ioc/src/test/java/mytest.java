import com.kuang.dao.UserDaoImpl;
import com.kuang.services.UserService;
import com.kuang.services.UserServiceImpl;

public class mytest {
    public static void main(String[] args) {
        //用户实际调用的是业务层，不接触Dao层
       UserService userService = new UserServiceImpl();
        //userService.getUser(); //报错，因为没有实现接口方法
        ((UserServiceImpl) userService).setUserDao(new UserDaoImpl());
        //好
        userService.getUser();
    }
}
