package bankaccount;

public class Userchange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bankaccount user1=new Bankaccount("gurusivan",9791996054L,"male");
		Bankaccount user2=new Bankaccount("prasanna",8976453542L,"male");
		System.out.println(user1.name);
		System.out.println(user1.getcontact());
		System.out.println(user1.gender);
		System.out.println(user1.getacountbal());
		user1.deposite(1500000);
		System.out.println(user1.getacountbal());
		user1.withdraw(5000);
		System.out.println(user1.getacountbal());
	}

}

