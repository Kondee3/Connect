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

    public Optional<List<Mail>> getMails(String receiverEmail) {

        return mailRepository.findMailsByReceiverEmail(receiverEmail);
    }

    public void addMail(Mail mail) {

        mailRepository.save(mail);
    }

}
