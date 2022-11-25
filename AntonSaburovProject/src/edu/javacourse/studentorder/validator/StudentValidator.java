package edu.javacourse.studentorder.validator;

import edu.javacourse.studentorder.domain.AnswerChekStudent;
import edu.javacourse.studentorder.domain.StudentOrder;

public class StudentValidator {
    public AnswerChekStudent chekStudent(StudentOrder so) {
        System.out.println("chekStudent is running");
        return new AnswerChekStudent();
    }
}
