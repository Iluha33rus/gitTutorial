package edu.javacourse.studentorder.domain.register;

import edu.javacourse.studentorder.domain.Person;

import java.util.ArrayList;
import java.util.List;

public class AnswerCityRegisterItem {

    public static class CityError {
        private String code;
        private String text;

        public String getCode() {
            return code;
        }

        public String getText() {
            return text;
        }

        public CityError(String code, String text) {
            this.code = code;
            this.text = text;
        }
    }
    private CityStatus status;
    private Person person;
    private CityError error;
    public enum CityStatus {
        YES, NO, ERROR
    }

    public CityStatus getStatus() {
        return status;
    }

    public Person getPerson() {
        return person;
    }

    public CityError getError() {
        return error;
    }

    public AnswerCityRegisterItem(CityStatus status, Person person) {
        this.status = status;
        this.person = person;
    }

    public AnswerCityRegisterItem(CityStatus status, Person person, CityError error) {
        this.status = status;
        this.person = person;
        this.error = error;
    }

}
