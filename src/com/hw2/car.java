package com.hw2;

public class car
{
    private String name;
    private String manufacturer;
    private String publicationDate;
    private float engineVolume;

    public car()
    {
        name = "";
        manufacturer = "";
        publicationDate = "";
        engineVolume = 0f;
    }
    public car(String name, String manufacturer, String publicationDate, float engineVolume)
    {
        this.name = name;
        this.manufacturer = manufacturer;
        this.publicationDate = publicationDate;
        this.engineVolume = engineVolume;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void demolish()
    {
        name = "";
        manufacturer = "";
        publicationDate = "";
        engineVolume = 0;
    }
    public String getName()
    {
        return name;
    }
    public String getManufacturer()
    {
        return manufacturer;
    }
    public String getPublicationDate()
    {
        return publicationDate;
    }
    public float getEngineVolume()
    {
        return engineVolume;
    }

    @Override
    public String toString()
    {
        return manufacturer + " " + name + " выпущенная в " + publicationDate + " году, объём двигателя- " + engineVolume + " литров.";
    }
}
