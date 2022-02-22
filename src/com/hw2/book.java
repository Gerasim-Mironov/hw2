package com.hw2;

public class book
{
    private String name;
    private String authorsFullName;
    private String publicationDate;
    private String genre;
    private int amountOfPages;

    public book()
    {
        name = "";
        authorsFullName = "";
        publicationDate = "";
        genre = "";
        amountOfPages = 0;
    }
    public book(String name, String authorsFullName, String publicationDate, String genre, int amountOfPages)
    {
        this.name = name;
        this.authorsFullName = authorsFullName;
        this.publicationDate = publicationDate;
        this.genre = genre;
        this.amountOfPages = amountOfPages;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }
    public String getAuthorsFullName()
    {
        return authorsFullName;
    }
    public String getPublicationDate()
    {
        return publicationDate;
    }
    public String getGenre()
    {
        return genre;
    }
    public int getAmountOfPages()
    {
        return amountOfPages;
    }

    public void forbidBook()
    {
        name = "";
        authorsFullName = "";
        publicationDate = "";
        genre = "";
        amountOfPages = 0;
    }

    @Override
    public String toString()
    {
        return "книга <<" + name + ">>, автор " + authorsFullName + ", была выпущена в " + publicationDate + " году,"
                + genre + ", " + amountOfPages + " страниц.";
    }
}
