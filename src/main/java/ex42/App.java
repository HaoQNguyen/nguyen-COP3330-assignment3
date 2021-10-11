/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Hao Nguyen
 */

package ex42;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void printTable(String[] last, String[] first, String[] salary)
    {
        /*
            File output = "exercise42_output.txt"

            for (i : last.length)
                output.write(last[i] + first[i] + salary[i])
         */

        try
        {
            FileWriter output = new FileWriter(System.getProperty("user.dir") + "\\src\\main\\java\\ex42\\exercise42_output.txt");
            PrintWriter writer = new PrintWriter(output);

            writer.printf("%-10s%-10s%s\n", "Last", "First", "Salary");
            writer.println("--------------------------");

            for (int i = 0; i < last.length; ++i)
            {
                writer.printf("%-10s%-10s%s\n", last[i], first[i], salary[i]);
            }

            writer.close();
            output.close();
        }
        catch (IOException e)
        {
            System.out.println("Output file corrupted.");
        }
    }

    public static void parseInput(ArrayList<String> name, String[] last, String[] first, String[] salary)
    {
        /*
            for (i : name.size())
                (last[i] , first[i], salary[i]) = split(name.get(i), ",")
         */

        String[] buffer;

        for (int i = 0; i < name.size(); ++i)
        {
            buffer = name.get(i).split(",", 0);

            last[i] = buffer[0];
            first[i] = buffer[1];
            salary[i] = buffer[2];
        }
    }

    public static ArrayList<String> fillArray()
    {
        /*
            File input = "exercise42_input.txt"
            Scanner reader = Scan(input)
            String[] name = {}

            while (reader.hasNextLine() == true)
                name.add(reader.nextLine())
         */

        ArrayList<String> name = new ArrayList<>();

        try
        {
            File input = new File(System.getProperty("user.dir") + "\\src\\main\\java\\ex42\\exercise42_input.txt");
            Scanner reader = new Scanner(input);

            while (reader.hasNextLine())
                name.add(reader.nextLine());

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
        ArrayList<String> name = fillArray();

        String[] last = new String[name.size()];
        String[] first = new String[name.size()];
        String[] salary = new String[name.size()];

        parseInput(name, last, first, salary);

        printTable(last, first, salary);
    }

}
