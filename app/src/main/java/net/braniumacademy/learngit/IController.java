package net.braniumacademy.learngit;

import java.util.List;

public interface IController<T> {
    List<T> getAll();

    List<T> findByName(String name);

    T findById(String id);
}
