package com.company;

import java.util.Scanner;

class DocLogin                                                //public
{
    private int d2num=0;
    private String[] dun=new String[100];
    private String[] dpw=new String[100];
    private String v3,a3,b3;
    Scanner sc=new Scanner(System.in);
    public int doclogin()
    {
        System.out.print("\nAre you new?: yes/no: ");
        v3=sc.nextLine();
        System.out.println();
        if(v3.equalsIgnoreCase("Yes"))
        {
            System.out.println("\t***REGISTER***");
            System.out.print("\nEnter username: ");
            a3=sc.nextLine();
            System.out.print("\nEnter passwrod,atleast 6 characters: ");
            b3=sc.nextLine();
            if(b3.length()>5)
            {
                int p=0;
                for(int i=0;i<d2num;i++)
                {
                    if(dun[i].equals(a3))
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
                    d2num++;
                    dun[d2num - 1] = a3;
                    dpw[d2num - 1] = b3;
                    return 1;
                }
            }
            else
            {
                System.out.println("Password too short, failed!");
                return 0;
            }
        }
        else if(v3.equalsIgnoreCase("no")){
            System.out.println("\t***LOGIN***");
            System.out.print("\nEnter username: ");
            a3 = sc.nextLine();
            System.out.print("\nEnter password: ");
            b3 = sc.nextLine();
            System.out.println();
            for(int i=0;i<d2num;i++)
            {
                if(dun[i].equals(a3) && dpw[i].equals(b3))
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
    public void docchangepw()
    {
        System.out.print("\nEnter username: ");
        a3=sc.nextLine();
        System.out.print("\nEnter old passwrod: ");
        b3=sc.nextLine();
        System.out.println();
        int q2=1;
        for(int i=0;i<d2num;i++) {
            if (a3.equals(dun[i]) && b3.equals(dpw[i])) {
                System.out.print("Enter new password,minimum 6 characters: ");
                b3 = sc.nextLine();
                System.out.println();
                if (b3.length() < 6) {
                    System.out.println("Too short,not changed!");
                } else {
                    dpw[i] = b3;
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