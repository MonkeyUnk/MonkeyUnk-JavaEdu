package books.course.roadmap.lesson4;

//Задача 3:
//Написать программу, которая принимает длину и ширину прямоугольника (2 целых числа).
// Нарисовать в консоли заданный прямоугольник, используя “-“ и “|”. Углы прямоугольника обозначить символом “ “.
// Каждая единица длины должна обозначаться одним символом “-“, каждая единица ширины – символом “|“.
public class T03 {

     static void triangle (int length, int width) {

//        Формируем строку, обозначающую верхнюю и нижнюю грани
//        Примерный вид: " ----- "
        String horizontalLine = " ";

        for (int i = 0; i < length; i++) {
            horizontalLine += "-";
        }

        horizontalLine += " \n";

//        Формируем строку, обозначающую часть левой и правой граней.
//        Примерный вид: "|     |"
        String verticalLinesUnit = "|";

        for (int i = 0; i < length; i++) {
            verticalLinesUnit += " ";
        }

        verticalLinesUnit += "|\n";


//        Формируем строку, обозначающую левую и правую грани целиком
//        Примерный вид: "|     |\n|     |\n|     |\n"

        String verticalLines = "";

        for (int i = 0; i < width; i++) {
            verticalLines += verticalLinesUnit;
        }

        System.out.println(horizontalLine + verticalLines + horizontalLine);
    }

    public static void main(String[] args) {
        triangle(3,5);
    }
}

