package Rooms;

public class Living_Room {

	private static int light = 0;
	private static int tvChannel = 6;
	private static int tvPower = 0;

	private Living_Room() {
		throw new IllegalStateException("Utility Class");
	}
	// Turns lights On/Off
	public static void lightsOn() {
		if (light == 0) {
			System.out.println("Living Room lights turned on");
			light = 1;
		} else {
			System.out.println("Lights are already on");
		}
	}
	public static void lightsOff() {
		if (light == 1) {
			System.out.println("Living Room lights turned off");
			light = 0;
		} else {
			System.out.println("Lights are already off");
		}
	}
	// Returns Status of lights (On/Off)
	public static String lightsStatus() {
		String status = "";
		if (light == 0) {
			status = "off";
		} else if (light == 1) {
			status = "on";
		}
		return status;
	}
	// Turns TV Power On/Off
	public static void tvPowerOn() {
		if (tvPower == 0) {
			tvPower = 1;
			System.out.println("TV Turned on");
		}
		else {
			System.out.println("TV is already on");
		}
	}
	public static void tvPowerOff() {
		if (tvPower == 1) {
			tvPower = 0;
			System.out.println("TV Turned off");
		}
		else {
			System.out.println("TV is already off");
		}
	}
	// Returns Status of TV (On/Off)
	public static String tvStatus() {
		String status = "";
		if (tvPower == 0) {
			status = "off";
		} else if (tvPower == 1) {
			status = "on";
		}
		return status;
	}
	// TV Channels
	public static String channel(int tvInput) {
		if (tvPower == 1) {
			switch (tvInput) {
			case 1:
				tvChannel = tvInput;
				return "Sports";
			case 2:
				tvChannel = tvInput;
				return "Movies";
			case 3:
				tvChannel = tvInput;
				return "Soap Operas";
			case 4:
				tvChannel = tvInput;
				return "Cartoons";
			case 5:
				tvChannel = tvInput;
				return "Cooking";
			case 6:
				tvChannel = tvInput;
				return "TV Guide";
			default:
				tvChannel = tvInput;
				return "NO RECEPTION";
			}
		} else {
			return ("off");
		}
	}
	// Watching TV
	public static String channelView() {
		if (tvPower == 1) {
			if (tvChannel == 1) {
				return "The dude is running with the thing and\n"
						+ "scores a point, the crowd goes wild";
			} else if (tvChannel == 2) {
				return "Your favorite movie is playing, the actor\n"
						+ "on screen looks you dead in the eyes\n"
						+ "and says \"This is a simulation\"";
			} else if (tvChannel == 3) {
				return "All My Children is playing because that's\n"
						+ "the only soap opera I know";
			} else if (tvChannel == 4) {
				return "There are colors and lines on screen, but you\n"
						+ "can't make out exactly what is going on";
			} else if (tvChannel == 5) {
				return "Alton Brown is beating a live cow to death with\n"
						+ "his bare hands. He says this is the easy part,\n"
						+ "just wait until we have to add the eggs";
			} else if (tvChannel == 6) {
				return "Channel 1: Sports\n" + "Channel 2: Movies\n"
						+ "Channel 3: Soap Operas\n" + "Channel 4: Cartoons\n"
						+ "Channel 5: Cooking\n" + "Channel 6: TV Guide";
			} else {
				return "Static";
			}
		}
		else {
			return "TV is off";
		}
	}
}
