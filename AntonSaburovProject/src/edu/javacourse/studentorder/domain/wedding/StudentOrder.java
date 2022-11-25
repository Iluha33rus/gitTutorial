package edu.javacourse.studentorder.domain.wedding;



import edu.javacourse.studentorder.domain.StudentOrderStatus;
import edu.javacourse.studentorder.domain.wedding.Adult;
import edu.javacourse.studentorder.domain.wedding.Child;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class StudentOrder {
    private long studentOrderId;
    private LocalDateTime studentOrderDate;
    private StudentOrderStatus studentOrderStatus;



    private Adult husband;
    private Adult wife;
    private List<Child> children;

    String marriageCertificateId;
    LocalDate marriageDate;
    RegisterOffice marriageOffice;


    public void addChild(Child child) {
        if (children == null) {
            children = new ArrayList<>(5);
        }
        children.add(child);
    }

    public LocalDateTime getStudentOrderDate() {
        return studentOrderDate;
    }

    public void setStudentOrderDate(LocalDateTime studentOrderDate) {
        this.studentOrderDate = studentOrderDate;
    }

    public StudentOrderStatus getStudentOrderStatus() {
        return studentOrderStatus;
    }

    public void setStudentOrderStatus(StudentOrderStatus studentOrderStatus) {
        this.studentOrderStatus = studentOrderStatus;
    }

    public List<Child> getChildren() {
        return children;
    }

    public String getMarriageCertificateId() {
        return marriageCertificateId;
    }

    public void setMarriageCertificateId(String marriageCertificateId) {
        this.marriageCertificateId = marriageCertificateId;
    }

    public LocalDate getMarriageDate() {
        return marriageDate;
    }

    public void setMarriageDate(LocalDate marriageDate) {
        this.marriageDate = marriageDate;
    }


    public void setChildren(List<Child> children) {
        this.children = children;
    }

    public RegisterOffice getMarriageOffice() {
        return marriageOffice;
    }

    public void setMarriageOffice(RegisterOffice marriageOffice) {
        this.marriageOffice = marriageOffice;
    }

    public long getStudentOrderId() {
        return studentOrderId;
    }

    public void setStudentOrderId(long studentOrderId) {
        this.studentOrderId = studentOrderId;
    }

    public Adult getHusband() {
        return husband;
    }

    public void setHusband(Adult husband) {
        this.husband = husband;
    }

    public Adult getWife() {
        return wife;
    }

    public void setWife(Adult wife) {
        this.wife = wife;
    }

    public void setChild(Child child2) {
    }


}
