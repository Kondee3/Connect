package me.kondee3.Bank.WebUser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {


    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<WebUser> getUsers() {
        return userRepository.findAll();
    }

    public void addNewChatUser(WebUser user) {
        Optional<WebUser> chatUserOptional = userRepository.findChatUserByEmail(user.getEmail());
        if (chatUserOptional.isPresent())
            throw new IllegalStateException("Email taken!");
        userRepository.save(user);
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
