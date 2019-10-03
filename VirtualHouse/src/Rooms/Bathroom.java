package Rooms;

public class Bathroom {
	private static int light = 0;

	private Bathroom() {
		throw new IllegalStateException("Utility Class");
	}

	public static void lights() {
		if (light == 0) {
			System.out.println("Bathroom lights turned on");
			light = 1;
		} else if (light == 1) {
			System.out.println("Bathroom lights turned off");
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
