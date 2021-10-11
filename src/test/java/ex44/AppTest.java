package ex44;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void productRetriever() {

        Product p1 = new Product("milk", 1.39, 2);
        Product p2 = new Product("pork", 4.00, 1);

        Product[] products = {p1, p2};

        App.productRetriever(products);

    }
}