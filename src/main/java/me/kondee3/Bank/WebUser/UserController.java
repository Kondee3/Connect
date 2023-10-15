package me.kondee3.Bank.WebUser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1")
@CrossOrigin
public class UserController {

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    private final UserService userService;


    @GetMapping("/user/login")
    public List<WebUser> login(Model model) {
//        List<ChatUser> chatUserList = chatUserService.getUsers();

//        model.addAttribute("userName", chatUserList.get(0).getUserName());
//        model.addAttribute("name", "Konrad");

        return userService.getUsers();
    }

    @PostMapping("/user/register")
    public void registerNewChatUser(@RequestBody WebUser user){
        userService.addNewChatUser(user);
    }

//    @DeleteMapping(path = "{chatUserId}")
//    public void deleteChatUser(@PathVariable("chatUserId") Long chatUserId){
//        userService.deleteChatUser(chatUserId);
//    }

//    @PutMapping(path = "{chatUserId}")
//    public void updateChatUser(@PathVariable("chatUserId") Long chatUserId, @RequestParam(required = false) String userName, @RequestParam(required = false) String email){
//        userService.updateChatUser(chatUserId, userName, email);
//    }

}
