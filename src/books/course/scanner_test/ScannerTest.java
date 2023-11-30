package books.course.scanner_test;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Scanner;

import static java.nio.charset.StandardCharsets.UTF_8;

public class ScannerTest {
    public static void main(String[] args) throws IOException {

        Scanner in = new Scanner(System.in);
        System.out.println("What is your name? " );
        String name = in.nextLine();
        System.out.println("How old are you? ");
        int age = in.nextInt();

        System.out.println("Hello,  " + name + ". Next year, you'll be " + (age+1));

//       Scanner(Path p, String encoding) конструирует объект типа Scanner, который читает данные из файла по указанному пути, используя заданную кодировку символов.
//        Scanner in = new Scanner(Path.of("myfile.txt"), UTF_8);
//        PrintWriter (String fileName)  конструирует объект типа PrintWriter, который записывает данные в файл с указанным именем.
//        PrintWriter out = new PrintWriter("myfile.txt", UTF_8);


    }
}




