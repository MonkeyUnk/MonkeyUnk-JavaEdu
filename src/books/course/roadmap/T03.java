package books.course.roadmap;

//Задача 3:
//Написать программу, которая принимает длину и ширину прямоугольника (2 целых числа).
// Нарисовать в консоли заданный прямоугольник, используя “-“ и “|”. Углы прямоугольника обозначить символом “ “.
// Каждая единица длины должна обозначаться одним символом “-“, каждая единица ширины – символом “|“.
public class T03 {

    static  void triangle (int length, int width) {

        for (int i = 0; i < width; i++) {
            System.out.print("|");
            for (int j = 0; j < length; j++) {
                System.out.print("-");

            }

        }
    }



    public static void main(String[] args) {
        triangle(2,2);
    }
}
