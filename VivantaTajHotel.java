class VivantaTajHotel{
public static void main(String a[]){
   String address = "Banglore";
   String managersNames[] = {"Akshta","lakshimi", "Sangeeta", "Ganesha" , "Sumanth"};
   String type = "5 star Hotel";
   int noOfManagers = 5;
   String foodMenu[] = {"Tandoori Gobi", "panrre tikka", "Gobi65", "Mushrrom Chilly", "paneer 65", "VEg Sheek Kabab", "Chicken Rice", "Egg Rice", "Grill", "Parotta", "Mutton Kotthu Parotta", "Botti Fry", "Egg masala", "Kaadai Fry", "Prawn Rice"};
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