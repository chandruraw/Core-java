class Speaker {
  
   static String brand;
   static String color;
   static double price;
   static boolean isConnected ;
   static int minimumVolume;
   static int currentVolume=8;
   static int maximumVolume ;
  
   public static boolean onOrOff () {
   System.out.println("inside onOrOff()");
   if (isConnected == false){
   isConnected = true;
   System.out.println("Speaker is turned on....");
   }
  else if(isConnected == true){
   isConnected = false ;
   System.out.println("speaker is turned off...");
   }
   
   System.out.println("end of onOrOff()");
   return isConnected ;


   }

  public static void increaseVolume(){
	  System.out.println("inside increaseVolume()");
	  if(isConnected==true){
	  if(currentVolume<maximumVolume){
	  currentVolume=currentVolume + 1;
	  System.out.println("the currentVolume is  :"+ currentVolume);
	  
	   
	  } else {
		   System.out.println("maximumVolume reached");
	   }
	  } else {
		     System.out.println("gube.. speaker on madu");
	   }
	     System.out.println("end of increaseVolume()"
		 
		 );
  }
   public static void dicresedVolume(){
	  System.out.println("inside dicresedVolume");
	  if(isConnected==true){
	  if(currentVolume>minimumVolume){
	  currentVolume=currentVolume - 1;
	  System.out.println("the currentVolume is  :"+ currentVolume);
	  
	   
	  } else {
		   System.out.println("minimumVolumereached");
	   }
	  } else {
		     System.out.println("gube.. speaker on madu");
	   }
	     System.out.println("end of dicresedVolume()"
		 
		 );
  }
}