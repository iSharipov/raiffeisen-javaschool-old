package ru.raiffeisen.tasks.task4;

import java.util.List;

public interface Repository<T> {

    T byId(long id);

    List<T> findAll();
}
