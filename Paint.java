class Paint {
 
 static int paintId;
 static String color;
 static String brandName;
 static int branches;
 
 
  static void setPaintId(int id){
        paintId = id;
} 
static int getPaintId(){
	return paintId ;
}
static void setColor(String stallName){
	color=stallName;
}
static String getColor(){
	return color ;
}
static void setBrandName(String bname){
	
	brandName=bname;
}
static String getBrandName(){
	
	return brandName;
}
static void setBranches(int cNo){
	branches= cNo;
}
static int getBranches(){
	
	return branches;
}

}