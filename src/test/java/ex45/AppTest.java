package ex45;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void replaceString() {

        String s = "university of central florida";

        String r = App.replaceString(s, "i", "y");

        assertEquals("unyversyty of central floryda", r);

    }
}