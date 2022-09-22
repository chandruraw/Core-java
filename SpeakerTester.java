class SpeakerTester {

 public static void main (String a[]){
 
   Speaker.brand= "Sony";
   Speaker.color = "black";
   Speaker.price = 5098.89;
   Speaker.onOrOff();
   Speaker.dicresedVolume();
   Speaker.dicresedVolume();
   Speaker.dicresedVolume();
   Speaker.dicresedVolume();
   Speaker.dicresedVolume();
     //Speaker.increaseVolume();
	 //Speaker.increaseVolume();
	 //Speaker.increaseVolume();
	 //Speaker.increaseVolume();
	 //Speaker.increaseVolume();
	 
   Speaker.onOrOff();
  // Speaker.dicresedVolume();
    Speaker.increaseVolume();
	
 System.out.println("speaker brand name is"+ Speaker.brand);
 System.out.println( "speaker color is"+Speaker.color);
 System.out.println("speaker priceis " +Speaker.price);
 
 }



}