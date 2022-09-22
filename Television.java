class Television {
  static String brand;
  static String color;
  static double price;
  static boolean isconnected;
  static int maximumVolume ;
  static int currentVolume=8;
  static int minimumVolume ;
  public static boolean onOrOff(){
   System.out.println("inside onOrOff()");
   if(isconnected==false){
	   isconnected=true;
	   System.out.println("Television is turnen on....");
   }
   else if (isconnected==true){
	   isconnected=false;
	   System.out.println("Telivision is turnen off...");
   }
  
      System.out.println("end onOrOff");
	  return isconnected ;
  
  }
  public static void incresingVolume(){                                      
	  System.out.println("inside onOrOff");
	  if(isconnected==true){
	  if(currentVolume<maximumVolume){
		  
		  currentVolume = currentVolume +1;
	  
	  System.out.println("the currentVolume is  :" +currentVolume);        
	  }
	  
	  else {
		  System.out.println("maximum Volume reached");
		  
	  }
	    
  }
  else{
	  System.out.println("modlu Television on madu");
  }
     System.out.println("end incresingVolume()");
  } 
  public static void dicrisingVolume(){
	  System.out.println("inside onOrOff");
	  if(isconnected==true){
	  if(currentVolume > minimumVolume){
		  
		  currentVolume = currentVolume -1;
	  
	  
	  
	  System.out.println("the currentVolume  :"+currentVolume);
	  } 
	 else{
		 System.out.println("minimum Volume reached");
	 }
  } else{
		 System.out.println("modlu Television on madu");
		 
	 }
	 System.out.println("end of dicrisingVolume");
	  
  }
}  
  
	 
	 
	 

	 
	 
	 
	 
	 
	 
	 
	 
	 
	 






