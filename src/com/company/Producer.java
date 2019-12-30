package com.company;

import java.util.Random;

class Producer implements Runnable
{
    private Product msg;

    public Producer( Product msg ) { this.msg = msg; }

    @Override
    public void run()
    {
        Random r = new Random();
        String name = Thread.currentThread().getName();
        //System.out.printf( "[%s] uruchomiony\n", name );
        try
        {
            Thread.sleep( r.nextInt(1000) );
            synchronized( msg )
            {
                msg.setMsg( "Product" );

                msg.notifyAll();
            }
        } catch (InterruptedException e) { e.printStackTrace(); }
    }
}
