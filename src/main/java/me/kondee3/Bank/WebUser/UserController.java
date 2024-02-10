package me.kondee3.Bank.WebUser;

import org.apache.juli.logging.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
//http://localhost:5173/api/v1/user/login/oauth2/code/google
@RestController
@CrossOrigin
@RequestMapping(path = "api/v1")

public class UserController {

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    private final UserService userService;


    @PostMapping("/user/login")
    public HttpStatus login(@RequestBody LoginUser user) {
        return  userService.loginUser(user);
    }

    @PostMapping("/user/register")
    public HttpStatus registerNewChatUser(@RequestBody WebUser user){
        return userService.addNewChatUser(user);
    }
}
