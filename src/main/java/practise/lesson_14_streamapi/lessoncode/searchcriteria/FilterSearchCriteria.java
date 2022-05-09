package practise.lesson_14_streamapi.lessoncode.searchcriteria;

import javaguru.lv.teacher.lesson_14_streamapi.lessoncode.Fruit;

import java.util.function.Predicate;

public class FilterSearchCriteria implements Predicate<Fruit> {

    @Override
    public boolean test(Fruit fruit) {
        return "apple".equals(fruit.getTitle());
    }

}
