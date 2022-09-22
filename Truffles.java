class Truffles{
public static void main(String a[]){
   String address = "Banglore";
   String managersNames[] = {"Kiran","Chandrashekar", "Sunil", "Harshith" , "Akshata"};
   String type = "5 star Hotel";
   int noOfManagers = 5;
   String foodMenu[] = {"THandoori Chicken", "panrre tikka", "veg Fried Rice", "Chicken Garlic", "paneer crispy", "parwans chilly", "Chicken Rice", "Egg Rice", "Grill", "mixed frid rice", "Mutton Kotthu ", "Beef biryani", "Egg masala", "Kaadai Fry", ""};
   System.out.println("Destination :" + address);
   System.out.println("Name of Managers" +managersNames);
   System.out.println("type of hotel " + type);
   System.out.println("noOfManagers" + noOfManagers);
   for(int m=0; m< managersNames.length;m++){
   System.out.println(managersNames[m] + " ");
  
   }
   
   for(int f=0; f< foodMenu.length;f++)
	{
   System.out.println(foodMenu[f] +" " );
   }
   }
   }