
package edu.javacourse.studentorder.domain.register;

import java.util.ArrayList;
import java.util.List;

public class AnswerCityRegister {
    private List<AnswerCityRegisterItem> items;

    public List<AnswerCityRegisterItem> getItems() {
        return items;
    }

    public void add(AnswerCityRegisterItem item) {
        if (items == null) {
            items = new ArrayList<>(10);
        }
        items.add(item);
    }
}

