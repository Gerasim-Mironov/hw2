package com.hw2;

import java.util.Random;

public class city
{
    private String name;
    private String type;
    private int inhabitants;

    public city()
    {
        name = "";
        type = "";
        inhabitants = 0;
    }
    public city(String name, String type, int inhabitants)
    {
        this.name = name;
        this.type = type;
        this.inhabitants = inhabitants;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    public void commitACrime()
    {
        int victims = new Random().nextInt(10) / 2;
        this.inhabitants -= victims;
        System.out.println("в городе произошло преступление, в результате погибло " + victims + " человек.\n");

    }

    public String getName()
    {
        return name;
    }
    public String getType()
    {
        return type;
    }
    public double getInhabitants()
    {
        return inhabitants;
    }

    @Override
    public String toString()
    {
        return "город " + name + ", " + type + " тип местности" + ", с населением в " + inhabitants + " человек.\n";
    }
}
