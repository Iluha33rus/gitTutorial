package edu.javacourse.studentorder.validator;

import edu.javacourse.studentorder.domain.AnswerWedding;
import edu.javacourse.studentorder.domain.StudentOrder;

public class WeddingValidator {
    public AnswerWedding chekWedding(StudentOrder so) {
        System.out.println("Wedding is running..");
        return new AnswerWedding();
    }
}
