package com.company;

import java.util.Scanner;

class Patients extends AddNewPat              //public
{
    private int y;
    Scanner sc=new Scanner(System.in);
    public int showpat()
    {
        for(int i=0;i<pn;i++)
        {
            System.out.println(i+1+". Name: "+pname[i]);
        }
        System.out.println("Enter sl no. of patients to view details,0 to exit: ");
        y=sc.nextInt();
        sc.nextLine();
        return y;
    }
    public void viewpat(int a)
    {
        if(a==0)
        {
            System.out.println("Ended!");
        }
        else if(a>pn)
        {
            System.out.println("Invalid input");
        }
        else {
            System.out.println("Name of patient: " + pname[a - 1]);
            System.out.println("Gender of patient: " + pgen[a - 1]);
            System.out.println("Age of patient: " + page[a - 1]);
            System.out.println("Address of patient: " + padd[a - 1]);
            System.out.println("Phone no. of patient: " + pph[a - 1]);
            System.out.println();
        }
    }
    public void copydata2(Myaccount[] Ma,int a){
        pn++;
        pname[pn - 1]=Ma[a-1].pname2;
        pgen[pn - 1]=Ma[a-1].pgen2;
        page[pn - 1]=Ma[a-1].page2;
        padd[pn - 1]=Ma[a-1].padd2;
        pph[pn - 1]=Ma[a-1].pph2;
    }
    public void form()
    {
        fillform();
    }
}
