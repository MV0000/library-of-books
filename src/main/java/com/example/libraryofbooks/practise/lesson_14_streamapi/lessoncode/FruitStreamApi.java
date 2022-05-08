package com.example.libraryofbooks.practise.lesson_14_streamapi.lessoncode;

import javaguru.lv.teacher.lesson_14_streamapi.lessoncode.searchcriteria.FilterSearchCriteria;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FruitStreamApi {

    private List<Fruit> fruits = new ArrayList<>();

    public FruitStreamApi() {
        fruits.add(new Fruit("apple", "red", 50));
        fruits.add(new Fruit("apple", "green", 100));
        fruits.add(new Fruit("pear", "red", 100));
        fruits.add(new Fruit("pear", "yellow", 100));
        fruits.add(new Fruit("tomato", "red", 150));
    }

    public List<Fruit> getAllFruits() {
        return fruits;
    }

    //Predicate - boolean test(T t)
    //Function - R apply(T t)
    //Consumer - void accept(T var1)
    //Supplier - T get()
    //
    public List<Fruit> findAllApples() {
        return fruits.stream()
                .filter(fruit -> "apple".equals(fruit.getTitle()) || "pear".equals(fruit.getTitle()))
                .collect(Collectors.toList());
    }

    public List<Fruit> test2() {
        List<Fruit> resultList = new ArrayList<>();
        for (Fruit fruit : fruits) {
            if (fruit.getTitle().equals("apple")) {
                resultList.add(fruit);
            }
        }
        return resultList;
    }

    //late execution
    public List<Fruit> findAllApplesV2() {
        return fruits.stream()
                .filter(new Predicate<Fruit>() {
                    @Override
                    public boolean test(Fruit fruit) {
                        return "apple".equals(fruit.getTitle());
                    }
                })
                .collect(Collectors.toList());
    }



    public List<Fruit> findAllApplesV3() {
        Predicate<Fruit> appleOrPearPredicate = new Predicate<>() {
            @Override
            public boolean test(Fruit x) {
                return "apple".equals(x.getTitle()) || "pear".equals(x.getTitle()) ;
            }
        };
//        Predicate<Fruit> colorPredicate = new Predicate<>() {
//            @Override
//            public boolean test(Fruit x) {
//                return "red".equals(x.getColor());
//            }
//        };
        return fruits.stream()
                .filter(appleOrPearPredicate)
//                .filter(colorPredicate)
                .collect(Collectors.toList());
    }


    public List<Fruit> findAllApplesV4() {
        FilterSearchCriteria predicate = new FilterSearchCriteria();

        return fruits.stream()
                .filter(predicate)
                .collect(Collectors.toList());
    }


    public List<Fruit> findRedApplesWithWeightBiggerThen100() {
        return fruits.stream()
                .filter(fruit -> "apple".equals(fruit.getTitle()))
                .filter(fruit -> "red".equals(fruit.getColor()))
                .filter(fruit -> fruit.getWeight() > 100)
                .collect(Collectors.toList());
    }


    public Set<String> findAllFruitUniqNames() {
        return fruits.stream()
                .map(Fruit::getTitle)
//                .map(fruit -> fruit.getTitle())
                .collect(Collectors.toSet());
    }


    public List<String> findAllFruitUniqueNames() {
        return fruits.stream()
                .map(fruit -> fruit.getTitle())
                .distinct()
                .collect(Collectors.toList());
    }

    public Optional<Fruit> findAnyApple() {
        return fruits.stream()
                .filter(fruit -> "apple".equals(fruit.getTitle()))
                .findAny();
    }

    public Optional<Fruit> findFirstApple() {
        return fruits.stream()
                .filter(fruit -> "apple".equals(fruit.getTitle()))
                .findFirst();
    }


    public Map<Integer, List<Fruit>> groupByWeight() {
        return fruits.stream()
                .collect(Collectors.groupingBy(Fruit::getWeight));
    }


    public Set<String> test() {
        Map<Integer, List<Fruit>> result = groupByWeight();
        Set<Map.Entry<Integer, List<Fruit>>> entries = result.entrySet();
        return entries.stream()
//                .map(Map.Entry::getValue)
				.map(entry -> entry.getValue())
                .flatMap(Collection::stream)
                .map(Fruit::getColor)
//				.map(fruit -> fruit.getColor())
                .collect(Collectors.toSet());
    }
}
