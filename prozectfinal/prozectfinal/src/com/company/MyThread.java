package com.company;

class MyThread extends Thread{                                                       //public
    DocApp D1=null;
    Doctors D2=null;
    @Override
    public void run() {
        if(D1==null)
        {
            D1=new DocApp();
        }
        D1.copydata(D2);
    }
    MyThread(DocApp DA,Doctors D){
        D1=DA;
        D2=D;
        start();
    }
}
