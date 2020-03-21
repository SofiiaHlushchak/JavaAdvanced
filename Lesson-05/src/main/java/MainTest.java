
import ua.lviv.lgs.service.UserService;
import ua.lviv.lgs.service.impl.UserServiceImpl;

public class MainTest {
 public static void main(String[] args ) {
	 UserService userService = new UserServiceImpl();
     System.out.println(userService.read(1));
     System.out.println(userService.readAll());
    

 }
}
