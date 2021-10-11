package ex43;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WebsiteGenerator {

    private String name;
    private String author;

    public WebsiteGenerator()
    {
        this.name = "";
        this.author = "";
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void mainFolder()
    {
        /*
            createFolder("website")
            createFolder("website"\\webName);
         */

        File website = new File(System.getProperty("user.dir") + "\\src\\main\\java\\ex43\\website");
        File webName = new File(System.getProperty("user.dir") + "\\src\\main\\java\\ex43\\website\\" + this.name);

        if (!website.exists())
        {
            website.mkdir();
            webName.mkdir();
        }
    }

    public void htmlFile()
    {
        /*
            File index = write("index.html")
            index.write("<title>" + webName)
            index.write("<meta>" + author)
         */

        File index = new File(System.getProperty("user.dir") + "\\src\\main\\java\\ex43\\website\\" + this.name + "\\index.html");

        if (!index.exists())
        {
            try
            {
                FileWriter output = new FileWriter(System.getProperty("user.dir") + "\\src\\main\\java\\ex43\\website\\" + this.name + "\\index.html");

                output.write("<title></title> " + this.name);
                output.write("\n");
                output.write("<meta> " + this.author);

                output.close();
            }
            catch (IOException e)
            {
                System.out.println("Output file corrupted.");
            }
        }
    }

    public void jsFolder()
    {
        /*
            createFolder("js")
         */

        File js = new File(System.getProperty("user.dir") + "\\src\\main\\java\\ex43\\website\\" + this.name + "\\js");

        if (!js.exists())
        {
            js.mkdir();
        }
    }

    public void cssFolder()
    {
        /*
            createFolder("css")
         */

        File css = new File(System.getProperty("user.dir") + "\\src\\main\\java\\ex43\\website\\" + this.name + "\\css");

        if (!css.exists())
        {
            css.mkdir();
        }
    }

    public void report()
    {

        File webName = new File(System.getProperty("user.dir") + "\\src\\main\\java\\ex43\\website\\" + this.name);
        File js = new File(System.getProperty("user.dir") + "\\src\\main\\java\\ex43\\website\\" + this.name + "\\js");
        File css = new File(System.getProperty("user.dir") + "\\src\\main\\java\\ex43\\website\\" + this.name + "\\css");

        if (webName.exists())
        {
            System.out.println("Created ./website/" + this.name);
            System.out.println("Created ./website/" + this.name + "/index.html");
        }

        if (js.exists())
        {
            System.out.println("Created ./website/" + this.name + "/js/");
        }

        if (css.exists())
        {
            System.out.println("Created ./website/" + this.name + "/css/");
        }
    }
}
