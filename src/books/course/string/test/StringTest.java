package books.course.string.test;

public class StringTest {
    public static void main(String[] args) {
        //способы создания объектов типа String
        byte [] ascii = {65,110,97,115,116,97,115,105,97,32}; //из массисва символов типа byte (№ unicode)
        String name = new String(ascii);

        System.out.println(name);

        String nameTwo = new String(ascii,0,3);

        System.out.println(nameTwo);

        char [] chars = {'T','i','m','o','s','h','k','a'};//из массисва символов типа char
        String nameCat = new String(chars);
        String nameCatOP = new String(chars,0,3);
        System.out.println(nameCatOP);

        //getChars ()


        StringBuilder cat1 = new StringBuilder("Timoshka");
        String cat2 = new String (cat1);

        System.out.println(cat2);

        int [] codePoints = {600,200,565,666,777,97,234,123,1150,1005};//из массисва символов типа int (расширенная версия unicode)
        String nameThree = new String( codePoints, 0, 10);

        System.out.println(nameThree);

        System.out.println(cat1.length());

        String paradoxConcat = new String("Four: ") + 2+2;
        System.out.println(paradoxConcat+2+" "+2);

        ///переопределение метода toString для класса Pet
        Pet pet1 = new Pet("dog","John",19);
        String pet2 = "Это та же собака " + pet1;
        System.out.println(pet1.toString());
        System.out.println(pet2);

        //charAt

        System.out.println(cat1);
        System.out.println(cat1.charAt(0));

        //getChars ()





    }
}
