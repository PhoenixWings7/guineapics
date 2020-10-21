package com.example.guineapics.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class GuineaPig {
    private String name;
    private String breed;
    private @Nullable String info;

    public GuineaPig(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(@NonNull String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(@NonNull String breed) {
        this.breed = breed;
    }

    @Nullable
    public String getInfo() {
        return info;
    }

    public void setInfo(@Nullable String info) {
        this.info = info;
    }


}
