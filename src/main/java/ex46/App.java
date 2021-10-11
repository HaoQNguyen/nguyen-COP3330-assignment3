/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Hao Nguyen
 */

package ex46;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {

    public static String readFile ()
    {
        /*
            File inFile = "exercise46_input.txt"
            String input = scan(inFile)
         */

        try
        {
            File inFile = new File(System.getProperty("user.dir") + "\\src\\main\\java\\ex46\\exercise46_input.txt");
            Scanner reader = new Scanner(inFile);
            StringBuilder input = new StringBuilder();

            while (reader.hasNextLine())
            {
                input.append(reader.nextLine()).append("\n");
            }

            return input.toString();
        }
        catch (FileNotFoundException e)
        {
            return("File not found.");
        }
    }

    public static void main( String[] args )
    {
        String input = readFile();
        WordCounter counter = new WordCounter(input);
        counter.counter();
        counter.histogram();
    }

}
