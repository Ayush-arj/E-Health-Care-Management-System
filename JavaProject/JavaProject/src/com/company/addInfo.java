package com.company;


import java.util.Scanner;

class addInfo extends Info                             //protected
{
    Scanner sc=new Scanner(System.in);
    protected void addingInfo1()
    {
        System.out.print("\nEnter your name: ");
        pname2=sc.nextLine();
        System.out.print("\nEnter gender: ");
        pgen2=sc.next().charAt(0);
        sc.nextLine();
        System.out.print("\nEnter age: ");
        page2=sc.nextInt();
        System.out.print("\nEnter phone no.: ");
        pph2=sc.next();
        sc.nextLine();
        System.out.print("\nEnter email add: ");
        pemail2=sc.nextLine();
        System.out.print("\nEnter address(with pin code): ");
        padd2=sc.nextLine();
        System.out.println();
    }
    protected void editInfo1()
    {
        int ch2;
        System.out.println("1.name\n2.gender\n3.age\n4.phone no.\n5.email address\n6.address:");
        System.out.print("Enter sl no. of which to edit: ");
        ch2=sc.nextInt();
        sc.nextLine();
        if(ch2==1)
        {
            System.out.print("\nEnter your name: ");
            pname2=sc.nextLine();
            System.out.println();
        }
        else if(ch2==2)
        {
            System.out.print("\nEnter gender: ");
            pgen2=sc.next().charAt(0);
            sc.nextLine();
            System.out.println();
        }
        else if(ch2==3)
        {
            System.out.print("\nEnter age: ");
            page2=sc.nextInt();
            sc.nextLine();
            System.out.println();
        }
        else if(ch2==4)
        {
            System.out.print("\nEnter phone no.: ");
            pph2=sc.next();
            sc.nextLine();
            System.out.println();
        }
        else if(ch2==5)
        {
            System.out.print("\nEnter email address: ");
            pemail2=sc.nextLine();
            System.out.println();
        }
        else if(ch2==6)
        {
            System.out.print("\nEnter address(with pin code): ");
            padd2=sc.nextLine();
            System.out.println();
        }
        else
        {
            System.out.println("Invalid choice!");
        }
    }
}