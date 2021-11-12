package com.company;

import java.util.Scanner;

class DocApp extends Info                                      //public
{
    private int z;
    private String v2;
    Scanner sc=new Scanner(System.in);
    public int pshowDoc()
    {
        for(int i=0;i<dn;i++)
        {
            System.out.println(i+1+". Name: "+dname[i]);
        }
        System.out.print("\nEnter the sl of doctor for details,0 to exit: ");
        z=sc.nextInt();
        sc.nextLine();
        return z;
    }
    public int pviewDoc(int a, int p, int[][] vis)
    {
        if(a==0)
        {
            System.out.println("Ended!");
            return 0;
        }
        else if(a>dn)
        {
            System.out.println("Invalid input");
            return 0;
        }
        else
        {
            System.out.println("Name of doctor: "+dname[a-1]);
            System.out.println("City of doctor: "+dcity[a-1]);
            System.out.println("Gender of doctor: "+dgen[a-1]);
            System.out.println("Age of doctor: "+dage[a-1]);
            System.out.println("Type of doctor: "+dtype[a-1]);
            System.out.println("Available time of doctor: "+dtime[a-1]);
            System.out.println("Fees of doctor: "+dfees[a-1]);
            System.out.print("Do you want to book appointment?: yes/no :");
            v2=sc.nextLine();
            System.out.println();
            if(v2.equalsIgnoreCase("Yes")) {
                if(vis[p][a]==1){
                    System.out.println("Appointment already scheduled!");
                    return 0;
                }
                String inf;
                System.out.println("Choose method of payment\n");
                int ch;
                System.out.println("\n1.Debit Card\n2.Credit Card\n3.Netbanking: ");
                ch = sc.nextInt();
                sc.nextLine();
                if(ch>3 || ch<1){
                    System.out.println("Invalid choice!");
                    return 0;
                }
                else if (ch == 1) {
                    System.out.println("\nEnter name on card");
                    inf = sc.next();
                    sc.nextLine();
                    System.out.print("\nEnter card no.: ");
                    inf = sc.next();
                    sc.nextLine();
                    if (inf.length() != 16) {
                        System.out.println("Wrong card no.,Transaction failed!");
                        return 0;
                    }
                    System.out.print("\nEnter CVV number: ");
                    inf = sc.next();
                    sc.nextLine();
                    if (inf.length() != 3) {
                        System.out.println("Wrong CVV no.,Transaction failed!");
                        return 0;
                    }
                    System.out.print("\nEnter expiry date: ");
                    inf = sc.next();
                    sc.nextLine();
                    System.out.println();
                } else if (ch == 2) {
                    System.out.println("\nEnter name on card");
                    inf = sc.next();
                    sc.nextLine();
                    System.out.print("\nEnter card no.: ");
                    inf = sc.next();
                    sc.nextLine();
                    if (inf.length() != 16) {
                        System.out.println("Wrong card no.,Transaction failed!");
                        return 0;
                    }
                    System.out.print("\nEnter CVC number: ");
                    inf = sc.next();
                    sc.nextLine();
                    if (inf.length() != 3) {
                        System.out.println("Wrong CVC number,Transaction failed!");
                        return 0;
                    }
                    System.out.print("\nEnter expiry date: ");
                    inf = sc.next();
                    sc.nextLine();
                    System.out.println();
                } else{
                    System.out.print("\nEnter bank name: ");
                    inf = sc.nextLine();
                    System.out.println("\nEnter account no.: ");
                    inf = sc.next();
                    sc.nextLine();
                    if (inf.length() <= 9 || inf.length() >= 12) {
                        System.out.println("Wrong account number,Transaction failed!");
                        return 0;
                    }
                    System.out.print("\nEnter IFSC code: ");
                    inf = sc.next();
                    sc.nextLine();
                    if (inf.length() != 11) {
                        System.out.println("Wrong IFSC code,Transaction failed!");
                        return 0;
                    }
                    System.out.println();
                }
                pn2++;
                adname[pn2 - 1] = dname[a - 1];
                adcity[pn2 - 1] = dcity[a - 1];
                adgen[pn2 - 1] = dgen[a - 1];
                adage[pn2 - 1] = dage[a - 1];
                adtype[pn2 - 1] = dtype[a - 1];
                adtime[pn2 - 1] = dtime[a - 1];
                adfees[pn2 - 1] = dfees[a - 1];
                System.out.println("Transaction Successfull");
                return 1;
            }
        }
        return 0;
    }
    public void showallapp()
    {
        System.out.println("Names of doctors: ");
        for(int i=0;i<pn2;i++)
        {
            System.out.println(adname[i]);
        }
    }
    public void copydata(Doctors D)
    {
        dn++;
        dname[dn - 1] = D.dname[D.numofdoc() - 1];
        dgen[dn - 1] = D.dgen[D.numofdoc() - 1];
        dage[dn - 1] = D.dage[D.numofdoc() - 1];
        dtype[dn - 1] = D.dtype[D.numofdoc() - 1];
        dcity[dn - 1] = D.dcity[D.numofdoc() - 1];
        dtime[dn - 1] = D.dtime[D.numofdoc() - 1];
        dfees[dn - 1] = D.dfees[D.numofdoc() - 1];
    }
}