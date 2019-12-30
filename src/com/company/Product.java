package com.company;

public class Product {
    private String msg;
    private int id;

    public Product(String msg, int id)
    {
        this.msg = msg;
        this.id = id;
    }
    public String getMsg()
    {
        return msg;
    }
    public int getId()
    {
        return id;
    }
    public void setMsg( String msg )
    {
        this.msg = msg;
    }
    public void setId( int id )
    {
        this.id = id;
    }
}
