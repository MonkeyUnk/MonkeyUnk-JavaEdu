package books.course.roadmap;
//Напишите программу, которая выводит на консоль таблицу умножения
public class MultiplicationTable {
    public static void main(String[] args) {
        var to = 9;

        for (int i = 1; i <= to; i++) {
            for (int j = 1; j <= to; j++) {
                var res = i * j;
                System.out.print((res == 1 ? "1" : res) + "\t");

            }

            System.out.println();
        }
//        for (int i = 1; i <= 3; i++) {
//            System.out.println(i + " Начало OUTER LOOP");
//            for (int j = 1; j <= 3; j++){
//                System.out.println(j+" Конец INNER LOOP " + j*i);
//            }
//            System.out.println("Конец OUTER LOOP " +i);
//        }
    }
}
