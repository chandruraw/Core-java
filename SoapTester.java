class SoapTester{
   
   public static void main(String a[]){
	   
   
    // create a multiple of Soap
	
	//className ref = new className() ;
	Soap soap = new Soap() ;
	
	soap.shape = "Oval";
	soap.color = "cream";
	soap.name = "Mysore Sandal Soap";
	soap.toGetFresh() ;
	System.out.println(soap.shape+ "  " +soap.color+ " " +soap.name);
	
	Soap soap1 = new Soap();
	soap1.shape = "Rectangle";
	soap1.color = "White";
	soap1.name = "Fiama";
	soap.toGetFresh();
	System.out.println(soap1.shape+ "  " +soap1.color+ " " +soap1.name);
	
	
	Soap soap2 = new Soap();
	soap2.shape = "Rectangle";
	soap2.color = "milky";
	soap2.name = "Dove";
	soap.toGetFresh();
	System.out.println(soap2.shape+ "  " +soap2.color+ " " +soap2.name);
	
	Soap soap3=new Soap();
	soap3.shape="oval";
    soap3.color="oringe";
    soap3.name= "santour";
    soap.toGetFresh();
	System.out.println(soap3.shape+ "  " +soap3.color+ " " +soap3.name);
	 
    Soap soap4=new Soap();
	soap4.shape="oval";
    soap4.color="red";
    soap4.name= "lifeBoy";	
	soap.toGetFresh();
	System.out.println(soap4.shape+ "  " +soap4.color+ " " +soap4.name);
	
	 Soap soap5=new Soap();
	soap5.shape="Rectangle";
    soap5.color="Green";
    soap5.name= "chinthol";
    soap.toGetFresh();
System.out.println(soap5.shape+ "  " +soap5.color+ " " +soap5.name);	
	
   }
}