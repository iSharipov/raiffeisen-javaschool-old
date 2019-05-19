package ru.raiffeisen.tasks.task4;

import ru.raiffeisen.proxy.Person;

import java.lang.reflect.Proxy;

/**
 * Реализовать cache proxy
 */
public class MainEntryClass {
    public static void main(String[] args) {

        //Your code here
        Repository<Person> personRepository = (Repository<Person>) Proxy.newProxyInstance(
                PersonRepository.class.getClassLoader(),
                PersonRepository.class.getInterfaces(),
                new CachedRepository(new PersonRepository()));

        System.out.println(personRepository.byId(1));
        System.out.println(personRepository.byId(1));

        System.out.println(personRepository.findAll());
        System.out.println(personRepository.findAll());
    }
}
