package edu.javacourse.studentorder.dao;

import edu.javacourse.studentorder.domain.wedding.StudentOrder;
import edu.javacourse.studentorder.exception.DaoException;

import java.util.List;

public interface StudentOrderDao {

    //TODO refactoring - make one method
    Long saveStudentOrder(StudentOrder so) throws DaoException;
    List<StudentOrder> getStudentOrders() throws DaoException;
}
