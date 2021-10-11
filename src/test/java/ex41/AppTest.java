package ex41;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void sortArray() {

        ArrayList<String> name = new ArrayList<>();

        name.add("Candice");
        name.add("Xavier");
        name.add("Abraham");

        App.sortArray(name);

        assertEquals("Abraham", name.get(0));
        assertEquals("Candice", name.get(1));
        assertEquals("Xavier", name.get(2));

    }
}