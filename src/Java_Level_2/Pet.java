package Java_Level_2;

import java.sql.SQLOutput;

public class Pet {
    private int age = generateDefaultAge();
    private Color color;
    private Shelter shelter;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Shelter getShelter() {
        return shelter;
    }

    public void setShelter(Shelter shelter) {
        this.shelter = shelter;
    }

    private int generateDefaultAge() {
        return 5;
    }

    public String getInfo(){
        return  "Питомец {" +
                "возраст: " + age +
                ", приют: " + shelter.getName() + " " + shelter.getAdress() +
                ", цвет: " + color +
                '}';
    }

}
