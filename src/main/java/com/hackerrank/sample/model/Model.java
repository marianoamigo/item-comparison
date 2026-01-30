package com.hackerrank.sample.model;

//don't use of @Entity annotation because there is no database.
//Model name was left to respect the test contracts.
public class Model{
    private Integer id;
    private String name;


    public Model () {}

    public Model(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {

        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }
}
