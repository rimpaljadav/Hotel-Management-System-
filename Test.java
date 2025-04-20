package Com.HMS;

import java.util.Date;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Customer cust[]=new Customer[20];
		RoomDetails rd=new RoomDetails();
		FoodService fs=new FoodService();
		int index=0;
		int choice;
		String name,adhar,address;
		long contact;
		String date=new Date().toString();
		boolean ischeckin=true;
		boolean ischeckout=false;
	
	
	
	do {
		System.out.println("***Registration***");
		System.out.println("1.CheckIn\n2.CheckOut\n3.Exit");
		System.out.print("Enter Your Choice: ");
		choice = sc.nextInt();
		
		System.out.println("======================");

		switch(choice) {
		//for checkIn
		case 1:{
			System.out.println("***Fill the Form***");
			System.out.print("Enter Your Name: ");
			name=sc.next();
			System.out.print("Enter Your Contact Number: ");
			contact=sc.nextLong();
			System.out.print("Enter Your Address: ");
			address=sc.next();
			System.out.print("Enter Your Adhar: ");
			adhar=sc.next();
			
			System.out.println("======================");

			for(int i=0;i<cust.length;i++) {
				if(cust[i]!=null && cust[i].getC_adhar().equals(adhar)) {
					ischeckin=false;
				}
		}
			cust[index]=new Customer(name, adhar, contact, address, date) ;
			index++;
			int ch;
			if(ischeckin) {
				do {
					System.out.println("======================");
				System.out.println("**Welcome**");
				System.out.println("1.Room\n2.Food\n3.Exit");
				System.out.print("Enter Your Choice: ");
				ch=sc.nextInt();
				
				switch(ch) {
				case 1: 
					rd.getRoom(adhar);
					break;
				case 2:
					fs.getFood(adhar);
					break;
				default:
						System.out.println("Enter valid choice");
				}
			}while(ch!=3);}
			else {
				System.out.println("You're Already CheckIn...");
			}
		}
		break;
		//for checkOut
		case 2:{
			System.out.print("Enter Your Adhar: ");
			adhar=sc.next();
			for(int i=0;i<1;i++) {
				if(cust[i]!=null && cust[i].getC_adhar().equals(adhar)) {
					ischeckout=true;
				}
				else {
					System.out.println("Please,CheckIn First...");
				}
				if(cust[i]!=null && ischeckout) {
					float roomTotal=rd.roomTotal(cust[i].getC_adhar());
					float foodTotal=fs.foodTotal(cust[i].getC_adhar());
					float total=roomTotal+foodTotal;
					System.out.println("***Invoice***");
					System.out.println("Your Room Total is: "+roomTotal);
					System.out.println("Your Food Total is: "+foodTotal);
					System.out.println("Bill is: "+total);
					System.out.println("\n***Thank You For Visiting.***");
				}
				cust[i]=null;
			}
			}
		break;
		default:
			if(choice!=3)
			System.out.println("Please Select What Do You Want...?CheckIn or CheckOut");
			System.exit(choice);
		}
	}
		while(choice!=3);
	
	}
}