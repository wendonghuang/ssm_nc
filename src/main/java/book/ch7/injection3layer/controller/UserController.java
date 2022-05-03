package book.ch7.injection3layer.controller;
import book.ch7.injection3layer.service.UserService;
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
}
