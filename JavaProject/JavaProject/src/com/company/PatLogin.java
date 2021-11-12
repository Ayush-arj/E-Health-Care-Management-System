package com.company;

import java.util.Scanner;

public class PatLogin                                  //public
{
    private int pnum=0;
    private String[] pun=new String[100];
    private String[] ppw=new String[100];
    private String v2,a2,b2;
    Scanner sc=new Scanner(System.in);
    public int patlogin()
    {
        System.out.print("\nAre you new?: yes/no: ");
        v2=sc.nextLine();
        System.out.println();
        if(v2.equalsIgnoreCase("Yes"))
        {
            System.out.println("\t***REGISTER***");
            System.out.print("\nEnter username: ");
            a2=sc.nextLine();
            System.out.print("\nEnter passwrod,atleast 6 characters: ");
            b2=sc.nextLine();
            if(b2.length()>5)
            {
                int p=0;
                for(int i=0;i<pnum;i++)
                {
                    if(pun[i].equals(a2))
                    {
                        p=1;
                        break;
                    }
                }
                if(p==1)
                {
                    System.out.println("Username already exist!");
                    return 0;
                }
                else {
                    pnum++;
                    pun[pnum - 1] = a2;
                    ppw[pnum - 1] = b2;
                    return 1;
                }
            }
            else
            {
                System.out.println("Password too short, failed!");
                return 0;
            }
        }
        else if(v2.equalsIgnoreCase("no")){
            System.out.println("\t***LOGIN***");
            System.out.print("\nEnter username: ");
            a2 = sc.nextLine();
            System.out.print("\nEnter password: ");
            b2 = sc.nextLine();
            System.out.println();
            for(int i=0;i<pnum;i++)
            {
                if(pun[i].equals(a2) && ppw[i].equals(b2))
                {
                    System.out.println("Login successfull");
                    return 2;
                }
            }
            System.out.println("Username or password incorrect!");
            return 0;
        }
        else
        {
            System.out.println("Invalid input");
            return 0;
        }
    }
    public void patchangepw()
    {
        System.out.print("\nEnter username: ");
        a2=sc.nextLine();
        System.out.print("\nEnter old passwrod: ");
        b2=sc.nextLine();
        System.out.println();
        int q2=1;
        for(int i=0;i<pnum;i++) {
            if (a2.equals(pun[i]) && b2.equals(ppw[i])) {
                System.out.print("Enter new password,minimum 6 characters: ");
                b2 = sc.nextLine();
                System.out.println();
                if (b2.length() < 6) {
                    System.out.println("Too short,not changed!");
                } else {
                    ppw[i] = b2;
                    System.out.println("\nPassword changed!");
                }
                q2=0;
                break;
            }
        }
        if(q2==1)
        {
            System.out.println("Wrong password!");
        }
    }
}
