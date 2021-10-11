package ex46;

import java.util.*;


public class WordCounter {

    private final String input;
    private final ArrayList<String> word;
    private final ArrayList<Integer> frequency;

    public WordCounter (String input)
    {
        this.input = input;
        this.word = new ArrayList<>();
        this.frequency = new ArrayList<>();
    }

    public ArrayList<String> getWord() {
        return word;
    }

    public ArrayList<Integer> getFrequency() {
        return frequency;
    }

    private int compare (String newWord)
    {
        /*
            if (newWord in word)
                return index(newWord)
            else
                return -1
         */

        for (int i = 0; i < word.size(); ++i)
        {
            if (word.get(i).equals(newWord))
                return i;
        }

        return -1;
    }

    public void counter ()
    {
        /*
            if (newWord in word)
                ++newWord.count
            else
                word.add(newWord)
                newWord.count = 1
         */

        Scanner reader = new Scanner(input);
        String newWord;
        int ind;
        int count;

        while (reader.hasNext())
        {
            newWord = reader.next();
            ind = compare(newWord);

            if (ind == -1)
            {
                word.add(newWord);
                frequency.add(1);
            }
            else
            {
                count = frequency.get(ind);
                frequency.set(ind, ++count);
            }
        }
    }

    public void sortLists ()
    {
        /*
            sort(frequency, descending)
            sort(word, according(frequency))
         */

        int tempFreq;
        String tempWord;

        for (int i = 0; i < frequency.size()-1; ++i)
        {
            tempFreq = frequency.get(i);
            tempWord = word.get(i);

            for (int j = i + 1; j < frequency.size(); ++j)
            {
                if (frequency.get(i) < frequency.get(j))
                {
                    frequency.set(i, frequency.get(j));
                    frequency.set(j, tempFreq);

                    word.set(i, word.get(j));
                    word.set(j, tempWord);
                }
            }
        }

    }

    public void histogram ()
    {
        /*
            for (w in word)
                print(w)
                for (i : w.frequency)
                    print("*")
         */

        sortLists();

        for (int i = 0; i < word.size(); ++i)
        {
            System.out.printf("%-10s: ", word.get(i));
            for (int j = 0; j < frequency.get(i); ++j)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
