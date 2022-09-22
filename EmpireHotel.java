class EmpireHotel{
public static void main(String a[]){
   String address = "Banglore";
   String managersNames[] = {"vijayalaksmi","Sushma", "mamatha", "Harshith" , "Krushna"};
   String type = "5 star Hotel";
   int noOfManagers = 5;
   String foodMenu[] = {"THandoori Chicken", "panrre tikka", "Ragi Ball", "Mushrrom Chilly", "paneer 65", "VEg Sheek Kabab", "Chicken Rice", "Egg Rice", "Grill", "Parotta", "Mutton Kotthu Parotta", "Beef biryani", "Egg masala", "Kaadai Fry", ""};
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