package com.example.libraryofbooks.practise.lesson_14_streamapi.lessoncode.searchcriteria;

import javaguru.lv.teacher.lesson_14_streamapi.lessoncode.Fruit;
import javaguru.lv.teacher.lesson_14_streamapi.lessoncode.FruitSearchCriteria;

public class TomatoSearchCriteria implements FruitSearchCriteria {

    @Override
    public boolean test(Fruit fruit) {
        return fruit.getTitle().equals("pear");
    }
}
