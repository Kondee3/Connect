package me.kondee3.Bank.Mail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1")
@CrossOrigin
public class MailController {

    @Autowired
    public MailController(MailService mailService) {
        this.mailService = mailService;
    }

    private final MailService mailService;


    @PostMapping("/user/getmails")
    public List<Mail> getMails(@RequestBody String receiverEmail) {
//        List<ChatUser> chatUserList = chatUserService.getUsers();

//        model.addAttribute("userName", chatUserList.get(0).getUserName());
//        model.addAttribute("name", "Konrad");


            return mailService.getMails(receiverEmail).get();

    }

    @PostMapping("/user/sendmail")
    public void registerNewChatUser(@RequestBody Mail mail){
        mailService.addMail(mail);
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
