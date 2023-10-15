package me.kondee3.Bank.Mail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MailService {


    private final MailRepository mailRepository;

    @Autowired
    public MailService(MailRepository mailRepository) {
        this.mailRepository = mailRepository;
    }

    public Optional<List<Mail>> getMails(String receiver_email) {
        return mailRepository.findMailsByReceiverEmail(receiver_email);
    }

    public void addMail(Mail mail) {

        mailRepository.save(mail);
    }

//    public void deleteChatUser(Long chatUserID) {
//
//        boolean exists = userRepository.existsById(chatUserID);
//        if (!exists)
//            throw new IllegalStateException("Chat User with id: " + chatUserID + " does not exist!");
//        userRepository.deleteById(chatUserID);
//    }

//    @Transactional
//    public void updateChatUser(Long chatUserId, String userName, String email) {
//        User user = userRepository.findById(chatUserId).orElseThrow(() -> new IllegalStateException(
//                "Chat User with id " + chatUserId + " does not exist!"
//        ));
//
//        if (userName != null && userName.length() > 0 && !Objects.equals(user.getUsername(), userName))
//            user.setUsername(userName);
//
//        if (email != null && email.length() > 0 && !Objects.equals(user.getEmail(), email)) {
//            Optional<User> chatUserOptional = userRepository.findChatUserByEmail(email);
//            if (chatUserOptional.isPresent())
//                throw new IllegalStateException("Email taken!");
//            user.setEmail(email);
//        }
//    }
}
