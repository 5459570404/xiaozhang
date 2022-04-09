package com.xiaozhang.admin.utils;

import javax.mail.Address;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Date;
import java.util.Properties;

/**
 * @autor：张天治
 * @time:2018/12/20 21:14
 * @desc：
 */
public class WYEmailUtil {
    public static void SendEmail(String sender,String password,String receive,String subject,String text ){
        Properties props=new Properties();
        props.setProperty("mail.transport.protocol", "smtp");
        props.setProperty("mail.smtp.host","smtp.163.com");
        props.setProperty("mail.smtp.port", "25");
        props.setProperty("mail.smpt.auth","fasle");
        Session session= Session.getInstance(props);
        session.setDebug(true);
        try {
            MimeMessage message = createMimeMessage(session,sender,receive,subject,text);
            Transport transport = session.getTransport();
            transport.connect(sender,password);
            transport.sendMessage(message,message.getAllRecipients());
            transport.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private static MimeMessage createMimeMessage(Session session, String sender, String receive, String subject, String text) throws Exception{
        MimeMessage message=new MimeMessage(session);
        Address address=new InternetAddress(sender,sender,"UTF-8");
        message.setFrom(address);
        message.setSubject(subject,"UTF-8");
        message.setContent(text,"text/html;charset=utf-8");
        message.setRecipient(MimeMessage.RecipientType.TO,new InternetAddress(receive,receive,"UTF-8"));
        message.setSentDate(new Date());
        message.saveChanges();
        return message;
    }
}
