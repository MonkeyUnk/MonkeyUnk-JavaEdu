package books.course.scanner_test;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) throws IOException {

//        Scanner in = new Scanner(System.in);
//        System.out.println("What is your name? " );
//        String name = in.nextLine();
//        System.out.println("How old are you? ");
//        int age = in.nextInt();
//
//        System.out.println("Hello,  " + name + ". Next year, you'll be " + (age+1));
//
//        Scanner in = new Scanner(System.in);
//        System.out.println("Input numbers");
//        String input = in.nextLine();
//        String[] numbers = input.split(" ");
//        String s = String.join(", ", numbers);
//        System.out.println(s);
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ROOT);
        double a = sc.nextDouble();


    }


//       Scanner(Path p, String encoding) конструирует объект типа Scanner, который читает данные из файла по указанному пути, используя заданную кодировку символов.
//        Scanner in = new Scanner(Path.of("myfile.txt"), UTF_8);
//        PrintWriter (String fileName)  конструирует объект типа PrintWriter, который записывает данные в файл с указанным именем.
//        PrintWriter out = new PrintWriter("myfile.txt", UTF_8);


    }






