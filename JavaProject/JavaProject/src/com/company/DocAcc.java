package com.company;

class DocAcc extends addInfoD{                                        //public
    public void showInfoD(){
        System.out.println("Name: "+d2name);
        System.out.println("Age: "+d2age);
        System.out.println("Gender: "+d2gen);
        System.out.println("City: "+d2city);
        System.out.println("Type of doctor: "+d2type);
        System.out.println("Available time: "+d2time);
        System.out.println("Fees: "+d2fees);
        System.out.println("Email: "+d2eml);
    }
    public void copyapp(DocApp[] Dap,int a){
        d2n++;
        apname[d2n-1]=Dap[a-1].pname2;
        apage[d2n-1]=Dap[a-1].page2;
        apeml[d2n-1]=Dap[a-1].pemail2;
        apgen[d2n-1]=Dap[a-1].pgen2;
    }
    public int showapp(){
        int z1;
        for(int i=0;i<d2n;i++){
            System.out.println(i+1+"Name: "+d2name);
        }
        System.out.println("Enter sl no. to view details,0 to exit");
        z1=sc.nextInt();
        return z1;
    }
    public void viewapp(int a){
        if(a==0){
            System.out.println("Ended!");
        }
        else if(a>d2n){
            System.out.println("Invalid choice");
        }
        else{
            System.out.println("Name: "+apname[a-1]);
            System.out.println("Email: "+apeml[a-1]);
            System.out.println("Age: "+apage[a-1]);
            System.out.println("Gender: "+apgen[a-1]);
        }
    }
    public void addinInfoD(){
        addingInfo2();
    }
    public void editInfoD(){
        editInfo2();
    }
}