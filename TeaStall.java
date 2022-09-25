class TeaStall {

 static int teaStallId;
 static String name;
 static String address;
 static long contactNo ;


 static void setTeaStallId(int id){
        teaStallId= id;
} 
static int getTeaStallId(){
	return teaStallId ;
}
static void setName(String stallName){
	name=stallName;
}
static String getName(){
	return name ;
}
static void setAddress(String add){
	
	address=add;
}
static String getAddress(){
	
	return address;
}
static void setContactNo(long cno){
	contactNo = cno;
}
static long getContactNo(){
	
	return contactNo;
}
}