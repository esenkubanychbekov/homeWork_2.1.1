package Java_Level_2;

public class Main {

    public static void main(String[] args) {

        Shelter shelter = new Shelter("Happy dogs", " st. Ahunbaeva 122, city Bishkek");
        Shelter shelter1 = new Shelter("Doctor Aibolit", "st. Umetalieva 22, city Bishkek ");

        //Создание 1 обьекта класса Dog

        Dog dog = new Dog();
        dog.setShelter(shelter);
        System.out.println(dog.getInfo());
        dog.makeVoice("Gaf-Gaf");
        System.out.println();

        // Создание 2 обьекта класса Dog

        Dog dog2 = new Dog("barbos", "Labrador", Color.WHITE, shelter);
        System.out.println(dog2.getInfo());
        dog2.makeVoice("Vof-Vof", 2);
        System.out.println();

        // // Создание 3 обьекта класса Dog

        Dog dog3 = new Dog("Bokser", "Pitbull", Color.BLACK,
                shelter1, new String[]{"Fas", "Na mesto", "Domoi"});
        System.out.println(dog3.getInfo());
        dog3.makeVoice("Arr_Arr", 3);


    }
}
