package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Product> product= new ArrayList<Product>();

        for(int i=0;i<=10;i++){
            Product msg = new Product( "x",i );
            Consumer x = new Consumer( msg,i );
            new Thread( x, "Odbiorca nr."+i ).start();
            Producer sender = new Producer(msg);
            new Thread( sender, "Nadawca" ).start();
        }


        System.out.println( "[Main] Nadawanie uruchomione" );


    }
}
