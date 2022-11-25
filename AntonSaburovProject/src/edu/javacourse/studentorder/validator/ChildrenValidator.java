package edu.javacourse.studentorder.validator;

import edu.javacourse.studentorder.domain.AnswerChekChildren;
import edu.javacourse.studentorder.domain.wedding.StudentOrder;

public class ChildrenValidator {
    public AnswerChekChildren chekChildren(StudentOrder so) {
        System.out.println("Chek children is running ");
        return new AnswerChekChildren();
    }
}
