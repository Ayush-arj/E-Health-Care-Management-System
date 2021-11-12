package com.company;

import java.util.Scanner;

class AddNewDoc extends DocVar              //protected
{
    Scanner sc=new Scanner(System.in);
    void fillform()
    {
        dn++;
        System.out.print("\nEnter name of doctor: ");
        dname[dn-1]=sc.nextLine();
        System.out.print("\nEnter city of doctor: ");
        dcity[dn-1]=sc.nextLine();
        System.out.print("\nEnter gender of doctor: ");
        dgen[dn-1]=sc.next().charAt(0);
        sc.nextLine();
        System.out.print("\nEnter age of doctor: ");
        dage[dn-1]=sc.nextInt();
        sc.nextLine();
        System.out.print("\nEnter type of doctor: ");
        dtype[dn-1]=sc.nextLine();
        System.out.print("\nEnter available time: ");
        dtime[dn-1]=sc.nextLine();
        System.out.print("\nEnter fees: ");
        dfees[dn-1]=sc.nextInt();
        sc.nextLine();
        System.out.print("\nEnter email: ");
        deml[dn-1]=sc.nextLine();
        System.out.println();
    }
}
