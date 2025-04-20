package Com.HMS;

import java.util.Scanner;

public class FoodService {
	Food food[]=new Food[20];
	
	public void getFood(String c_adhar) {
		Scanner sc=new Scanner(System.in);
		int choice,f_quantity,index=0;
		float f_price;
		String f_type,f_name;
		
		do {
			System.out.println("======================");
			System.out.println("--Food Menu--");
			System.out.println("1.Veg\n2.Non-Veg\n3.Exit");
			System.out.print("What Would You Like To Take...?\nJust Enter The Number here->");
			choice=sc.nextInt();
			System.out.println("======================");

			int ch;
			float f_total = 0;
			switch(choice) {
			//Veg Menu
			case 1:{
				do {
				System.out.println("***Veg Menu***");
				System.out.println("1.SevBhaji\n2.PannerTikka\n3.Dal-Rice\n4.Chapati\n5.Naan\n6.Exit");
				System.out.print("Enter choice: ");
				ch=sc.nextInt();
				
				switch(ch) {
				//for Sevbhaji
				case 1:{
						f_name="SevBhaji";f_type="Veg";f_price=120;
						System.out.println("How many SevBhaji do you Want...?");
						System.out.print("Enter the quanity-> ");
						f_quantity=sc.nextInt();
						for(int i=1;i<f_quantity;i++) {
							f_total=f_price*f_quantity;	
						}
						food[index]=new Food(c_adhar, f_type, f_price, f_name, f_name,f_total);
						index++;
						System.out.println("SevBhaji Price: "+f_price+",And Quantity is: "+f_quantity);
						System.out.println("Your Total Bill is: "+f_total);
					}break;
					
					//for panner-tikka
				case 2:{
					f_name="PannerTikka";f_price=150;f_type="Veg";
					System.out.println("How many PannerTikka Do you Want...? ");
					System.out.print("Enter the quanity-> ");
					f_quantity=sc.nextInt();
					for(int i=1;i<f_quantity;i++) {
						f_total=f_price*f_quantity;
					}
					food[index]=new Food(c_adhar, f_type, f_price, f_name, f_name,f_total);
					index++;
					System.out.println("PannerTikka Price: "+f_price+",And Quantity is: "+f_quantity);
					System.out.println("Your Total Bill is: "+f_total);

				}
				break;
				
				//for Dal-rice
				case 3:{
					f_name="Dal-rice";f_type="Veg";f_price=180;
					System.out.println("How Many Dal-rice Do You Want...?");
					System.out.print("Enter the quanity-> ");
					f_quantity=sc.nextInt();
					for(int i=1;i<f_quantity;i++) {
						f_total=f_price*f_quantity;
					}
					food[index]=new Food(c_adhar, f_type, f_price, f_name, f_name,f_total);
					index++;
					System.out.println("Dal-rice Price: "+f_price+",And Quantity is: "+f_quantity);
					System.out.println("Your Total Bill is: "+f_total);

				}
				break;
				
				//for chapati
				case 4:{
					f_name="Chapati";f_type="Veg";f_price=10;
					System.out.println("How Many Chapati Do You Want...?");
					System.out.print("Enter the quanity-> ");
					f_quantity=sc.nextInt();
					for(int i=1;i<f_quantity;i++) {
						f_total=f_price*f_quantity;
					}
					food[index]=new Food(c_adhar, f_type, f_price, f_name, f_name,f_total);
					index++;
					System.out.println("Per Chapati Price: "+f_price+",And Quantity is: "+f_quantity);
					System.out.println("Your Total Bill is: "+f_total);
				}
				break;
				
				//for Naan
				case 5:{
					f_name="Naan";f_type="Veg";f_price=15;
					System.out.println("How Many Naan Do You Want...?");
					System.out.print("Enter the quanity-> ");
					f_quantity=sc.nextInt();
					for(int i=1;i<f_quantity;i++) {
						f_total=f_price*f_quantity;
					}
					food[index]=new Food(c_adhar, f_type, f_price, f_name, f_name,f_total);
					index++;
					System.out.println("Per Naan Price: "+f_price+",And Quantity is: "+f_quantity);
					System.out.println("Your Total Bill is: "+f_total);
				}
				
				break;
				
				default: 
					if(ch!=6) System.out.println("Please,Select From the available food menu");
				}
				}while(ch!=6);

			}
		
			//Non-Veg
			System.out.println("======================");
				case 2:{
					do {
					System.out.println("***Non-Veg Menu***");
					System.out.println("1.Chicken\n2.Mutton\n3.Crabs\n4.Naan\n5.Rice\n6.Exit");
					System.out.print("Enter Your Choice: ");
					ch=sc.nextInt();
					
					switch(ch) {
					case 1:{
						//for Chicken
						f_name="Chicken";f_type="Non-Veg";f_price=250;
						System.out.println("How Many Chicken Dish Do you Want...?");
						System.out.print("Enter the quanity-> ");
						f_quantity=sc.nextInt();
						for(int i=1;i<f_quantity;i++) {
							f_total=f_price*f_quantity;
						}
						food[index]=new Food(c_adhar, f_type, f_price, f_name, f_name,f_total);
						index++;
						System.out.println("Chicken Price is: "+f_price+",And Quantity is: "+f_quantity);
						System.out.println("Your Total Bill is: "+f_total);
						}
					break;
					//for Mutton
					case 2: {
						f_name="Mutton";f_type="Non-veg";f_price=300;
						System.out.println("How Many Mutton Dish Do You Want...?");
						System.out.print("Enter the quanity-> ");
						f_quantity=sc.nextInt();
						for(int i=1;i<f_quantity;i++) {
							f_total=f_price*f_quantity;
						}
						food[index]=new Food(c_adhar, f_type, f_price, f_name, f_name,f_total);
						index++;
						System.out.println("Mutton Price is: "+f_price+",And Quantity is: "+f_quantity);
						System.out.println("Your Total Bill is: "+f_total);
					}
					break;
					
					//for Crabs
					case 3:{
						f_name="Crabs";f_type="Non-veg";f_price=360;
						System.out.println("How Many Crabs Dish Do You Want...?");
						System.out.print("Enter the quanity-> ");
						f_quantity=sc.nextInt();
						for(int i=1;i<f_quantity;i++) {
							f_total=f_price*f_quantity;
						}
						food[index]=new Food(c_adhar, f_type, f_price, f_name, f_name,f_total);
						index++;
						System.out.println("Crabs Price is: "+f_price+",And Quantity is: "+f_quantity);
						System.out.println("Your Total Bill is: "+f_total);					}
					break;
					
					//for Naan
					case 4:{
						f_name="Naan";f_type="Non-veg";f_price=30;
						System.out.println("How Many Naan Dish Do You Want...?");
						System.out.print("Enter the quanity-> ");
						f_quantity=sc.nextInt();
						for(int i=1;i<f_quantity;i++) {
							f_total=f_price*f_quantity;
						}
						food[index]=new Food(c_adhar, f_type, f_price, f_name, f_name,f_total);
						index++;
						System.out.println("Naan Price is: "+f_price+",And Quantity is: "+f_quantity);
						System.out.println("Your Total Bill is: "+f_total);					}
					break;
					
					//for Rice 
					case 5:{
						f_name="Rice";f_type="Non-veg";f_price=360;
						System.out.println("How Many Rice Dish Do You Want...?");
						System.out.print("Enter the quanity-> ");
						f_quantity=sc.nextInt();
						for(int i=1;i<f_quantity;i++) {
							f_total=f_price*f_quantity;
						}
						food[index]=new Food(c_adhar, f_type, f_price, f_name, f_name,f_total);
						index++;
						System.out.println("Rice Price is: "+f_price+",And Quantity is: "+f_quantity);
						System.out.println("Your Total Bill is: "+f_total);		
						}
					break;
					
					//Exit Menu
					default: 	if(ch!=6) System.out.println("Please,Select From the available food menu");
					}
					}
					while(ch!=6);
					break;
					
					}					

				default:	if(choice!=3) System.out.println("Select valid Menu...");
					}
				}
			
		while(choice!=3);
			}
	
	public float foodTotal(String c_adhar) {
		float price=0;
		for(int i=0;i<food.length;i++) {
			if(food[i]!=null) {
				if(food[i].getC_adhar().equals(c_adhar)) {
					price+=food[i].getF_total();
				}
			}
			}

		return price;
	}
}