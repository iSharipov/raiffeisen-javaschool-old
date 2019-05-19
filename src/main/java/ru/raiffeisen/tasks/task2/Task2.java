package ru.raiffeisen.tasks.task2;

import ru.raiffeisen.tasks.task1.Person;

import java.util.Arrays;

/**
 * Вывести все get методы класса
 */
public class Task2 {

    public static void main(String[] args) {

        //Your code here
        Arrays.asList(Person.class.getDeclaredMethods()).forEach(method -> {
                    if (method.getName().startsWith("get")) {
                        System.out.println(method.getName());
                    }
                }
        );
    }
}
