/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Hao Nguyen
 */

package ex45;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class App {

    public static void writeFile(String outputName, String r)
    {
        /*
            File output = outputName
            output.printf(r)
         */

        try
        {
            FileWriter output = new FileWriter(System.getProperty("user.dir") + "\\src\\main\\java\\ex45\\" + outputName + ".txt");
            output.write(r);
            output.close();
        }
        catch (IOException e)
        {
            System.out.println("Output file corrupted.");
        }
    }

    public static String getName()
    {
        /*
            String name = scan(inputStream)
         */

        System.out.print("Name of output file: ");
        Scanner input = new Scanner(System.in);

        return input.nextLine();
    }

    public static String replaceString(String s, String original, String replacement)
    {
        return s.replaceAll(original, replacement);
    }

    public static String readFile()
    {
        /*
            File input = "exercise45_input.txt"
            String s = scan(input)
         */

        String s = "";

        try
        {
            File input = new File(System.getProperty("user.dir") + "\\src\\main\\java\\ex45\\exercise45_input.txt");
            Scanner reader = new Scanner(input);

            StringBuilder buffer = new StringBuilder();

            while (reader.hasNextLine()) {
                buffer.append(reader.nextLine()).append("\n");
            }

            s = buffer.toString();
            reader.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File not found.");
        }

        return s;
    }

    public static void main( String[] args )
    {
        String s = readFile();

        String r = replaceString(s, "utilize", "use");

        String outputName = getName();

        writeFile(outputName, r);
    }

}
