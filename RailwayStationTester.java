class RailwayStationTester{
	public static void main(String a[]){
 RailwayStation.setName("Hampi Exp");
 RailwayStation.setTrain("AC");
 RailwayStation.setDestination("Mysore");
 RailwayStation.setPrice(300);
 
   System.out.println(RailwayStation.getName());
   System.out.println (RailwayStation.getTrain());
   System.out.println(RailwayStation.getDestination()); 
   System.out.println(RailwayStation.getPrice());
 
	}
}