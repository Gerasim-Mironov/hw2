package com.hw2;

public class human
{
    private String name;
    private String gender;
    private String race;
    private int age;

    public human()
    {
        this.name = "";
        this.gender = "";
        this.race = "";
        this.age = 0;
    }
    public human(String name, String gender, String race, int age)
    {
        this.name = name;
        this.gender = gender;
        this.race = race;
        this.age = age;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    public void setAge(int age)
    {
        this.age = age;
    }

    public String getName()
    {
        return this.name;
    }
    public String getGender()
    {
        return this.gender;
    }
    public String getRace()
    {
        return this.race;
    }
    public int getAge()
    {
        return this.age;
    }

    @Override
    public String toString()
    {
        return name + ", " + gender + ", " + race + ", " + age + ".";
    }
}
