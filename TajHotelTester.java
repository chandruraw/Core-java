class TajHotelTester{

	public static void main (String [] a){
	
	TajHotel taj = new TajHotel();
	taj.type="5 Star";
	taj.address="Colaba area of Mumbai, Maharashtra, India.";
	taj.floors="6 Floors";
	taj.fancy();
	System.out.println(taj.type+"\n"+taj.address+"\n"+taj.floors);
	
	TajHotel taj1 = new TajHotel();
	taj1.type="5 Star";
	taj1.address="Taj Yeshwantpur, Bengaluru";
	taj1.floors="4 Floors";
	taj1.fancy();
	System.out.println(taj1.type+"\n"+taj1.address+"\n"+taj1.floors);
	
	TajHotel taj2 = new TajHotel();
	taj2.type="7 Star";
	taj2.address="Number One Mansingh Road, New Delhi, Delhi,India.";
	taj2.floors="5 Floors";
	taj2.fancy();
	System.out.println(taj2.type+"\n"+taj2.address+"\n"+taj2.floors);
	
	TajHotel taj3 = new TajHotel();
	taj3.type="5 Star";
	taj3.address=" Mount Road,Chennai,India.";
	taj3.floors="6 Floors";
	taj3.fancy();
	System.out.println(taj3.type+"\n"+taj3.address+"\n"+taj3.floors);
	
	TajHotel taj4 = new TajHotel();
	taj4.type="5 Star";
	taj4.address="Near Industrial Area, Netaji Market, Near Sodal Mandir & Leader Factory Road, Jalandhar City.";
	taj4.floors="5 Floors";
	taj4.fancy();
	System.out.println(taj4.type+"\n"+taj4.address+"\n"+taj4.floors);
	
	
	
	
	
	
	
	
	}



}