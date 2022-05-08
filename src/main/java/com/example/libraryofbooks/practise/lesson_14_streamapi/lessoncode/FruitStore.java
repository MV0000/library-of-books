package com.example.libraryofbooks.practise.lesson_14_streamapi.lessoncode;

import java.util.ArrayList;
import java.util.List;

public class FruitStore {

    private List<Fruit> fruits = new ArrayList<>();

    public FruitStore() {
        fruits.add(new Fruit("apple", "red", 100));
        fruits.add(new Fruit("apple", "green", 200));
        fruits.add(new Fruit("pear", "red", 100));
        fruits.add(new Fruit("pear", "yellow", 100));
        fruits.add(new Fruit("tomato", "red", 100));
    }

    public List<Fruit> getAllFruits() {
        return fruits;
    }

    // Требование 1: отобрать все яблоки
    public List<Fruit> getAllApples() {
        return getAllFruits("apple");
    }


    // Требование 2: отобрать все груши
    public List<Fruit> getAllPears() {
        return getAllFruits("pear");
    }


    // Требование 3: отобрать все помидоры
    public List<Fruit> getAllTomatos() {
        return getAllFruits("tomato");
    }

    public List<Fruit> getAllFruits(String title) {
        List<Fruit> resultList = new ArrayList<>();
        for (Fruit fruit : fruits) {
            if (fruit.getTitle().equals(title)) {
                resultList.add(fruit);
            }
        }
        return resultList;
    }

    // Требование 4: красные фрукты
    public List<Fruit> findAllFruitsByColor(String fruitColor) {
        List<Fruit> resultList = new ArrayList<>();
        for (Fruit fruit : fruits) {
            if (fruit.getColor().equals(fruitColor)) {
                resultList.add(fruit);
            }
        }
        return resultList;
    }

    public List<Fruit> findAllFruitsByWeight(int fruitWeight) {
        List<Fruit> resultList = new ArrayList<>();
        for (Fruit fruit : fruits) {
            if (fruit.getWeight() == fruitWeight) {
                resultList.add(fruit);
            }
        }
        return resultList;
    }


    // Требование 5: красные помидоры
    public List<Fruit> findFruitsByTitleAndColor(String fruitTitle,
                                                 String fruitColor) {
        List<Fruit> resultList = new ArrayList<>();
        for (Fruit fruit : fruits) {
            if (fruit.getColor().equals(fruitColor) &&
                    fruit.getTitle().equals(fruitTitle)) {
                resultList.add(fruit);
            }
        }
        return resultList;
    }


    // Требование 6: красные помидоры > 100
    public List<Fruit> findFruitsByTitleAndColorAndWeight(String fruitTitle,
                                                          String fruitColor,
                                                          int weight) {
        List<Fruit> resultList = new ArrayList<>();
        for (Fruit fruit : fruits) {
            if (fruit.getColor().equals(fruitColor) &&
                    fruit.getTitle().equals(fruitTitle) &&
                    fruit.getWeight() == weight) {
                resultList.add(fruit);
            }
        }
        return resultList;
    }


    public List<Fruit> findFruits(FruitSearchCriteria fruitSearchCriteria) {
        List<Fruit> foundFruits = new ArrayList<>();
        for (Fruit fruit : fruits) {
            if (fruitSearchCriteria.test(fruit)) {
                foundFruits.add(fruit);
            }
        }
        return foundFruits;
    }


}
