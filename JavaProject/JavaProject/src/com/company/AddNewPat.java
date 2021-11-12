package com.company;

import java.util.Scanner;

class AddNewPat extends PatVar                 //protected
{
    Scanner sc=new Scanner(System.in);
    protected void fillform()
    {
        pn++;
        System.out.print("\nEnter name of patient: ");
        pname[pn-1]=sc.nextLine();
        System.out.print("\nEnter gender of patient: ");
        pgen[pn-1]=sc.nextLine().charAt(0);
        System.out.print("\nEnter age of patient: ");
        page[pn-1]=sc.nextInt();
        sc.nextLine();
        System.out.print("\nEnter address of patient: ");
        padd[pn-1]=sc.nextLine();
        System.out.print("\nEnter phone no. of patient: ");
        pph[pn-1]=sc.nextLine();
        System.out.println();
    }
}