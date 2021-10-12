package ex44;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    Product product = new Product("milk", 1.39, 2);

    @Test
    void getName() {
        assertEquals("milk", product.getName());
    }

    @Test
    void getPrice() {
        assertEquals(1.39, product.getPrice());
    }

    @Test
    void getQuantity() {
        assertEquals(2, product.getQuantity());
    }
}