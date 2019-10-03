package Rooms;

public class Bedroom {
	public static int light = 0;

	private Bedroom() {
		throw new IllegalStateException("Utility Class");
	}

	public static void lights() {
		if (light == 0) {
			System.out.println("Bedroom lights turned on");
			light = 1;
		} else if (light == 1) {
			System.out.println("Bedroom lights turned off");
			light = 0;
		}
	}

	public static String lightsStatus() {
		String status = "";
		if (light == 0) {
			status = "off";
		} else if (light == 1) {
			status = "on";
		}
		return status;
	}
}
