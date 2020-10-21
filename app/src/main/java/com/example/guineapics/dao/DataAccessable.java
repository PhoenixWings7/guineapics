package com.example.guineapics.dao;

import java.util.ArrayList;

public interface DataAccessable <T> {
    ArrayList<T> getArrayList();
    T getByIndex(int index);
    void add(T obj);
    void delete (T obj);
    void delete (int index);
}
