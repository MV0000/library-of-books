package practise.lesson_12_exceptions.lessoncode.enumeration;

import com.example.libraryofbooks.practise.lesson_12_exceptions.lessoncode.enumeration.ProductCategory;

public class Product {

    private String name;
    private ProductCategory productCategory;

    public Product(String name, ProductCategory productCategory) {
        this.name = name;
        this.productCategory = productCategory;
    }
}
