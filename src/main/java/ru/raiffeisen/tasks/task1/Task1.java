package ru.raiffeisen.tasks.task1;

import ru.raiffeisen.reflection.MainEntryClass;

import java.util.Date;

/**
 * Вывести на консоль все методы класса, включая все родительские методы (включая приватные)
 */
public class Task1 {
    public static void main(String[] args) {

        // Your code here
        Person person = new Student("John", "Doe", new Date(), "Biology");
        MainEntryClass.getAllMethods(person).forEach(System.out::println);
    }
}