package me.kondee3.Bank.WebUser;

import org.apache.juli.logging.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.Optional;

@Service
public class UserService {


    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }



    public HttpStatus loginUser(LoginUser user) {
        Optional<WebUser> webUserOptional = userRepository.findWebUserByEmail(user.getEmail());
        if (!webUserOptional.map(webUser -> Objects.equals(webUser.getPassword(), user.getPassword())).orElse(false))
            return HttpStatus.UNAUTHORIZED;
        return HttpStatus.ACCEPTED;
    }

    public HttpStatus addNewChatUser(WebUser user) {
        Optional<WebUser> chatUserOptional = userRepository.findWebUserByEmail(user.getEmail());
        if (chatUserOptional.isPresent())
            return HttpStatus.CONFLICT;
        userRepository.save(user);
        return HttpStatus.ACCEPTED;
    }
}
