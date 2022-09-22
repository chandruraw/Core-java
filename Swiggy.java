class Swiggy{
	
 public static double takeOrder(String item){
 
 // String item = " \n  pastries";
  if (item=="Pizza"){
	  System.out.println("Thank you for ordaring "+ item);
	  return 99.00;
  }
   if (item=="Burger"){
	  System.out.println("Thank you for ordaring "+ item);
	  return 66.99;
  }
    if (item=="Sanwitch"){
	  System.out.println("Thank you for ordaring "+ item);
	  return 99.00;
  }
    if (item=="Biryani"){
	  System.out.println("Thank you for ordaring "+ item);
	  return 66.99;
  }
    if (item=="mudde"){
	  System.out.println("Thank you for ordaring "+ item);
	  return 66.99;
  }
    if (item=="Thandoori"){
	  System.out.println("Thank you for ordaring "+ item);
	  return 66.99;
  }
    if (item=="Chilli chikan"){
	  System.out.println("Thank you for ordaring "+ item);
	  return 66.99;
  }
    return 0.0;
 
 
 }




	
 public static double takeOrder(String item ,int quntity){
 
 // String item = " \n  pastries";
  if (item=="Pizza"){
	  System.out.println("Thank you for ordaring "+ item);
	  return 66.99*quntity;
  }
   if (item=="Burger"){
	  System.out.println("Thank you for ordaring "+ item);
	  return 66.99*quntity;
  }
    if (item=="Sanwitch"){
	  System.out.println("Thank you for ordaring "+ item);
	    return 66.99*quntity;
  }
    if (item=="Biryani"){
	  System.out.println("Thank you for ordaring "+ item);
	   return 66.99*quntity;
  }
    if (item=="mudde"){
	  System.out.println("Thank you for ordaring "+ item);
	  return 66.99*quntity;
  }
    if (item=="Thandoori"){
	  System.out.println("Thank you for ordaring "+ item);
	   return 66.99*quntity;
  }
    if (item=="Chilli chikan"){
	  System.out.println("Thank you for ordaring "+ item);
	  return 66.99*quntity;
  }
  return 0.00;
 

}
}