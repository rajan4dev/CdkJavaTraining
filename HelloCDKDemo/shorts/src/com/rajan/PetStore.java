package com.rajan;

/**
 * Created by bhirudr on 7/21/2017.
 */
public class PetStore {
    private int id;
    private String name;
    private String description;

    @Override
    public String toString() {
        return "shortcuts{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public PetStore(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }
}
