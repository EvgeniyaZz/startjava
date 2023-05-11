public class WolfTest {

    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        wolfOne.gender = "мужской";
        wolfOne.name = "Клык";
        wolfOne.weight = 9.8f;
        wolfOne.age = 3;
        wolfOne.color = "серый";

        System.out.println("gender : " + wolfOne.gender);
        System.out.println("name : " + wolfOne.name);
        System.out.println("weight : " + wolfOne.weight);
        System.out.println("age : " + wolfOne.age);
        System.out.println("color : " + wolfOne.color);
        wolfOne.go();
        wolfOne.sit();
        wolfOne.run();
        wolfOne.howl();
        wolfOne.hunting();
    }
}