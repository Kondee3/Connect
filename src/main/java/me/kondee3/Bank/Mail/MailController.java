package me.kondee3.Bank.Mail;

import me.kondee3.Bank.WebUser.LoginUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
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


    @RequestMapping("/user/post/getmails")
    public List<Mail> getMails(@RequestBody LoginUser user) {
            return mailService.getMails(user.getEmail()).get();
    }

    @PostMapping("/user/post/sendmail")
    public void registerNewChatUser(@RequestBody Mail mail){
        mailService.addMail(mail);
    }

}
