package ru.netology.javaqa.homework.twelve;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ShopRepositoryTest {

    @Test
    public void testRemoveWhenProductExist() {
        ShopRepository shopRepository = new ShopRepository();
        Product product1 = new Product(1, "AppleWatch Space Gray 44mm", 34_000);
        Product product2 = new Product(2, "AppleWatch Ultra", 84_000);
        Product product3 = new Product(3, "AppleWatch Rose Pink 42mm", 30_000);

        shopRepository.add(product1);
        shopRepository.add(product2);
        shopRepository.add(product3);
        shopRepository.remove(2);
        Product[] actual = shopRepository.findAll();
        Product[] extended = {product1, product3};

        Assertions.assertArrayEquals(actual, extended);

    }

    @Test
    public void testRemoveWhenProductNotExist() {
        ShopRepository shopRepository = new ShopRepository();
        Product product1 = new Product(1, "AppleWatch Space Gray 44mm", 34_000);
        Product product2 = new Product(2, "AppleWatch Ultra", 84_000);
        Product product3 = new Product(3, "AppleWatch Rose Pink 42mm", 30_000);

        shopRepository.add(product1);
        shopRepository.add(product2);
        shopRepository.add(product3);

        Assertions.assertThrows(NotFoundException.class, () -> shopRepository.remove(4));
    }
}
