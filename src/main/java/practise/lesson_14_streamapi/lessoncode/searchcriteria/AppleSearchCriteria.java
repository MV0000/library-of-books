package practise.lesson_14_streamapi.lessoncode.searchcriteria;

import javaguru.lv.teacher.lesson_14_streamapi.lessoncode.Fruit;
import javaguru.lv.teacher.lesson_14_streamapi.lessoncode.FruitSearchCriteria;

public class AppleSearchCriteria implements FruitSearchCriteria {

    @Override
    public boolean test(Fruit fruit) {
        return "apple".equals(fruit.getTitle());
    }

}
