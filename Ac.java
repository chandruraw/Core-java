class  Ac{
  static String brand;
  static String color;
  static double price;
  static boolean isconnected;
  static int minimumCooling;
  static int maximumCooling;
  static int currentCooling = 10;
  public static boolean onOrOff(){
   System.out.println("inside onOrOff()");
   if(isconnected==false){
	   isconnected=true;
	   System.out.println("Ac is turnen on....");
   }
   else if (isconnected==true){
	   isconnected=false;
	   System.out.println("Ac is turnen off...");
   }
  
      System.out.println("end onOrOff");
	  return isconnected ;
  
  }
  public static void coolingIncricing(){
	  System.out.println("inside onOrOff");
   if(isconnected==true){
	if(currentCooling<maximumCooling) {
		currentCooling = currentCooling +1;
		System.out.println("the current Cooling    :" + currentCooling);
	}
		
	else{
		System.out.println("the maximumCooling is reached");
	}	
		
		} 
   else{
	   System.out.println("modlu AC on madu");
   }		
	   System.out.println("end coolingIncricing");
	   
  }
 public static void coolingDicricing() {
	 System.out.println("inside onOrOff");
	 if(isconnected==true){
	if(currentCooling>minimumCooling){
      currentCooling = currentCooling -1;		
	 System.out.println("the currentCooling  :" + currentCooling);
	}
	
	else{
		System.out.println("minimum coolingDicricing reached");
	} 
	 }
 else{
	      System.out.println("modlu AC on madu");
         }
   System.out.println("en coolingDicricing");
 }
}
	 
  
	   
	   
	   
	   
   	  
	  
	  
	  
  






