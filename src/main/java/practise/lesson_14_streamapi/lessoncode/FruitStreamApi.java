package practise.lesson_14_streamapi.lessoncode;

import com.example.libraryofbooks.practise.lesson_14_streamapi.lessoncode.Fruit;
import javaguru.lv.teacher.lesson_14_streamapi.lessoncode.searchcriteria.FilterSearchCriteria;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FruitStreamApi {

    private List<com.example.libraryofbooks.practise.lesson_14_streamapi.lessoncode.Fruit> fruits = new ArrayList<>();

    public FruitStreamApi() {
        fruits.add(new com.example.libraryofbooks.practise.lesson_14_streamapi.lessoncode.Fruit("apple", "red", 50));
        fruits.add(new com.example.libraryofbooks.practise.lesson_14_streamapi.lessoncode.Fruit("apple", "green", 100));
        fruits.add(new com.example.libraryofbooks.practise.lesson_14_streamapi.lessoncode.Fruit("pear", "red", 100));
        fruits.add(new com.example.libraryofbooks.practise.lesson_14_streamapi.lessoncode.Fruit("pear", "yellow", 100));
        fruits.add(new com.example.libraryofbooks.practise.lesson_14_streamapi.lessoncode.Fruit("tomato", "red", 150));
    }

    public List<com.example.libraryofbooks.practise.lesson_14_streamapi.lessoncode.Fruit> getAllFruits() {
        return fruits;
    }

    //Predicate - boolean test(T t)
    //Function - R apply(T t)
    //Consumer - void accept(T var1)
    //Supplier - T get()
    //
    public List<com.example.libraryofbooks.practise.lesson_14_streamapi.lessoncode.Fruit> findAllApples() {
        return fruits.stream()
                .filter(fruit -> "apple".equals(fruit.getTitle()) || "pear".equals(fruit.getTitle()))
                .collect(Collectors.toList());
    }

    public List<com.example.libraryofbooks.practise.lesson_14_streamapi.lessoncode.Fruit> test2() {
        List<com.example.libraryofbooks.practise.lesson_14_streamapi.lessoncode.Fruit> resultList = new ArrayList<>();
        for (com.example.libraryofbooks.practise.lesson_14_streamapi.lessoncode.Fruit fruit : fruits) {
            if (fruit.getTitle().equals("apple")) {
                resultList.add(fruit);
            }
        }
        return resultList;
    }

    //late execution
    public List<com.example.libraryofbooks.practise.lesson_14_streamapi.lessoncode.Fruit> findAllApplesV2() {
        return fruits.stream()
                .filter(new Predicate<com.example.libraryofbooks.practise.lesson_14_streamapi.lessoncode.Fruit>() {
                    @Override
                    public boolean test(com.example.libraryofbooks.practise.lesson_14_streamapi.lessoncode.Fruit fruit) {
                        return "apple".equals(fruit.getTitle());
                    }
                })
                .collect(Collectors.toList());
    }



    public List<com.example.libraryofbooks.practise.lesson_14_streamapi.lessoncode.Fruit> findAllApplesV3() {
        Predicate<com.example.libraryofbooks.practise.lesson_14_streamapi.lessoncode.Fruit> appleOrPearPredicate = new Predicate<>() {
            @Override
            public boolean test(com.example.libraryofbooks.practise.lesson_14_streamapi.lessoncode.Fruit x) {
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


    public List<com.example.libraryofbooks.practise.lesson_14_streamapi.lessoncode.Fruit> findAllApplesV4() {
        FilterSearchCriteria predicate = new FilterSearchCriteria();

        return fruits.stream()
                .filter(predicate)
                .collect(Collectors.toList());
    }


    public List<com.example.libraryofbooks.practise.lesson_14_streamapi.lessoncode.Fruit> findRedApplesWithWeightBiggerThen100() {
        return fruits.stream()
                .filter(fruit -> "apple".equals(fruit.getTitle()))
                .filter(fruit -> "red".equals(fruit.getColor()))
                .filter(fruit -> fruit.getWeight() > 100)
                .collect(Collectors.toList());
    }


    public Set<String> findAllFruitUniqNames() {
        return fruits.stream()
                .map(com.example.libraryofbooks.practise.lesson_14_streamapi.lessoncode.Fruit::getTitle)
//                .map(fruit -> fruit.getTitle())
                .collect(Collectors.toSet());
    }


    public List<String> findAllFruitUniqueNames() {
        return fruits.stream()
                .map(fruit -> fruit.getTitle())
                .distinct()
                .collect(Collectors.toList());
    }

    public Optional<com.example.libraryofbooks.practise.lesson_14_streamapi.lessoncode.Fruit> findAnyApple() {
        return fruits.stream()
                .filter(fruit -> "apple".equals(fruit.getTitle()))
                .findAny();
    }

    public Optional<com.example.libraryofbooks.practise.lesson_14_streamapi.lessoncode.Fruit> findFirstApple() {
        return fruits.stream()
                .filter(fruit -> "apple".equals(fruit.getTitle()))
                .findFirst();
    }


    public Map<Integer, List<com.example.libraryofbooks.practise.lesson_14_streamapi.lessoncode.Fruit>> groupByWeight() {
        return fruits.stream()
                .collect(Collectors.groupingBy(com.example.libraryofbooks.practise.lesson_14_streamapi.lessoncode.Fruit::getWeight));
    }


    public Set<String> test() {
        Map<Integer, List<com.example.libraryofbooks.practise.lesson_14_streamapi.lessoncode.Fruit>> result = groupByWeight();
        Set<Map.Entry<Integer, List<com.example.libraryofbooks.practise.lesson_14_streamapi.lessoncode.Fruit>>> entries = result.entrySet();
        return entries.stream()
//                .map(Map.Entry::getValue)
				.map(entry -> entry.getValue())
                .flatMap(Collection::stream)
                .map(Fruit::getColor)
//				.map(fruit -> fruit.getColor())
                .collect(Collectors.toSet());
    }
}
