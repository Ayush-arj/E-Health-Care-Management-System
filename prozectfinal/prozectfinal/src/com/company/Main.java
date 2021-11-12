package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String cont="yes";
        int ch00=0,ch01=0,ch02=0,ch03=0,ch04=0,ch05=0,ch06=0,ch07=0,ch08=0,ch09=0;
        int nobj=0,ndobj=0;
        DocLogin DL=new DocLogin() ;
        AdminLogin AL = new AdminLogin();
        PatLogin PL=new PatLogin();
        Doctors AD=new Doctors();
        Patients AP=new Patients();
        DocApp[] PD=new DocApp[100];
        DocAcc[] DA=new DocAcc[100];
        Myaccount[] PA=new Myaccount[100];
        MyThread[] MT=new MyThread[100];
        int[][] vis =new int[100][100];
        while(cont.equalsIgnoreCase("yes"))
        {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println("\t***USER TYPE***\n1.Admin\n2.Patient\n3.Doctor");
            System.out.print("Enter sl no of options to choose,0 to exit: ");
            ch00=sc.nextInt();
            sc.nextLine();
            if(ch00==1) {
                boolean bl1 = AL.adlogin();
                if (bl1) {
                    System.out.println("1.Change password\n2.Show all doctors\n3.Show all patients\n4.Add new doctor\n5.Add new patient");
                    System.out.print("Enter sl no of the option to choose,0 to exit: ");
                    ch01 = sc.nextInt();
                    sc.nextLine();
                    System.out.println();
                    if (ch01 == 1) {
                        AL.adchangepw();
                    } else if (ch01 == 2) {
                        ch02 = AD.showdoc();
                        AD.viewdoc(ch02);
                    } else if (ch01 == 3) {
                        ch03 = AP.showpat();
                        AP.viewpat(ch03);
                    } else if (ch01 == 4) {
                        AD.form();
                        for (int i = 0; i < 100; i++) {
                            MT[i] = new MyThread(PD[i], AD);
                        }
                        for (int i = 0; i < 100; i++) {
                            PD[i] = MT[i].D1;
                        }
                    } else if (ch01 == 5) {
                        AP.form();
                    } else if (ch01 == 0) {
                        System.out.println("Ended!");
                    }
                }
            }
            else if(ch00==2)
            {
                int bl2=PL.patlogin();
                int p1=-1;
                if(bl2==1) {
                    nobj++;
                    PA[nobj - 1] = new Myaccount();
                    PA[nobj - 1].addingInfo();
                    AP.copydata2(PA, nobj);
                    p1 = nobj - 1;
                }
                else if(bl2==2) {
                    p1=-2;
                    System.out.print("Enter your email add: ");
                    String str1 = sc.nextLine();
                    System.out.println();
                    for (int i = 0; i < nobj; i++) {
                        if (PA[i].pemail2.equals(str1)) {
                            p1 = i;
                            break;
                        }
                    }
                }
                if(p1!=-1 && p1!=-2) {
                    System.out.println("1.Change password\n2.Show account info\n3.Edit account info\n4.Show all doctors\n5.Show all appointments");
                    System.out.print("Enter sl no. of the option to select,0 to exit: ");
                    ch06 = sc.nextInt();
                    sc.nextLine();
                    System.out.println();
                    if (ch06 == 1) {
                        PL.patchangepw();
                    } else if (ch06 == 2) {
                        PA[p1].showInfo();
                    } else if (ch06 == 3) {
                        PA[p1].editInfo();
                    } else if (ch06 == 4) {
                        ch07 = PD[p1].pshowDoc();
                        int choice=PD[p1].pviewDoc(ch07,p1,vis);
                        if(choice==1){
                            vis[p1][ch07]=1;
                            /*for(int i=0;i<ndobj;i++) {
                                if (PD[p1] == null){
                                    continue;
                                }
                                if (PD[p1].pemail2.equals(DA[i].d2eml)) {
                                    DA[i].copyapp(PD,p1);
                                    break;
                                }
                            }*/
                        }
                    } else if (ch06 == 5) {
                        PD[p1].showallapp();
                    } else if(ch06==0){
                        System.out.println("Ended!");
                    } else {
                        System.out.println("Invalid choice");
                    }
                }
                else if(p1==-2){
                    System.out.println("Email not found!");
                }
            }
            else if(ch00==3){
                int bl3=DL.doclogin();
                int p=-1;
                if(bl3==1){
                    ndobj++;
                    DA[ndobj-1]=new DocAcc();
                    DA[ndobj-1].addinInfoD();
                    AD.copydata3(DA,ndobj);
                    for(int i=0;i<100;i++) {
                        MT[i]=new MyThread(PD[i],AD);
                    }
                    for(int i=0;i<100;i++) {
                        PD[i]=MT[i].D1;
                    }
                    p=ndobj-1;
                }
                else if(bl3==2){
                    p=-2;
                    System.out.print("Enter email: ");
                    String str5=sc.nextLine();
                    for(int i=0;i<ndobj;i++){
                        if(str5.equals(DA[i].d2eml)){
                            p=i;
                        }
                    }
                }
                if(p!=-1 && p!=-2){
                    System.out.println("1.Change password\n2.Show account info\n3.Edit account info\n4.Show appointed patients");
                    System.out.println("Enter sl no. to choose,0 to exit: ");
                    ch08=sc.nextInt();
                    sc.nextLine();
                    if(ch08==0){
                        System.out.println("Ended!");
                    }
                    else if(ch08==1){
                        DL.docchangepw();
                    }
                    else if(ch08==2){
                        DA[p].showInfoD();
                    }
                    else if(ch08==3){
                        DA[p].editInfoD();
                    }
                    else if(ch08==4){
                        ch09=DA[p].showapp();
                        DA[p].viewapp(ch09);
                    }
                    else{
                        System.out.println("Invalid Input");
                    }
                }
                else if(p==-2){
                    System.out.println("Email not found!");
                }

            }
            else if(ch00==0) {
                System.out.println("Ended!");
            }
            else
            {
                System.out.println("Invalid option!");
            }
            System.out.print("Do you want to continue working?: yes/no: ");
            cont=sc.next();
            sc.nextLine();
            if(cont.equalsIgnoreCase("yes") || cont.equalsIgnoreCase("no")) {
                System.out.println();
            }
            else
            {
                System.out.println("\nInvalid input");
            }
        }
    }
}