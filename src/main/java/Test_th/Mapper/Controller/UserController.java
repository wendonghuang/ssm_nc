package Test_th.Mapper.Controller;

import Test_th.Mapper.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
    @Autowired
    private UserService userService;
    public String addUser(){
        userService.insert();
        return "index";
    }
    public String dlUser(){
        userService.delete();
        return "index1";
    }
    public String upUser(){
        userService.update();
        return "index2";
    }
    public String seUser(){
        userService.select();
        return "index3";
    }

}

