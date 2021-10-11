/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Hao Nguyen
 */

package ex43;

import java.util.Scanner;

public class App {

    public static void main( String[] args )
    {
        WebsiteGenerator newWebsite = new WebsiteGenerator();

        Scanner input = new Scanner(System.in);

        System.out.print("Site name: ");
        newWebsite.setName(input.nextLine());

        System.out.print("Author: ");
        newWebsite.setAuthor(input.nextLine());

        newWebsite.mainFolder();
        newWebsite.htmlFile();

        System.out.print("Do you want a folder for JavaScript? ");
        if (input.nextLine().equals("y"))
        {
            newWebsite.jsFolder();
        }

        System.out.print("Do you want a folder for CSS? ");
        if (input.nextLine().equals("y"))
        {
            newWebsite.cssFolder();
        }

        newWebsite.report();
    }

}
