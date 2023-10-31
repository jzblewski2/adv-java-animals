package us.mattgreen;

import java.util.ArrayList;
import java.util.Scanner;

public class Animal {
    Scanner keyboard = new Scanner(System.in);

    public void prompt(ArrayList<Talkable> zoo) {
        System.out.println("what type of animal would you like to create?");
        String animal = keyboard.nextLine();

        switch (animal) {
            case "Dog" -> {
                System.out.println("dog's name: ");
                String name = keyboard.nextLine();

                System.out.println("dog is friendly? (true or false)");
                boolean friendly = keyboard.nextBoolean();
                keyboard.nextLine();

                Dog dog = new Dog(friendly, name);
                zoo.add(dog);

            }
            case "Cat" -> {
                System.out.println("cat's name: ");
                String name = keyboard.nextLine();

                System.out.println("number of mice killed by cat: ");
                int mousesKilled = keyboard.nextInt();
                keyboard.nextLine();

                Cat cat = new Cat(mousesKilled, name);
                zoo.add(cat);

            }
            case "Teacher" -> {
                System.out.println("teacher's name: ");
                String name = keyboard.nextLine();

                System.out.println("teacher's age: ");
                int age = keyboard.nextInt();
                keyboard.nextLine();

                Teacher teacher = new Teacher(age, name);
                zoo.add(teacher);

            }
            default -> System.out.println("please enter animal that already exists in array");
        }
    }
}
