package edu.javacourse.studentorder;

import edu.javacourse.studentorder.domain.*;
import edu.javacourse.studentorder.domain.register.AnswerCityRegister;
import edu.javacourse.studentorder.domain.wedding.StudentOrder;
import edu.javacourse.studentorder.mail.MailSender;
import edu.javacourse.studentorder.validator.ChildrenValidator;
import edu.javacourse.studentorder.validator.CityRegisterValidator;
import edu.javacourse.studentorder.validator.StudentValidator;
import edu.javacourse.studentorder.validator.WeddingValidator;

import java.util.LinkedList;
import java.util.List;

public class StudentOrderValidator {
    private CityRegisterValidator cityRegisterValidator;
    private WeddingValidator weddingValidator;
    private ChildrenValidator childrenValidator;
    private StudentValidator studentValidator;
    private MailSender mailSender;

    public StudentOrderValidator() {
        cityRegisterValidator = new CityRegisterValidator();
//        weddingValidator = new WeddingValidator();
//        childrenValidator = new ChildrenValidator();
//        studentValidator = new StudentValidator();
//        mailSender = new MailSender();
    }

    public static void main(String[] args) {
        StudentOrderValidator sov = new StudentOrderValidator();
        sov.chekall();
    }

    public void chekall() {
        List<StudentOrder> soList = readStudentOrder();
        for (StudentOrder so : soList) {
            chekOneOrder(so);
        }
    }

    public void chekOneOrder(StudentOrder so) {
          AnswerCityRegister citiAnswer = chekCityRegister(so);
//        AnswerChekChildren answerChekChildren = chekChildren(so);
//        AnswerWedding answerWedding = chekWedding(so);
//        AnswerChekStudent answerChekStudent = chekStudent(so);
//
//        sendMail(so);
    }

    public List<StudentOrder> readStudentOrder() {
        List<StudentOrder> soList = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            StudentOrder so = SaveStudentOrder.buildStudentOrder(i);
            soList.add(so);
        }
        return soList;
    }

    public AnswerCityRegister chekCityRegister(StudentOrder so) {
        return cityRegisterValidator.checkCityRegister(so);
    }

    public AnswerWedding chekWedding(StudentOrder so) {
        return weddingValidator.chekWedding(so);
    }

    public AnswerChekChildren chekChildren(StudentOrder so) {
        return childrenValidator.chekChildren(so);
    }

    public AnswerChekStudent chekStudent(StudentOrder so) {
        return studentValidator.chekStudent(so);
    }

    public void sendMail(StudentOrder so) {
        mailSender.sendMail(so);
    }
}
