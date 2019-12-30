package com.company;

class Consumer implements Runnable
{
    private Product msg;
    public int id;

    public Consumer(Product msg, int id ) { this.msg = msg; }
    @Override
    public void run()
    {
        String name = Thread.currentThread().getName();
        synchronized( msg )
        {
            try
            {
                System.out.println( name+" oczekiwanie na produkt");
                msg.wait();
            }
            catch(InterruptedException e){ e.printStackTrace(); }
            System.out.println( "Produkt otrzymany "+name);
            System.out.printf( "[%s] otrzymal: %s\n", name, msg.getMsg() );
        }
    }
}

