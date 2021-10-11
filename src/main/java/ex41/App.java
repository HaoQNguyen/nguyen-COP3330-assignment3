/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Hao Nguyen
 */

package ex41;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class App {

    public static void writeToFile(ArrayList<String> name)
    {
        /*
            File output = "exercise41_output.txt"

            for (String s : name)
                output.write(s)
         */

        try
        {
            FileWriter output = new FileWriter(System.getProperty("user.dir") + "\\src\\main\\java\\ex41\\exercise41_output.txt");

            output.write("Total of " + name.size() + " names\n");
            output.write("-----------------\n");

            for (String s : name) {
                output.write(s + "\n");
            }

            output.close();
        }
        catch (IOException e)
        {
            System.out.println("Output file corrupted.");
        }
    }

    public static void sortArray(ArrayList<String> name)
    {
        /*
            name.sort()
         */

        Collections.sort(name);
    }

    public static ArrayList<String> parseName()
    {
        /*
            File input = read("exercise41_input.txt")
            Scanner reader = Scan(input)
            String[] name = {}

            while (reader.hasNextLine() == true)
                name.add(reader.nextLine())
         */

        File input = new File(System.getProperty("user.dir") + "\\src\\main\\java\\ex41\\exercise41_input.txt");
        ArrayList<String> name = new ArrayList<>();

        try
        {
            Scanner reader = new Scanner(input);

            while (reader.hasNextLine())
            {
                name.add(reader.nextLine());
            }

            reader.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File not found.");
        }

        return name;
    }

    public static void main( String[] args )
    {
        ArrayList<String> name = parseName();
        sortArray(name);
        writeToFile(name);
    }

}
