package com.example.guineapics.dao;

import com.example.guineapics.model.GuineaPig;

import java.util.ArrayList;

public class GuineaPigsDAO implements DataAccessable<GuineaPig> {
    private ArrayList<GuineaPig> pigs = new ArrayList<>();

    @Override
    public ArrayList<GuineaPig> getArrayList() {
        return pigs;
    }

    @Override
    public GuineaPig getByIndex(int index) {
        return pigs.get(index);
    }

    @Override
    public void add(GuineaPig pig) {
        pigs.add(pig);
    }

    @Override
    public void delete(GuineaPig pig) {
        pigs.remove(pig);
    }

    @Override
    public void delete(int index) {
        pigs.remove(index);
    }
}
