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




        StringBuilder cat1 = new StringBuilder("Timoshka");
        String cat2 = new String (cat1);

        System.out.println(cat2);

        int [] codePoints = {600,200,565,666,777,97,234,123,1150,1005};//из массисва символов типа int (расширенная версия unicode)
        String nameThree = new String( codePoints, 0, 10);

        System.out.println(nameThree);

        System.out.println(cat1.length());

        String paradoxConcat = new String("Four: ") + 2+2;
        System.out.println(paradoxConcat+2+" "+2);

        ///1. переопределение метода toString для класса Pet
        Pet pet1 = new Pet("dog","John",19);
        String pet2 = "Это та же собака " + pet1;
        System.out.println(pet1.toString());
        System.out.println(pet2);

        //2. charAt

        System.out.println(cat1);
        System.out.println(cat1.charAt(0));

        //3. getChars () извлекает символы из строки и сохраняет в массиве chars
        String nameMan = "Vitaly";
        char [] nameManHome = new char[3];
        nameMan.getChars(0,3,nameManHome,0);
        String nameManeHomeTwo = new String(nameManHome);
        System.out.println(nameManHome);
        //4. toCharArray () извлекает символы из строки и сохраняет в массиве chars
        System.out.println(nameMan.toCharArray());

        //5. getBytes () извлекает символы из строки и сохраняет в массиве bytes
        byte [] nameManTwo= nameMan.getBytes();
        System.out.println("Возвращаемое значение: " + nameManTwo);

        //6. regionMatches () сравнивает определенную область ынутри одной строки с определенной областью другой
        System.out.println(nameMan.regionMatches(0, nameManeHomeTwo, 0, 3));
        System.out.println(nameMan.regionMatches(0, nameManeHomeTwo, 0, 5));

        //7. startsWith () , endWith подвиды regionMatches
        System.out.println(nameMan.startsWith("ita", 1));
        System.out.println(nameMan.endsWith("y"));

        //8. поиск в строках indexOf (), lastIndexOf

        System.out.println(name.indexOf('a'));
        System.out.println(name.indexOf('s',4));
        System.out.println(name.lastIndexOf('a'));

        //9. replace ()
        //replaceAll(). Аналогичен replace() со строковыми параметрами.
        // Но первым параметром можно передать регулярное выражение;

        String s = "Anna".replace('n','l');    //Alla
        System.out.println(s.replaceAll("Al","Ga")); // Gala
       //10. trim() удаляет пробелы

        System.out.println("        Столица - Сакраменто ");
        System.out.println("        Столица - Сакраменто ".trim());

        //11. valueOf() преобразует объект в строковый вид,
        //valueOf(double d,float,int,long) – возвращает строковое представление double/float,int,long аргумента.
        System.out.println(String.valueOf(chars,0,3));//(char[] data, int offset, int count)
        // возвращает строковое представление определенного подмассива массив char аргументов.
        System.out.println(String.valueOf(cat1));//valueOf(Object obj) – возвращает строковое представление объекта аргумента.

        // 11. toLowerCase(): переводит все символы строки в нижний регистр

        // 12. toUpperCase(): переводит все символы строки в верхний регистр

        // 13.static join(). Позволяет объединять несколько строк в одну, расставляя между ними подстроки-разделители
        // (разделитель передается как один из параметров).
        // Имеет перегруженную реализацию, которая также позволяет установить в результирующей строке префикс и суффикс
        String resut = String.join(" , ","Timoshka ","Vitaly","Anastasia","Eroshka");
        //static format(). Метод форматирования строк с использованием спецификаторов.
        // Сигнатура такая же, как в известном нам System.out.printf().
        System.out.println(String.format(resut,'\t'));
        //14 split(). Принимает в качестве параметра разделитель.
        // Возвращает массив строк, получившийся в результате разделения изначальной строки по переданному разделителю.
        // Разделителем можно выступать как обычная строка, так и регулярное выражение.
        String text = "FIFA will never regret it";
        String[] words = text.split(" ");
        for(String word : words){
            System.out.println(word);
        }
        //14 contains(). Проверяет, содержит ли исходная строка подстроку, переданную в качестве параметра;
        System.out.println("THIS: "+nameMan.contains("Vit"));// true

        //15. compareTo()Сравнивает строки посимвольно (по кодам каждого символа).
        // Если параметр, переданный в метод, меньше строки,
        // для которой метод был вызван — вернет отрицательное число, если больше — положительное.
        // Если строки равны — вернет 0 (ноль)
        StringBuilder sb1 = new StringBuilder("Vita");
        StringBuilder sb2 = new StringBuilder("Tima");
        System.out.println(sb1.compareTo(sb2));
        //delete(). Принимает два параметра типа int — start и end.
        // Удаляет из строки элементы с индекса start по индекс end (не включительно);
        System.out.println(sb2.delete(3,4));
        //deleteCharAt(). Принимает параметром индекс элемента. Удаляет его из строки;
        System.out.println(sb1.deleteCharAt(3));
        //replace() заменяет подстроку, ограниченную индаксами другой подстрокой —
        // переданной в качестве параметра в метод;
        System.out.println(sb1.replace(2,3, sb2.toString()));
        ///reverse(). Разворачивает строку: "123" → "321".
        //append(). Перегружен под разные типы данных.
        // Аналогичен оператору «+» для строк — добавляет переданный параметр в конец строки;
        System.out.println(sb1.append(cat1));
        //insert(). Перегружен под разные типы данных.
        // В большинстве реализаций, первый параметр — смещение (индекс элемента),
        // второй — данные, которые надо вставить в подстроку.
        StringBuilder sb3 = new StringBuilder("2,1471");
        System.out.println(sb3.insert(2," This is s fail: "));
        StringBuilder sb4 = new StringBuilder("Vita");

        System.out.println(sb4.codePointCount(1,3));
        System.out.println(sb4.codePointAt(0)); //V








    }
}
