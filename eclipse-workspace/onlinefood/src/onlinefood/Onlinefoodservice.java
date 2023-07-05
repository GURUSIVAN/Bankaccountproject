package onlinefood;

import java.util.Scanner;

public class Onlinefoodservice {
	static Scanner input=new Scanner(System.in);
	static boolean b=false;
	public static void main(String[] args)throws Exception {
		System.out.println("\t\t\t🖤🖤🖤WELCOME TO PRIMIAM LEGENDS HOTELS🖤🖤🖤");
		System.out.println("\t\t\t***please select the hotel***");
		System.out.println("1.BUHARI\n2.WORLDFAMOUS\n3.CHINIES\n4.SOUTHINDIAN VEG\n");
		int hotel=input.nextInt();
		do {
	switch(hotel) {
		case 1:{
		       System.out.println("*****WELCOME TO BRINDHAVAN*****");	
		       System.out.println("\t\t\tplease select the food");
		       System.out.println("1.chicken briyani\n2.fired rice\n3.mutton soup\n4.tea\n5.exit\n");
		       int foodname=input.nextInt();
		       Thread.sleep(2500);
		       switch(foodname){
		         case 1 :{
			           double price=130;
			           System.out.println("chicken briyani:  "+price);
			           System.out.println("choose payment method");
			   		System.out.println("1.paytem\n2.phonepay\n3.g pay\n");
			   		int payment_method=input.nextInt();
			   			System.out.println("okey thank you get otp");
			   			System.out.println("Enter the otp:");
			   			Thread.sleep(1000);
			   			double resi=Math.random()*9999+9999;
			   			int otp=(int)resi;
			   			System.out.println(otp);
			   			int user_enter_otp=input.nextInt();
			   			Thread.sleep(2000);
			   			System.out.println("********thank you payment sucessful***********");
			     break;
		        }
		         case 2 :{
		              double price=100;
			          System.out.println("fired rice:  "+price);
			          System.out.println("choose payment method");
			  		System.out.println("1.paytem\n2.phonepay\n3.g pay\n");
			  		int payment_method=input.nextInt();
			  			System.out.println("okey thank you get otp");
			  			System.out.println("Enter the otp:");
			  			Thread.sleep(1000);
			  			double resi=Math.random()*9999+9999;
			  			int otp=(int)resi;
			  			System.out.println(otp);
			  			int user_enter_otp=input.nextInt();
			  			Thread.sleep(2000);
			  			System.out.println("********thank you payment sucessful***********");
			    break;
		        }
		         case 3 :{
			          double price=90;
			          System.out.println("mutton soup:  "+price);
			          System.out.println("choose payment method");
			  		System.out.println("1.paytem\n2.phonepay\n3.g pay\n");
			  		int payment_method=input.nextInt();
			  			System.out.println("okey thank you get otp");
			  			System.out.println("Enter the otp:");
			  			Thread.sleep(1000);
			  			double resi=Math.random()*9999+9999;
			  			int otp=(int)resi;
			  			System.out.println(otp);
			  			int user_enter_otp=input.nextInt();
			  			Thread.sleep(2000);
			  			System.out.println("********thank you payment sucessful***********");
			    break;
		        }
		        case 4 :{
			          double price=40;
			          System.out.println("tea        :  "+price);
			          System.out.println("choose payment method");
			  		System.out.println("1.paytem\n2.phonepay\n3.g pay\n");
			  		int payment_method=input.nextInt();
			  			System.out.println("okey thank you get otp");
			  			System.out.println("Enter the otp:");
			  			Thread.sleep(1000);
			  			double resi=Math.random()*9999+9999;
			  			int otp=(int)resi;
			  			System.out.println(otp);
			  			int user_enter_otp=input.nextInt();
			  			Thread.sleep(2000);
			  			System.out.println("********thank you payment sucessful***********");
		      	break;
		       }
		        case 5:{
			        b=true;
			        System.out.println("\t\t\t***Thank you***");
			      break;
		      }
		    default:System.out.println("\t\t\t***ARE you man please select the food***");
		       }
			break;
		}
		 case 2:{
			 System.out.println("*****WELCOME TO FAMOUS*****");	
		     System.out.println("\t\t\tplease select the food");
		     System.out.println("1.chicken briyani\n2.mutton briyani\n3.chicken65\n4.tea\n5.exit\n");
		     int foodname=input.nextInt();
		        Thread.sleep(2500);
		       switch(foodname){
		          case 1 :{
			            double price=120;
			            System.out.println("chicken briyani:  "+price);
			            System.out.println("choose payment method");
			    		System.out.println("1.paytem\n2.phonepay\n3.g pay\n");
			    		int payment_method=input.nextInt();
			    			System.out.println("okey thank you get otp");
			    			System.out.println("Enter the otp:");
			    			Thread.sleep(1000);
			    			double resi=Math.random()*9999+9999;
			    			int otp=(int)resi;
			    			System.out.println(otp);
			    			int user_enter_otp=input.nextInt();
			    			Thread.sleep(2000);
			    			System.out.println("********thank you payment sucessful***********");
			   break;
		            }
		          case 2 :{
		                double price=180;
			            System.out.println("mutton briyani:  "+price);
			            System.out.println("choose payment method");
			    		System.out.println("1.paytem\n2.phonepay\n3.g pay\n");
			    		int payment_method=input.nextInt();
			    			System.out.println("okey thank you get otp");
			    			System.out.println("Enter the otp:");
			    			Thread.sleep(1000);
			    			double resi=Math.random()*9999+9999;
			    			int otp=(int)resi;
			    			System.out.println(otp);
			    			int user_enter_otp=input.nextInt();
			    			Thread.sleep(2000);
			    			System.out.println("********thank you payment sucessful***********");
			    break;
		           }
		          case 3 :{
			            double price=100;
			            System.out.println("chicken65:  "+price);
			            System.out.println("choose payment method");
			    		System.out.println("1.paytem\n2.phonepay\n3.g pay\n");
			    		int payment_method=input.nextInt();
			    			System.out.println("okey thank you get otp");
			    			System.out.println("Enter the otp:");
			    			Thread.sleep(1000);
			    			double resi=Math.random()*9999+9999;
			    			int otp=(int)resi;
			    			System.out.println(otp);
			    			int user_enter_otp=input.nextInt();
			    			Thread.sleep(2000);
			    			System.out.println("********thank you payment sucessful***********");
			    break;
		          }
		         case 4 :{
			           double price=40;
			           System.out.println("tea        :  "+price);
			           System.out.println("choose payment method");
			   		System.out.println("1.paytem\n2.phonepay\n3.g pay\n");
			   		int payment_method=input.nextInt();
			   			System.out.println("okey thank you get otp");
			   			System.out.println("Enter the otp:");
			   			Thread.sleep(1000);
			   			double resi=Math.random()*9999+9999;
			   			int otp=(int)resi;
			   			System.out.println(otp);
			   			int user_enter_otp=input.nextInt();
			   			Thread.sleep(2000);
			   			System.out.println("********thank you payment sucessful***********");
			    break;
		         }
		         case 5:{
			       b=false;
			       System.out.println("\t\t\t***Thank you***");
			    break;
		       }
		    default:System.out.println("\t\t\t***fuck you man please select the food***");
		     }
			break; 
		 }
		 case 3:{
			 System.out.println("*****WELCOME TO chinesehotel*****");	
		     System.out.println("\t\t\tplease select the food");
		     System.out.println("1.Noodels\n2.Pastha\n3.chicken65\n4.Fried rice\n5.exit\n");
		     int foodname=input.nextInt();
		        Thread.sleep(2500);
		       switch(foodname){
		          case 1 :{
			            double price=130;
			            System.out.println("Noodels:  "+price);
			            System.out.println("choose payment method");
			    		System.out.println("1.paytem\n2.phonepay\n3.g pay\n");
			    		int payment_method=input.nextInt();
			    			System.out.println("okey thank you get otp");
			    			System.out.println("Enter the otp:");
			    			Thread.sleep(1000);
			    			double resi=Math.random()*9999+9999;
			    			int otp=(int)resi;
			    			System.out.println(otp);
			    			int user_enter_otp=input.nextInt();
			    			Thread.sleep(2000);
			    			System.out.println("********thank you payment sucessful***********");
			   break;
		            }
		          case 2 :{
		                double price=90;
			            System.out.println("Pastha:  "+price);
			            System.out.println("choose payment method");
			    		System.out.println("1.paytem\n2.phonepay\n3.g pay\n");
			    		int payment_method=input.nextInt();
			    			System.out.println("okey thank you get otp");
			    			System.out.println("Enter the otp:");
			    			Thread.sleep(1000);
			    			double resi=Math.random()*9999+9999;
			    			int otp=(int)resi;
			    			System.out.println(otp);
			    			int user_enter_otp=input.nextInt();
			    			Thread.sleep(2000);
			    			System.out.println("********thank you payment sucessful***********");
			    break;
		           }
		          case 3 :{
			            double price=100;
			            System.out.println("chicken65:  "+price);
			            System.out.println("choose payment method");
			    		System.out.println("1.paytem\n2.phonepay\n3.g pay\n");
			    		int payment_method=input.nextInt();
			    			System.out.println("okey thank you get otp");
			    			System.out.println("Enter the otp:");
			    			Thread.sleep(1000);
			    			double resi=Math.random()*9999+9999;
			    			int otp=(int)resi;
			    			System.out.println(otp);
			    			int user_enter_otp=input.nextInt();
			    			Thread.sleep(2000);
			    			System.out.println("********thank you payment sucessful***********");
			    break;
		          }
		         case 4 :{
			           double price=40;
			           System.out.println("Fried rice       :  "+price);
			           System.out.println("choose payment method");
			   		System.out.println("1.paytem\n2.phonepay\n3.g pay\n");
			   		int payment_method=input.nextInt();
			   			System.out.println("okey thank you get otp");
			   			System.out.println("Enter the otp:");
			   			Thread.sleep(1000);
			   			double resi=Math.random()*9999+9999;
			   			int otp=(int)resi;
			   			System.out.println(otp);
			   			int user_enter_otp=input.nextInt();
			   			Thread.sleep(2000);
			   			System.out.println("********thank you payment sucessful***********");
			    break;
		         }
		         case 5:{
			       b=false;
			       System.out.println("\t\t\t***Thank you***");
			    break;
		       }
		    default:System.out.println("\t\t\t***fuck you man please select the food***");
		       } 
		       break;
		 }
		   case 4:{
			   System.out.println("*****WELCOME TO SOUTHINDIAN VEG*****");	
			     System.out.println("\t\t\tplease select the food");
			     System.out.println("1.Meals\n2.Tomotto rice\n3.Leamon rice\n4.Mixed rice\n5.exit\n");
			     int foodname=input.nextInt();
			        Thread.sleep(2500);
			       switch(foodname){
			          case 1 :{
				            double price=160;
				            System.out.println("Meals:  "+price);
				            System.out.println("choose payment method");
				    		System.out.println("1.paytem\n2.phonepay\n3.g pay\n");
				    		int payment_method=input.nextInt();
				    			System.out.println("okey thank you get otp");
				    			System.out.println("Enter the otp:");
				    			Thread.sleep(1000);
				    			double resi=Math.random()*9999+9999;
				    			int otp=(int)resi;
				    			System.out.println(otp);
				    			int user_enter_otp=input.nextInt();
				    			Thread.sleep(2000);
				    			System.out.println("********thank you payment sucessful***********");
				   break;
			            }
			          case 2 :{
			                double price=50;
				            System.out.println("Tomotto rice:  "+price);
				            System.out.println("choose payment method");
				    		System.out.println("1.paytem\n2.phonepay\n3.g pay\n");
				    		int payment_method=input.nextInt();
				    			System.out.println("okey thank you get otp");
				    			System.out.println("Enter the otp:");
				    			Thread.sleep(1000);
				    			double resi=Math.random()*9999+9999;
				    			int otp=(int)resi;
				    			System.out.println(otp);
				    			int user_enter_otp=input.nextInt();
				    			Thread.sleep(2000);
				    			System.out.println("********thank you payment sucessful***********");
				    break;
			           }
			          case 3 :{
				            double price=60;
				            System.out.println("Leamon rice:  "+price);
				            System.out.println("choose payment method");
				    		System.out.println("1.paytem\n2.phonepay\n3.g pay\n");
				    		int payment_method=input.nextInt();
				    			System.out.println("okey thank you get otp");
				    			System.out.println("Enter the otp:");
				    			Thread.sleep(1000);
				    			double resi=Math.random()*9999+9999;
				    			int otp=(int)resi;
				    			System.out.println(otp);
				    			int user_enter_otp=input.nextInt();
				    			Thread.sleep(2000);
				    			System.out.println("********thank you payment sucessful***********");
				    break;
			          }
			         case 4 :{
				           double price=65;
				           System.out.println("Mixed rice        :  "+price);
				           System.out.println("choose payment method");
				   		System.out.println("1.paytem\n2.phonepay\n3.g pay\n");
				   		int payment_method=input.nextInt();
				   			System.out.println("okey thank you get otp");
				   			System.out.println("Enter the otp:");
				   			Thread.sleep(1000);
				   			double resi=Math.random()*9999+9999;
				   			int otp=(int)resi;
				   			System.out.println(otp);
				   			int user_enter_otp=input.nextInt();
				   			Thread.sleep(2000);
				   			System.out.println("********thank you payment sucessful***********");
				    break;
			         }
			         case 5:{
				       b=false;
				       System.out.println("\t\t\t***Thank you***");
				    break;
			       }
			    default:System.out.println("\t\t\t***fuck you man please select the food***");
		      
		       }
			       break;
		 }
	}
	/*	System.out.println("choose payment method");
		System.out.println("1.paytem\n2.phonepay\n3.g pay\n");
		int payment_method=input.nextInt();
			System.out.println("okey thank you get otp");
			System.out.println("Enter the otp:");
			Thread.sleep(1000);
			double resi=Math.random()*9999+9999;
			int otp=(int)resi;
			System.out.println(otp);
			int user_enter_otp=input.nextInt();
			Thread.sleep(2000);
			System.out.println("********thank you payment sucessful***********");*/
		}while(b=true);
	
      }
}

