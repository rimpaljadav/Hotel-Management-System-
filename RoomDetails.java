package Com.HMS;

import java.util.Scanner;

public class RoomDetails {
	Room room[]=new Room[20];
	int index=0;	//used to store room in new position if customer booked multiple rooms at a time
	
	public void getRoom(String c_adhar) {
		Scanner sc=new Scanner(System.in);
		System.out.println("======================");
		System.out.println("--Rooms--");
		System.out.println("1.DeluxRoom\n2.Delux_AC_Room\n3.SingleRoom\n4.Single_AC_Room");
		System.out.print("Enter a choice: ");
		int choice =sc.nextInt();
		int r_no;
		int r_quantity;
		String r_type;
		float r_price;
		float r_total = 0;
		boolean isbooked=false;
		
		switch(choice) {
		//for delux room
		case 1:{
			System.out.println("How Many Delux Room Do You Want...?");
			System.out.print("Enter here: ");
			r_quantity=sc.nextInt();
			r_no=1001;r_type="Delux Room";r_price=2000;
			for(int i=1;i<r_quantity;i++) {
				r_no++;
				r_total=r_price*r_quantity;
				isbooked=true;
			}
			room[index]=new Room(c_adhar, r_no, r_type, r_price, r_total);
			index++;
			String s = (isbooked) ? "Booked Successfully." +" Per Room Price is\s"+r_price: "Failed";
			System.out.println(s);
			System.out.println("So,Your Room Bill is: "+r_total);

		}
		break;
		
		//for delux_ac_room
		case 2:{
			System.out.println("How Many Delux_AC_Room Do You Want...?");
			System.out.print("Enter here: ");
			r_quantity=sc.nextInt();
			r_no=2001;r_type="Delux_AC_Room";r_price=3000;
			for(int i=1;i<r_quantity;i++) {
				r_no++;
				index++;
				r_total=r_price*r_quantity;
				isbooked=true;
			}
			room[index]=new Room(c_adhar, r_no, r_type, r_price, r_total);
			index++;
			String s = (isbooked) ? "Booked Successfully." +" Per Room Price is\s"+r_price: "Failed";
			System.out.println(s);
			System.out.println("So,Your Room Bill is: "+r_total);
		}
		break;
		
		//for single room
		case 3:{
			System.out.println("How Many SingleRoom Do You Want...?");
			System.out.print("Enter here: ");
			r_quantity=sc.nextInt();
			r_no=2001;r_type="Single";r_price=1500;
			for(int i=1;i<r_quantity;i++) {
				r_no++;
				index++;
				r_total=r_price*r_quantity;
				isbooked=true;
			}
			room[index]=new Room(c_adhar, r_no, r_type, r_price, r_total);
			index++;
			String s = (isbooked) ? "Booked Successfully." +" Per Room Price is\s"+r_price: "Failed";
			System.out.println(s);
			System.out.println("So,Your Room Bill is: "+r_total);
		}
		break;
		
		//for single_ac_room
		case 4:{
			System.out.println("How Many Single_AC_Room Do You Want...?");
			System.out.print("Enter here: ");
			r_quantity=sc.nextInt();
			r_no=2001;r_type="Single_AC";r_price=1800;
			for(int i=1;i<r_quantity;i++) {
				r_no++;
				index++;
				r_total=r_price*r_quantity;
				isbooked=true;
			}
			room[index]=new Room(c_adhar, r_no, r_type, r_price, r_total);
			index++;
			String s = (isbooked) ? "Booked Successfully." +" Per Room Price is\s"+r_price: "Failed";
			System.out.println(s);
			System.out.println("So,Your Room Bill is: "+r_total);
		}
		break;
		
		default:
			System.out.print("Enter Valid Choice: ");
		}
	}

	public float roomTotal(String c_adhar) {
		float price=0;
		for(int i=0;i<room.length;i++) {
			if(room[i]!=null) {
				if(room[i].getC_adhar().equals(c_adhar)) {
					price+=room[i].getR_total();
				}
			}
			}
		return price;
	}
}