package edu.javacourse.studentorder;

import edu.javacourse.studentorder.dao.StudentDaoImpl;
import edu.javacourse.studentorder.dao.StudentOrderDao;
import edu.javacourse.studentorder.domain.wedding.*;

import java.time.LocalDate;

public class SaveStudentOrder {
    public static void main(String[] args) throws Exception {
//        List<Street> d = new DictionaryDaoImpl().findStreets("");
//        for (Street s : d) {
//            System.out.println(s.getName());
//        }
//        List<PassportOffice> po = new DictionaryDaoImpl().findPassportOffice("010020000000");
//        for (PassportOffice p : po) {
//            System.out.println(p.getOfficeName());
//        }
//        List<RegisterOffice> ro = new DictionaryDaoImpl().findRegisterOffice("010010000000");
//        for (RegisterOffice r : ro) {
//            System.out.println(r.getOfficeName());
//        }
//        List<CountryArea> ca1 = new DictionaryDaoImpl().findAreas("");
//        for (CountryArea r : ca1) {
//            System.out.println(r.getAreaID() + ":" + r.getAreaName());
//        }
//        System.out.println("<--->");
//        List<CountryArea> ca2 = new DictionaryDaoImpl().findAreas("020000000000");
//        for (CountryArea r : ca2) {
//            System.out.println(r.getAreaID() + ":" + r.getAreaName());
//        }
//        System.out.println("<--->");
//        List<CountryArea> ca3 = new DictionaryDaoImpl().findAreas("020010000000");
//        for (CountryArea r : ca3) {
//            System.out.println(r.getAreaID() + ":" + r.getAreaName());
//        }
//        System.out.println("<--->");
//        List<CountryArea> ca4 = new DictionaryDaoImpl().findAreas("020010010000");
//        for (CountryArea r : ca4) {
//            System.out.println(r.getAreaID() + ":" + r.getAreaName());
//        }

        StudentOrder s = buildStudentOrder(1);
        StudentOrderDao dao = new StudentDaoImpl();
        Long id = dao.saveStudentOrder(s);
        System.out.println(id);






//        StudentOrder so = new StudentOrder();
//        long ans = saveStudentOrder(so);

    }

    static long saveStudentOrder(StudentOrder studentOrder) {
        long answer = 199;
        System.out.println("saveStudentOrder is running.. ");
        return answer;
    }

    static StudentOrder buildStudentOrder(long id) {

        StudentOrder so = new StudentOrder();
        so.setStudentOrderId(id);
        so.setMarriageCertificateId("" + (123456000 + id));
        so.setMarriageDate(LocalDate.of(2016, 7, 4));

        RegisterOffice ro = new RegisterOffice(1L, "", " ");
        so.setMarriageOffice(ro);

        Street street = new Street(12L, "First street");
        Address address = new Address("195000",street, "12", "a", "142");

        //муж
        Adult husband = new Adult("Петров", "Виктор", "Сергеевич", LocalDate.of(1997, 8, 24));
        husband.setPassportSeria("" + (1000 + id));
        husband.setPassportNumber("" + (100000 + id));
        husband.setIssueDate(LocalDate.of(2017, 9, 15));
        PassportOffice po1 = new PassportOffice(1L, "", "");
        husband.setIssueDepartment(po1);
        husband.setStudentID("" + (100000 + id));
        husband.setAddress(address);
        //жена
        Adult wife = new Adult("Петрова", "Вероника", "Алексеевна", LocalDate.of(1998, 3, 12));
        wife.setPassportSeria("" + (2000 + id));
        wife.setPassportNumber("" + (200000 + id));
        wife.setIssueDate(LocalDate.of(2018, 4, 5));
        PassportOffice po2 = new PassportOffice(1L, "", "");
        wife.setIssueDepartment(po2);
        wife.setStudentID("" + (200000 + id));
        wife.setAddress(address);
        //ребенок
        Child child1 = new Child("Петрова", "Ирина", "Викторовна", LocalDate.of(2018, 6, 29));
        child1.setCertificateNumber("" + (300000 + id));
        child1.setIssueDate(LocalDate.of(2018, 7, 19));
        RegisterOffice ro2 = new RegisterOffice(1L, "", " ");
        child1.setIssueDepartment(ro2);
        child1.setAddress(address);
        // ребёнок
        Child child2 = new Child("Петрова", "Евгений", "Викторович", LocalDate.of(2018, 6, 29));
        child2.setCertificateNumber("" + (400000 + id));
        child2.setIssueDate(LocalDate.of(2018, 6, 11));
        RegisterOffice ro3 = new RegisterOffice(1L, "", " ");
        child2.setIssueDepartment(ro3);
        child2.setAddress(address);

        so.setHusband(husband);
        so.setWife(wife);
        so.addChild(child1);
        so.addChild(child2);

        return so;
    }

}
