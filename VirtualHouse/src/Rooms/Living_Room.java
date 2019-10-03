package Rooms;

public class Living_Room {
  
  public static int light = 0;
  public static int TV_channel = 0;
  public static int TV_power = 0;
  
  public static void Lights() {
    if(light == 0) {
      System.out.println("Living Room lights turned on");
      light = 1;
    }
    else if(light == 1) {
      System.out.println("Living Room lights turned off");
      light = 0;
    }
  }
  
  public static String lightsStatus() {
    String status = "";
    if(light == 0) {
      status = "Off";
    }
    else if(light == 1) {
      status = "On";
    }
    return status;
  }
  /*
  public static String TV(int TV_channel,int TV_power) {
	  if(TV_power == 1) {

		switch(TV_channel) {
			case 1:
			  	return "Sports";
			case 2:
			  	return "Movies";
			case 3:
			  	return "Drama";
			case 4:
			  	return "Cartoons";
			case 5:
			  	return "Cooking";
			case 6:
			  	return "";
				  
			  }
		  }
	  else {
		  return("off");
	  }
  }
  */
}
