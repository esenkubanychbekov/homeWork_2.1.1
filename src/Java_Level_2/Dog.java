package Java_Level_2;

import java.util.Arrays;

public class Dog extends Pet {
    private String name, breed;
    private String[] commands;

    public Dog() {
    }

    public Dog(String name, String breed, Color color, Shelter shelter) {
        this.name = name;
        this.breed = breed;
        super.setColor(color);
        super.setShelter(shelter);
    }

    public Dog(String name, String breed, Color color, Shelter shelter, String[] commands) {
        this.name = name;
        this.breed = breed;
        super.setColor(color);
        super.setShelter(shelter);
        this.commands = commands;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String[] getCommands() {
        return commands;
    }

    public void setCommands(String[] commands) {
        this.commands = commands;
    }

    public String getInfo() {
        return "Собака {" +
                "кличка:  " + name +
                ", порода: " + breed +
                ", команды: " + Arrays.toString(commands) +
                "} " + super.getInfo();
    }

    public void makeVoice(String voice) {
        voice = "Gaf";
        System.out.println("Gaf");
    }

    public void makeVoice(int number) {
        for (int i = 0; i < number; i++) {
            System.out.println("Gaf");
        }

    }

    public void makeVoice(String voice, int number) {
        for (int i = 0; i < number; i++) {
            System.out.println(voice);
        }
    }
}
