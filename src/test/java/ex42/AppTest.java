package ex42;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void parseInput() {

        ArrayList<String> name = new ArrayList<>();

        name.add("Nguyen,Hao,10");
        name.add("Dinh,Nguyet,11");
        name.add("Vu,Anh,12");

        String[] last = new String[3];
        String[] first = new String[3];
        String[] salary = new String[3];

        App.parseInput(name, last, first, salary);

        assertEquals("Nguyen", last[0]);
        assertEquals("Dinh", last[1]);
        assertEquals("Vu", last[2]);

        assertEquals("Hao", first[0]);
        assertEquals("Nguyet", first[1]);
        assertEquals("Anh", first[2]);

        assertEquals("10", salary[0]);
        assertEquals("11", salary[1]);
        assertEquals("12", salary[2]);
    }
}