public class Person {
    String gender = "Мужской";
    String name = "Антон";
    float height = 1.73f;
    float weight = 75.5f;
    int age = 34;

    boolean go() {
        return true;
    }

    boolean sit() {
        return true;
    }

    boolean run() {
        return true;
    }

    String say() {
        return "saying";
    }

    void learnJava() {
        System.out.println(name + "изучает JAVA");
    }
}