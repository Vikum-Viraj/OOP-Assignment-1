package oop;

import java.util.Scanner;



public class RoomChargeCalculator {

	private static  int  balcony = 500;
	private static int parking = 200;
	public static int tv = 200;
	public static int kitchen = 1000;
	public static int wifi = 100;
	public static int standardkitchen = 500;
	public static int garden = 200;
	public static int ac = 500;
	
	public static int deluxDoublefixedPrice = 5000;
	public static int standardFamilyfixedPrice = 3000;
	public static int standardSinglefixedPrice = 2000;
	
	
	public static void main(String[] args) {
		
		
		
		 Scanner scn = new Scanner(System.in);
			
		 String yesno; 
		
		System.out.println("Hotel Room Calculator !!!");
		
		  System.out.println("Delux Double Room 1");
		  System.out.println("Standard Family Room 2");
		  System.out.println("Standard Single Room 3");
		  System.out.println("Quit 4 ");
		
		  int choose = scn.nextInt();
		  
		 
		 switch(choose)
		 {
		 
		 case 1:
			 
			 System.out.println("Dulux double Room cost is 5000 ");
			 System.out.println();
			 
			 
			 System.out.println("***Additional service pack ****");
			 System.out.println("Charge for balcony  500");
			 System.out.println("Charge for parking  200");
			 System.out.println("Charge for Tv 200 ");
			 System.out.println("Charge for kitchen 1000");
			 System.out.println("Charge for WiFi 100 ");
			 
			 System.out.println("Do you need Additional Services ");
			 System.out.println();
			 
			 
			 yesno = scn.next();
			 
			 if(yesno.toLowerCase().equals("yes"))
			 {
				System.out.println("Do you want balcony service ? yes/no");
				String balcon = scn.next();
				boolean balconyresponse = Response(balcon);
				
				System.out.println("Do you want parking service ? yes/no");
				String park = scn.next();
				boolean parkingresponse = Response(park);
				
				System.out.println("Dou you want a TV ? yes/no");
				String tv = scn.next();
				boolean tvresponse = Response(tv);
				
				System.out.println("Dou you want a kitchen ? yes/no");
				String kitchn = scn.next();
				boolean kitchenresponse = Response(kitchn);
				
				System.out.println("Do you want wifi service ? yes/no");
				String wify = scn.next();
				boolean wifyreponse = Response(wify);		
				
				getChargeDeluxDouble(balconyresponse,parkingresponse,tvresponse,kitchenresponse,wifyreponse);
			 }
			 else
			 {
				 System.out.println("Your hotel room cost is "+deluxDoublefixedPrice);
			 }
		 
		 break;
		  
		 case 2:
			 System.out.println("Statndard familiy cost is 3000 ");
			 System.out.println();
			 
			 System.out.println("***Additional service pack ****");
			 System.out.println("Charge for parking 200 ");
			 System.out.println("Charge for Kitchen 500 ");
			 System.out.println("Charge for garden  200 " );
			 
			 System.out.println("Do you need additional service ? yes/no");
			 yesno = scn.next();
			 
			 if(yesno.toLowerCase().equals("yes"))
			 {
				 
				 System.out.println("Do you want parking service ? yes/no ");
				 System.out.println();
				 
				 
				 String Sprk = scn.next();
				 boolean Sprkresponse = Response(Sprk);
				 
				 System.out.println("Do you want a Kitchen ? yes/no ");
				 String Skitchen = scn.next();
				 boolean Skithenresponse = Response(Skitchen);
				 
				 System.out.println("Do you want a garden ? yes/no ");
				 String Sgarden = scn.next();
				 boolean Sgardenresponse = Response(Sgarden);
				 
				 
				 getChargeStandardFamily(Sprkresponse, Skithenresponse , Sgardenresponse );
				 
				 
				 
			 }
			 else
			 {
				 System.out.println("Your hotel room cost is "+standardFamilyfixedPrice);
			 }
			
		 break;
		 
		 case 3:
			 
			 System.out.println("Standard Single cost is  2000 ");
			 System.out.println();
			 
			 
			 
			 System.out.println("Do you need addition service ? yes/no");
			 yesno = scn.next();
			 
			 if(yesno.toLowerCase().equals("yes") )
			 {
				 System.out.println("Do you want Parking service ? yes/no ");
				 System.out.println();
				 
				 String SSpark = scn.next();
				 boolean SSParkresponse = Response(SSpark);
				 
				 System.out.println("Dou you want AC ? yes/no ");
				 String SSAC = scn.next();
				 boolean SSACrespoonce = Response(SSAC);
				 
				 System.out.println("Dou you want wifi service ? yes/no ");
				 String SSWIfi = scn.next();
				 boolean SSWifiresponce = Response(SSWIfi);
				 
				 getChargeStandardSingle(SSParkresponse,SSACrespoonce,SSWifiresponce);
				 
			 }
			 else
			 {
				 System.out.println("Your hotel room cost is "+standardSinglefixedPrice);
			 }
		 
			 break;
		 case 4:
			 
			 System.out.println("Good bye !!!");
			 
		     break;
			 default:
				 
				 System.out.println("Out of range enter valid package number !!!");
		 }
		 
		 
			 
			 
			 
		  
		  
		  
		  
	
				

	}
	
	public static int getcost(boolean answer,int cost)
	{
		if(answer == true)
		{
			return cost;
		}
		else
		{
			cost = 0;
			return cost;
		
		}
		
		
	}

	public static void getChargeDeluxDouble(boolean bal,boolean prk,boolean tvr,boolean kitch,boolean wif)
	{
		
		int BALCONY = getcost(bal,balcony);
		int PARKING = getcost(prk,parking);
		int TV      = getcost(tvr,tv);
		int KITCHEN = getcost(kitch,kitchen);
		int WIFI    = getcost(wif,wifi);
		
		int totalcost = deluxDoublefixedPrice+ BALCONY + PARKING + TV + KITCHEN + WIFI;
		System.out.println("Your total cost with addition services : "+totalcost);
	}
	
	
	
	public static boolean Response(String answer)
	{
		  
		  if(answer.toLowerCase().equals("yes"))
		  {
			  return true;
		  }
		  else
		  {
			  return false;
		  }
	}

	
	
	public static void getChargeStandardFamily(boolean Spark,boolean Skithen,boolean Sgarden)
	{
		
		int PARK = getcost(Spark,parking);
		int KITCHEN = getcost(Skithen,standardkitchen);
		int GARDEN = getcost(Sgarden,garden);
		
		int 	StandardTotal = standardFamilyfixedPrice +PARK +KITCHEN +GARDEN;
		
		System.out.println("Your total cost with aditional serices : "+StandardTotal );
	}
	
	
	public static void getChargeStandardSingle(boolean SSprk,boolean SSac,boolean SSwifi)
	{
		int SSPARK = getcost(SSprk,parking);
		int SSAC   = getcost(SSac,ac);
		int SSWIFI = getcost(SSwifi,wifi);
		
		
		int StandardSingleTotal = standardSinglefixedPrice + SSPARK + SSAC + SSWIFI;
		
		System.out.println("Your total cost with additional services : "+StandardSingleTotal);
	}
	
}




