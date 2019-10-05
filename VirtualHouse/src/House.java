import java.util.Scanner;
import Rooms.Living_Room;
import Rooms.Kitchen;
import Rooms.Bedroom;
import Rooms.Bathroom;

class House {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		boolean running = true;

		System.out
				.println("Welcome to your virtual home, which room would you like to visit?\n");
		System.out
				.println("Living Room\n"
						+ "Kitchen\n"
						+ "Bedroom\n"
						+ "Bathroom\n"
						+ "\n"
						+ "(Type \"exit\" to leave house, type \"rooms\" to view rooms)");

		while (running) {
			String room = "";
			String action = "";

			room = input.nextLine();

			if (room.equals("rooms")) {
				System.out.println("Living Room\n" 
								+ "Kitchen\n" 
								+ "Bedroom\n"
								+ "Bathroom\n" + "\n"
								+ "(Type \"exit\" to leave house)");
			}

			switch (room.toLowerCase()) {
			// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~Living_Room~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
			case "living room":
				// Room and Current Status
				System.out.printf(
						"You enter the living room, the lights are %s%n",
						Living_Room.lightsStatus());
				while (room.equalsIgnoreCase("living room")) {

					action = input.nextLine();
					//Look around
					if (action.equalsIgnoreCase("look")
							|| action.equalsIgnoreCase("look around")) {
						System.out.println("A light switch is to your left, "
								+ "and a TV is in front of the couch");
					}
					// Lights
					if (action.equalsIgnoreCase("turn on lights")
							|| action.equalsIgnoreCase("turn lights on")) {
						Living_Room.lightsOn();
					}
					if (action.equalsIgnoreCase("turn off lights")
							|| action.equalsIgnoreCase("turn lights off")) {
						Living_Room.lightsOff();
					}
					// TV Power
					if (action.equalsIgnoreCase("turn on tv")
							|| action.equalsIgnoreCase("turn tv on")) {
						Living_Room.tvPowerOn();
						System.out.printf("%s is playing%n", Living_Room.channel(6)) ;
					}
					if (action.equalsIgnoreCase("turn off tv")
							|| action.equalsIgnoreCase("turn tv off")) {
						Living_Room.tvPowerOff();
					}
					//TV Control
					if (action.equalsIgnoreCase("change channel")) {
						System.out.println("Choose a channel (1-6):");
						int channel = input.nextInt();
						System.out.printf("You changed the channel to %s%n", Living_Room.channel(channel));
					}
					//Watch TV
					if (action.equalsIgnoreCase("watch tv")) {
						System.out.println(Living_Room.channelView());
					}

					// Leave Room
					if (action.equalsIgnoreCase("leave")
							|| action.equalsIgnoreCase("exit")
							|| action.equalsIgnoreCase("leave living room")
							|| action.equalsIgnoreCase("exit living room")) {
						System.out.println("You leave the living room...");
						room = "";
					}
				}
				break;
			// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~Living_Room~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
			// -------------------------------------------------------------------------------------------------
			// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~Kitchen~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
			case "kitchen":
				// Room and Current Status
				System.out.printf("You enter the kitchen, the lights are %s%n",
						Kitchen.lightsStatus());
				while (room.equalsIgnoreCase("kitchen")) {
					action = input.nextLine();
					// Lights
					if (action.equalsIgnoreCase("turn on lights")
							|| action.equalsIgnoreCase("turn lights on")) {
						Kitchen.lights();
					}
					if (action.equalsIgnoreCase("turn off lights")
							|| action.equalsIgnoreCase("turn lights off")) {
						Kitchen.lights();
					}
					// *SOME ACTION*

					// Leave Room
					if (action.equalsIgnoreCase("leave")
							|| action.equalsIgnoreCase("exit")
							|| action.equalsIgnoreCase("leave kitchen")
							|| action.equalsIgnoreCase("exit kitchen")) {
						System.out.println("You leave the kitchen...");
						room = "";
					}
				}
				break;
			// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~Kitchen~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
			// -------------------------------------------------------------------------------------------------
			// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~Bedroom~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
			case "bedroom":
				// Room and Current Status
				System.out.printf("You enter the bedroom, the lights are %s%n",
						Bedroom.lightsStatus());
				while (room.equalsIgnoreCase("bedroom")) {
					action = input.nextLine();
					// Lights
					if (action.equalsIgnoreCase("turn on lights")
							|| action.equalsIgnoreCase("turn lights on")) {
						Bedroom.lights();
					}
					if (action.equalsIgnoreCase("turn off lights")
							|| action.equalsIgnoreCase("turn lights off")) {
						Bedroom.lights();
					}
					// *SOME ACTION*

					// Leave Room
					if (action.equalsIgnoreCase("leave")
							|| action.equalsIgnoreCase("exit")
							|| action.equalsIgnoreCase("leave bedroom")
							|| action.equalsIgnoreCase("exit bedroom")) {
						System.out.println("You leave the bedroom...");
						room = "";
					}
				}
				break;
			// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~Bedroom~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
			// -------------------------------------------------------------------------------------------------
			// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~Bathroom~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
			case "bathroom":
				// Room and Current Status
				System.out.printf(
						"You enter the bathroom, the lights are %s%n", Bathroom.lightsStatus());
				while (room.equalsIgnoreCase("bathroom")) {
					action = input.nextLine();
					// Lights
					if (action.equalsIgnoreCase("turn on lights")
							|| action.equalsIgnoreCase("turn lights on")) {
						Bathroom.lights();
					}
					if (action.equalsIgnoreCase("turn off lights")
							|| action.equalsIgnoreCase("turn lights off")) {
						Bathroom.lights();
					}
					// *SOME ACTION*

					// Leave Room
					if (action.equalsIgnoreCase("leave")
							|| action.equalsIgnoreCase("exit")
							|| action.equalsIgnoreCase("leave bathroom")
							|| action.equalsIgnoreCase("exit bathroom")) {
						System.out.println("You leave the bathroom...");
						room = "";
					}
				}
				break;
			// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~Bathroom~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
			// -------------------------------------------------------------------------------------------------
			// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~Exit~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
			case "exit":
				if (Living_Room.lightsStatus().equals("on")
						|| Kitchen.lightsStatus().equals("on")
						|| Bedroom.lightsStatus().equals("on")
						|| Bathroom.lightsStatus().equals("on")
						|| Living_Room.tvStatus().equals("on")) {
					System.out.println("Make sure everything is off...");
				} else {
					System.out.println("Leaving Virtual House...");
					running = false;
				}
				break;
			// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~Exit~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
			default:
				break;
			}

		}
		input.close();
	}
}