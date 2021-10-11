/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Hao Nguyen
 */

package ex44;

import com.google.gson.Gson;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class App {

    public static Product[] parseJsonFile()
    {
        /*
            File input = "exercise44_input.json"
            Scanner reader = scan(input)
            if (reader == "products")
                return new Product[] (reader)
         */

        JSONParser jsonParser = new JSONParser();
        String input = "";

        try {

            JSONObject jsonObject = (JSONObject) jsonParser.parse(new FileReader(System.getProperty("user.dir") + "\\src\\main\\java\\ex44\\exercise44_input.json"));
            JSONArray jsonArray = (JSONArray) jsonObject.get("products");
            input = jsonArray.toString();
        }
        catch (IOException | ParseException e)
        {
            e.printStackTrace();
        }


        Gson gson = new Gson();
        return gson.fromJson(input, Product[].class);
    }

    public static void productRetriever(Product[] products)
    {
        /*
            while (productNotFound)
                productToLookUp = inputProductName()
                for (Product p : products)
                    if (productToLookUp == p)
                        print(p.name + p.price + p.quantity)
         */

        Scanner input = new Scanner(System.in);
        String productName;

        while (true)
        {
            System.out.print("What is the product name? ");
            productName = input.nextLine();

            for (Product product : products)
            {
                if (productName.equals(product.getName()))
                {
                    System.out.println("Name: " + product.getName());
                    System.out.println("Price: " + product.getPrice());
                    System.out.println("Quantity: " + product.getQuantity());
                    return;
                }
            }

            System.out.println("Sorry, that product was not found in our inventory.");

        }
    }

    public static void main( String[] args ) {

        Product[] products = parseJsonFile();
        productRetriever(products);

    }

}
