package com.hw2;

import java.util.Random;

public class country
{
    private String name;
    private String lang;
    private long population;

    private country()
    {
        name = "";
        lang = "";
        population = 0;
    }
    public country(String name, String lang, long population)
    {
        this.name = name;
        this.lang = lang;
        this.population = population;
    }

    public void setLang(String lang)
    {
        this.lang = lang;
    }
    public void catastrophe()
    {
        int victims = new Random().nextInt(10000);
        population -= victims;
        System.out.println("в стране произошла катастрофа, в результате погибло " + victims + " человек.\n");
    }

    public String getName()
    {
        return name;
    }
    public String getLang()
    {
        return lang;
    }
    public long getPopulation()
    {
        return population;
    }

    @Override
    public String toString()
    {
        return "страна " + name + ", " + lang + " язык" + ", население " + population + " человек.\n";
    }
}
