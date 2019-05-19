package ru.raiffeisen.tasks.task3;

import ru.raiffeisen.tasks.task1.Person;
import ru.raiffeisen.tasks.task1.Student;

import java.util.Arrays;
import java.util.Date;

import static java.lang.reflect.Modifier.isFinal;
import static java.lang.reflect.Modifier.isPrivate;
import static java.lang.reflect.Modifier.isStatic;

/**
 * Проверить что все String константы имеют значение = имя
 */
public class Task3 {

    public static void main(String[] args) {

        Person person = new Student("John", "Doe", new Date(), "Biology");

        //Your code here
        Arrays.asList(person.getClass().getDeclaredFields()).forEach(field -> {
            int modifiers = field.getModifiers();
            if (isPrivate(field.getModifiers()) && isStatic(modifiers) && isFinal(modifiers) && field.getType().isAssignableFrom(String.class)) {
                try {
                    field.setAccessible(true);
                    Object o = field.get(person);
                    if (!field.getName().equals(o)) {
                        throw new IllegalAccessException(field.getName() + " != " + o);
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
