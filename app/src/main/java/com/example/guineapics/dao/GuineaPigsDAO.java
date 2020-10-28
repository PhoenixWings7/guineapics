package com.example.guineapics.dao;

import com.example.guineapics.model.GuineaPig;

import java.util.ArrayList;

public class GuineaPigsDAO implements DataAccessable<GuineaPig> {
    private ArrayList<GuineaPig> pigs = new ArrayList<>();
    private static GuineaPigsDAO DAO;

    private GuineaPigsDAO() {
        createData();
    }

    public static GuineaPigsDAO getDAO() {
        if (DAO == null) {
            DAO = new GuineaPigsDAO();
        }
        return DAO;
    }

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

    public int getPigsCount() {
        return pigs.size();
    }

    // method to provide data for testing
    private void createData() {
        for (int i = 0; i < 10; i++) {
            GuineaPig newPig = new GuineaPig("Piggy "+ i, "Not known");
            pigs.add(newPig);
        }
    }
}
