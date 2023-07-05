package newproject;

import java.util.Scanner;

public class Bankaccount {
	 static Scanner input=new Scanner(System.in);
     public String name;
     private long contact;
     private double acountbal=0.0;
     public String gender;
     
     public Bankaccount() {
    	 
     }
     public Bankaccount(String n,long contact,String gender) {
    	   name=n;
    	   this.contact=contact;
    	   this.gender=gender;
     }
     
     public void deposite(double money){
    	 acountbal+=money;
    	 System.out.println("money deposite successfully");
     }
     public void withdraw(double withdraw) {
    	 if(acountbal>=withdraw){
    		 acountbal-=withdraw;
    		 System.out.println("money withdraw successfully"); 
    	 }
    	 else {
    		 System.out.println("fail :---insufficiant balance");
    	 }
     }
    	 
    public long getcontact() {
    	 return contact;
    }
    public double getacountbal() {
    	return acountbal;
    }
    
    public void setcontact(long newcontact) {
    	 System.out.println("enter the old contact");
    	 long phoneno=input.nextLong();
    	 if(phoneno==contact){
    		int potp=this.sysotp();
    		//System.out.println(potp);
    		 System.out.println("enter the otp");
    		//double res=Math.random()*9999+9999;
    		System.out.println(potp);
    		 int Gotp=input.nextInt();
    		 if(Gotp==potp){
    			 contact=newcontact;
    			 System.out.println("Modification successfully...");
    		 }
    		 else {
    			 System.out.println("invalid otp:re Enter the otp");
    		 }
    	 }
    	 else {
    		 System.out.println("contact miss  match!! so again re enter the contact");
    	 }
    }
    public int sysotp(){
    	double res=Math.random()*9999+9999;
    	return (int)res;
    }
}

