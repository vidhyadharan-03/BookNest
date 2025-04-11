package org.software.Model;

public class Books {
    private String name;
    private int id;
    private String author;
    private String publishedYear;

    public Books()                  //Default Constructor
    {
        this.name=null;
        this.id=0;
        this.author=null;
        this.publishedYear=null;
    }

    public Books(String name, int id, String autho, String year)  //Parameterized constructor
    {
        this.name=name;
        this.id=id;
        this.author=autho;
        this.publishedYear=year;
    }

    public void setName(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return name;
    }

    public void setAuthor(String author)
    {
        this.author = author;
    }
    public String getAuthor()
    {
        return author;
    }

    public void setId(int id)
    {
        this.id=id;
    }
    public int getId()
    {
        return id;
    }
    public void setPublishedYear(String year)
    {
        this.publishedYear=year;
    }
    public String getPublishedYear(){return publishedYear;}
}
