package com.company;

import java.util.Scanner;

class AdminLogin                                     //public
{
    private int dnum=0;
    private String[] aun=new String[100];
    private String[] apw=new String[100];
    private String v,a,b;
    Scanner sc=new Scanner(System.in);
    public boolean adlogin()
    {
        System.out.print("\nAre you new?: yes/no: ");
        v=sc.nextLine();
        System.out.println();
        if(v.equalsIgnoreCase("Yes"))
        {
            System.out.println("\t***SIGNUP***");
            System.out.print("\nEnter username: ");
            a=sc.nextLine();
            System.out.print("\nEnter passwrod,atleast 6 characters: ");
            b=sc.nextLine();
            if(b.length()>5)
            {
                int p=0;
                for(int i=0;i<dnum;i++)
                {
                    if(aun[i].equals(a))
                    {
                        p=1;
                        break;
                    }
                }
                if(p==1)
                {
                    System.out.println("Username already exist!");
                    return false;
                }
                else {
                    dnum++;
                    aun[dnum - 1] = a;
                    apw[dnum - 1] = b;
                    return true;
                }
            }
            else
            {
                System.out.println("Password too short, failed!");
                return false;
            }
        }
        else if(v.equalsIgnoreCase("no")){
            System.out.println("\t***LOGIN***");
            System.out.print("\nEnter username: ");
            a = sc.nextLine();
            System.out.print("\nEnter password: ");
            b = sc.nextLine();
            System.out.println();
            for(int i=0;i<dnum;i++)
            {
                if(aun[i].equals(a) && apw[i].equals(b))
                {
                    System.out.println("Login successfull");
                    return true;
                }
            }
            System.out.println("Username or password incorrect!");
            return false;
        }
        else
        {
            System.out.println("Invalid input");
            return false;
        }
    }
    public void adchangepw()
    {
        System.out.print("\nEnter username: ");
        a=sc.nextLine();
        System.out.print("\nEnter old passwrod: ");
        b=sc.nextLine();
        System.out.println();
        int q=1;
        for(int i=0;i<dnum;i++) {
            if (a.equals(aun[i]) && b.equals(apw[i])) {
                System.out.print("Enter new password,minimum 6 characters: ");
                b = sc.nextLine();
                System.out.println();
                if (b.length() < 6) {
                    System.out.println("Too short,not changed.");
                } else {
                    apw[i] = b;
                    System.out.println("\nPassword changed!");
                }
                q=0;
                break;
            }
        }
        if(q==1)
        {
            System.out.println("Wrong password!");
        }
    }
}