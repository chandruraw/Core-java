class  Torch{
  static String brand;
  static String color;
  static double price;
  static boolean isconnected;
  
  public static boolean onOrOff(){
   System.out.println("inside onOrOff()");
   if(isconnected==false){
	   isconnected=true;
	   System.out.println("Torch is turnen on....");
   }
   else if (isconnected==true){
	   isconnected=false;
	   System.out.println("Torch is turnen off...");
   }
  
      System.out.println("end onOrOff");
	  return isconnected ;
  
  }






}