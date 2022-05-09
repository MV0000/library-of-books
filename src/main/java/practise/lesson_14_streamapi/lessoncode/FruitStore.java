package practise.lesson_14_streamapi.lessoncode;

import com.example.libraryofbooks.practise.lesson_14_streamapi.lessoncode.Fruit;
import com.example.libraryofbooks.practise.lesson_14_streamapi.lessoncode.FruitSearchCriteria;

import java.util.ArrayList;
import java.util.List;

public class FruitStore {

    private List<com.example.libraryofbooks.practise.lesson_14_streamapi.lessoncode.Fruit> fruits = new ArrayList<>();

    public FruitStore() {
        fruits.add(new com.example.libraryofbooks.practise.lesson_14_streamapi.lessoncode.Fruit("apple", "red", 100));
        fruits.add(new com.example.libraryofbooks.practise.lesson_14_streamapi.lessoncode.Fruit("apple", "green", 200));
        fruits.add(new com.example.libraryofbooks.practise.lesson_14_streamapi.lessoncode.Fruit("pear", "red", 100));
        fruits.add(new com.example.libraryofbooks.practise.lesson_14_streamapi.lessoncode.Fruit("pear", "yellow", 100));
        fruits.add(new com.example.libraryofbooks.practise.lesson_14_streamapi.lessoncode.Fruit("tomato", "red", 100));
    }

    public List<com.example.libraryofbooks.practise.lesson_14_streamapi.lessoncode.Fruit> getAllFruits() {
        return fruits;
    }

    // Требование 1: отобрать все яблоки
    public List<com.example.libraryofbooks.practise.lesson_14_streamapi.lessoncode.Fruit> getAllApples() {
        return getAllFruits("apple");
    }


    // Требование 2: отобрать все груши
    public List<com.example.libraryofbooks.practise.lesson_14_streamapi.lessoncode.Fruit> getAllPears() {
        return getAllFruits("pear");
    }


    // Требование 3: отобрать все помидоры
    public List<com.example.libraryofbooks.practise.lesson_14_streamapi.lessoncode.Fruit> getAllTomatos() {
        return getAllFruits("tomato");
    }

    public List<com.example.libraryofbooks.practise.lesson_14_streamapi.lessoncode.Fruit> getAllFruits(String title) {
        List<com.example.libraryofbooks.practise.lesson_14_streamapi.lessoncode.Fruit> resultList = new ArrayList<>();
        for (com.example.libraryofbooks.practise.lesson_14_streamapi.lessoncode.Fruit fruit : fruits) {
            if (fruit.getTitle().equals(title)) {
                resultList.add(fruit);
            }
        }
        return resultList;
    }

    // Требование 4: красные фрукты
    public List<com.example.libraryofbooks.practise.lesson_14_streamapi.lessoncode.Fruit> findAllFruitsByColor(String fruitColor) {
        List<com.example.libraryofbooks.practise.lesson_14_streamapi.lessoncode.Fruit> resultList = new ArrayList<>();
        for (com.example.libraryofbooks.practise.lesson_14_streamapi.lessoncode.Fruit fruit : fruits) {
            if (fruit.getColor().equals(fruitColor)) {
                resultList.add(fruit);
            }
        }
        return resultList;
    }

    public List<com.example.libraryofbooks.practise.lesson_14_streamapi.lessoncode.Fruit> findAllFruitsByWeight(int fruitWeight) {
        List<com.example.libraryofbooks.practise.lesson_14_streamapi.lessoncode.Fruit> resultList = new ArrayList<>();
        for (com.example.libraryofbooks.practise.lesson_14_streamapi.lessoncode.Fruit fruit : fruits) {
            if (fruit.getWeight() == fruitWeight) {
                resultList.add(fruit);
            }
        }
        return resultList;
    }


    // Требование 5: красные помидоры
    public List<com.example.libraryofbooks.practise.lesson_14_streamapi.lessoncode.Fruit> findFruitsByTitleAndColor(String fruitTitle,
                                                                                                                    String fruitColor) {
        List<com.example.libraryofbooks.practise.lesson_14_streamapi.lessoncode.Fruit> resultList = new ArrayList<>();
        for (com.example.libraryofbooks.practise.lesson_14_streamapi.lessoncode.Fruit fruit : fruits) {
            if (fruit.getColor().equals(fruitColor) &&
                    fruit.getTitle().equals(fruitTitle)) {
                resultList.add(fruit);
            }
        }
        return resultList;
    }


    // Требование 6: красные помидоры > 100
    public List<com.example.libraryofbooks.practise.lesson_14_streamapi.lessoncode.Fruit> findFruitsByTitleAndColorAndWeight(String fruitTitle,
                                                                                                                             String fruitColor,
                                                                                                                             int weight) {
        List<com.example.libraryofbooks.practise.lesson_14_streamapi.lessoncode.Fruit> resultList = new ArrayList<>();
        for (com.example.libraryofbooks.practise.lesson_14_streamapi.lessoncode.Fruit fruit : fruits) {
            if (fruit.getColor().equals(fruitColor) &&
                    fruit.getTitle().equals(fruitTitle) &&
                    fruit.getWeight() == weight) {
                resultList.add(fruit);
            }
        }
        return resultList;
    }


    public List<com.example.libraryofbooks.practise.lesson_14_streamapi.lessoncode.Fruit> findFruits(FruitSearchCriteria fruitSearchCriteria) {
        List<com.example.libraryofbooks.practise.lesson_14_streamapi.lessoncode.Fruit> foundFruits = new ArrayList<>();
        for (Fruit fruit : fruits) {
            if (fruitSearchCriteria.test(fruit)) {
                foundFruits.add(fruit);
            }
        }
        return foundFruits;
    }


}
