package me.kondee3.Bank.Mail;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.hibernate.annotations.UuidGenerator;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table()
public class Mail {
    @Id
    @UuidGenerator
    private UUID id;

    private String senderEmail;
    private String receiverEmail;
    private LocalDate timeSent;
    private String title;
    private String content;
    public Mail(String senderEmail, String receiverEmail, LocalDate timeSent, String title, String content) {
        this.senderEmail = senderEmail;
        this.receiverEmail = receiverEmail;
        this.timeSent = timeSent;
        this.title = title;
        this.content = content;

    }


    public String getSenderEmail() {
        return senderEmail;
    }

    public void setSenderEmail(String senderEmail) {
        this.senderEmail = senderEmail;
    }

    public String getReceiverEmail() {
        return receiverEmail;
    }

    public void setReceiverEmail(String receiverEmail) {
        this.receiverEmail = receiverEmail;
    }

    public LocalDate getTimeSent() {
        return timeSent;
    }

    public void setTimeSent(LocalDate timeSent) {
        this.timeSent = timeSent;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }




    public Mail() {
    }


}
