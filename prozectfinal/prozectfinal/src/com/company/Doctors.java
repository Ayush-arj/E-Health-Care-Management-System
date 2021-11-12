package com.company;

import java.util.Scanner;

class Doctors extends AddNewDoc               //public
{
    int x;
    Scanner sc=new Scanner(System.in);
    int showdoc()
    {
        for(int i=0;i<dn;i++)
        {
            System.out.println(i+1+". Name: "+dname[i]);
        }
        System.out.println("\nEnter sl no of doctor to view details,enter 0 to exit: ");
        x=sc.nextInt();
        return x;
    }
    void viewdoc(int a)
    {
        if(a==0)
        {
            System.out.println("Ended!");
        }
        else if(a>dn)
        {
            System.out.println("Invalid input");
        }
        else {
            System.out.println("Name of doctor: " + dname[a - 1]);
            System.out.println("City of doctor: " + dcity[a - 1]);
            System.out.println("Gender of doctor: " + dgen[a - 1]);
            System.out.println("Age of doctor: " + dage[a - 1]);
            System.out.println("Type of doctor: " + dtype[a - 1]);
            System.out.println("Available time of doctor: " + dtime[a - 1]);
            System.out.println("Fees of doctor: " + dfees[a - 1]);
            System.out.println("Email of doctor: "+deml[a-1]);
            System.out.println();
        }
    }
    void copydata3(DocAcc[] Da,int a){
        dn++;
        dname[dn-1]=Da[a-1].d2name;
        dage[dn-1]=Da[a-1].d2age;
        dgen[dn-1]=Da[a-1].d2gen;
        dcity[dn-1]=Da[a-1].d2city;
        dtype[dn-1]=Da[a-1].d2type;
        dtime[dn-1]=Da[a-1].d2time;
        dfees[dn-1]=Da[a-1].d2fees;
        deml[dn-1]=Da[a-1].d2eml;
    }
    void form()
    {
        fillform();
    }
    int numofdoc() {
        return dn;
    }
}
