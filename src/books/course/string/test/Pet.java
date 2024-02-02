package books.course.string.test;

public class Pet {
    String typePet;
    String name;
    int age;
    Pet (String typePet,String name,int age) {
        this.typePet = typePet;
        this.name = name;
        this.age = age;

    }
    public String toString () {
        return "This is a " + typePet +", "+ "his name is: " +name+ " he is "+", " + age + " years old";
    }
}
