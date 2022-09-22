class  Headphone{
  static String brand;
  static String color;
  static double price;
  static boolean isconnected;
  static int minimumSound;
  static int maximumSound;
  static int currentSound=8;
  
  public static boolean onOrOff(){
   System.out.println("inside onOrOff()");
   if(isconnected==false){
	   isconnected=true;
	   System.out.println("Headphone is turnen on....");
   }
   else if (isconnected==true){
	   isconnected=false;
	   System.out.println("Headphone is turnen off...");
   }
  
      System.out.println("end onOrOff");
	  return isconnected ;
  
  }
  public static void soundIncreasing(){
	  System.out.println("inside onOrOff");
	  if(isconnected==true){
		if(currentSound<maximumSound) {
			currentSound=currentSound +1;
			System.out.println("the currentSound  :" + currentSound);
			} 
	else {
		System.out.println("the maximumSound achived");
	}	  		
		  
	  }
	  
	else {
		System.out.println("modlu power on madu");
	}  
	  
	  System.out.println("end soundIncreasing");
	  
	  
  }
  public static void sounddicreasing(){
	  System.out.println("inside onOrOff");
	  if(isconnected==true){
		if(currentSound>minimumSound) {
			currentSound=currentSound -1;
			System.out.println("the currentSound  :" + currentSound);
			} 
	else {
		System.out.println("the minimumSound achived");
	}	  		
		  
	  }
	  
	else {
		System.out.println("modlu power on madu");
	}  
	  
	  System.out.println("end sounddicreasing");
	  
	  
  }

}