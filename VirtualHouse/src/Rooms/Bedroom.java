package Rooms;


public class Bedroom {
  public static int light = 0;
  
  public static void Lights() {
    if(light == 0) {
      System.out.println("Bedroom lights turned on");
      light = 1;
    }
    else if(light == 1) {
      System.out.println("Bedroom lights turned off");
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
}
