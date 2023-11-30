package books.course.massive;

public class Message {
    public static void main(String[] args) {
        if (args[0].equals("-h")) {
            System.out.println("Hello, ");
        } else if (args[0].equals("-g")) {
            System.out.println("Goodbay ");

        }
        for (int i =1; i< args.length;i++) {
            System.out.println(" "+ args[i]);
            System.out.println("!");
        }
    }
}
