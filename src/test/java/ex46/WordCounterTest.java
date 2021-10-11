package ex46;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordCounterTest {

    @Test
    public void classTest() {

        WordCounter wordCounter = new WordCounter("ape chicken ape bird bird bird");

        wordCounter.counter();
        assertArrayEquals(new String[]{"ape", "chicken", "bird"}, wordCounter.getWord().toArray());
        assertArrayEquals(new Integer[]{2, 1, 3}, wordCounter.getFrequency().toArray());

        wordCounter.sortLists();
        assertArrayEquals(new String[]{"bird", "ape", "chicken"}, wordCounter.getWord().toArray());
        assertArrayEquals(new Integer[]{3, 2, 1}, wordCounter.getFrequency().toArray());

    }

}