package ru.netology.repository;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Book;
import ru.netology.domain.Product;
import ru.netology.exсeption.NotFoundExсeption;

import static org.junit.jupiter.api.Assertions.*;

public class ProductRepositoryTest {
    ProductRepository repository = new ProductRepository();
    Book book1 = new Book(1, "Financier", 899, "Dreiser", 1245, 1912);
    Book book2 = new Book(2, "Titan", 999, "Dreiser", 1299, 1914);
    Book book3 = new Book(3, "Stoic", 1199, "Dreiser", 745, 1946);
    Book book4 = new Book(4, "An American tragedy", 499, "Dreiser", 854, 1926);

    @BeforeEach
    public void setUp() {
        repository.save(book1);
        repository.save(book2);
        repository.save(book3);
        repository.save(book4);
    }

    @Test
    void shouldRemoveByIdYes() {
        repository.removeById(3);
        Product[] actual = repository.findAll();
        Product[] expected = new Product[]{book1, book2, book4};
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldRemoveByIdNo() {
        assertThrows(NotFoundExсeption.class,()->repository.removeById(5));
    }


}
