package com.pluralsight;

import com.pluralsight.loops.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        // People objects
        Person person1 = new Person("Adrian","Lewis",26);
        Person person2 = new Person("Diana","Johnson",23);
        Person person3 = new Person("Felix","Kinson",60);
        Person person4 = new Person("Potato","Sensei",50);
        Person person5 = new Person("Max","Steel",22);
        Person person6 = new Person("Felix","Stan",43);
        Person person7 = new Person("Ben","Tennyson",16);
        Person person8 = new Person("Lily","Lewis",25);
        Person person9 = new Person("Nicole","Jones",98);
        Person person10 = new Person("Finn","Sensei",15);

        // add to People
        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.add(person4);
        people.add(person5);
        people.add(person6);
        people.add(person7);
        people.add(person8);
        people.add(person9);
        people.add(person10);

        // Prompt for name(first or last) and loop
        System.out.print("Enter Name For Search(First or Last): ");
        String name = input.nextLine();
        System.out.println();

        for (Person person : people) {
            if (name.equalsIgnoreCase(person.getFirstName()) || name.equalsIgnoreCase(person.getLastName())){
                System.out.println(person);
            }
        }

        getAverageAge(people);
    }

    private static void getAverageAge(List<Person> people){
        int totalAge = 0;
        int averageAge = 0;

        // get the age of each person and add for total then divide by number of people
        for (Person person : people) {
            totalAge += person.getAge();
        }
        averageAge = totalAge / people.size();

        System.out.println(averageAge);
    }
    private static String getOldestPerson(){

        return person;
    }
    private static String getYoungestPerson(){
        return person;
    }
}
