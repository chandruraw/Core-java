class SunglassesTester {

   public static void main(String a[]){
   
   Sunglasses brand = new Sunglasses() ;
	brand.name = "Fastrack";
    brand.price = 679;
	brand.warranty = "1 year";
	System.out.println(brand.name +" \n  "+ brand.price +" \n "+brand.warranty);
	
	Sunglasses brand1 = new Sunglasses() ;
	brand1.name = "Rozzetta craft";
    brand1.price = 303;
	brand1.warranty = "6 monthes";
	System.out.println(brand1.name +" \n  "+ brand1.price +" \n "+brand1.warranty);
	
	Sunglasses brand2 = new Sunglasses() ;
	brand2.name = "Rybon";
    brand2.price = 1000;
	brand2.warranty = "12 monthes";
	System.out.println(brand2.name +" \n  "+ brand2.price +" \n "+brand2.warranty);
	
	Sunglasses brand3 = new Sunglasses() ;
	brand3.name = "Polaroid";
    brand3.price = 3079;
	brand3.warranty = "6 monthes";
	System.out.println(brand3.name +" \n  "+ brand3.price +" \n "+brand3.warranty);
	
	Sunglasses brand4 = new Sunglasses() ;
	brand4.name = "Rich club";
    brand4.price = 279;
	brand4.warranty = "6 monthes";
	System.out.println(brand4.name +" \n  "+ brand4.price +" \n "+brand4.warranty);
	
   }
   
}