package com.company;
import java.util.Scanner;
class addInfoD extends InfoD                                        //protected
{
    Scanner sc=new Scanner(System.in);
    int u;
    protected void addingInfo2()
    {
        System.out.print("\nEnter your name: ");
        d2name=sc.nextLine();
        System.out.println();
        System.out.print("\nEnter age: ");
        d2age=sc.nextInt();
        sc.nextLine();
        System.out.println();
        System.out.print("\nEnter gender: ");
        d2gen=sc.nextLine().charAt(0);
        System.out.println();
        System.out.print("\nEnter city: ");
        d2city=sc.nextLine();
        System.out.println();
        System.out.print("\nEnter type of doctor :");
        d2type=sc.nextLine();
        System.out.println();
        System.out.print("\nEnter available time: ");
        d2time=sc.nextLine();
        System.out.println();
        System.out.print("\nEnter your fees: ");
        d2fees=sc.nextInt();
        sc.nextLine();
        System.out.print("\nEnter email :");
        d2eml=sc.nextLine();
        System.out.println();
        }
        protected void editInfo2()
        {
        System.out.println("1.name\n2.age\n3.gender\n4.city\n5.type of doc\n6.Available time\n7.fees\n8.email: ");
        System.out.println("Enter sl no. to select options,0 to exit: ");
        u=sc.nextInt();
        sc.nextLine();
        if(u==0) {
        System.out.println("Ended!");
        }
        else if(u==1){
        System.out.print("Enter name: ");
        d2city=sc.nextLine();
        }
        else if(u==2){
        System.out.print("Enter age: ");
        d2age=sc.nextInt();
        sc.nextLine();
        }
        else if(u==3){
        System.out.print("Enter gender: ");
        d2gen=sc.nextLine().charAt(0);
        sc.nextLine();
        }
        else if(u==4){
        System.out.print("Enter city: ");
        d2city=sc.nextLine();
        }
        else if(u==5){
        System.out.print("Enter type of doctor: ");
        d2type=sc.nextLine();
        }
        else if(u==6){
        System.out.print("Enter available time: ");
        d2time=sc.nextLine();
        }
        else if(u==7){
        System.out.print("Enter fees: ");
        d2fees=sc.nextInt();
        sc.nextLine();
        }
        else if(u==8){
        System.out.print("Enter email: ");
        d2eml=sc.nextLine();
        }
        else{
        System.out.print("Invalid input");
        }
        System.out.println();
        }
        }