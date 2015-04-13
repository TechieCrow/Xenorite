package gcm.xenorite.handler;

import gcm.xenorite.reference.Reference;
import gcm.xenorite.utility.LogHelper;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class UpdateHandler {

	// I have a variable that is my current version of my mod, which is
	// "1.7.10 R1"
	private static String currentVersion = Reference.VERSION;
	// This will be set later once we connect to internet and get the latest
	// version
	private static String newestVersion;
	// This is just a placeholder for the message that will be sent to the
	// player
	public static String updateStatus = "NULL";
	// I only out of date message to display once per session, not every time
	// the player logs in and out.
	public static boolean show = false;

	public static void init() {
		// Our method for getting the newest version
		getNewestVersion();

		// So if we do connect, cause by default newestVersion is not set, we
		// will compare the strings
		if (newestVersion != null) {
			// Compare new version with running version
			if (newestVersion.equalsIgnoreCase(currentVersion)) {
				updateStatus = "§b[Xenorite] is up to date!";
				// Part of my log helper.
				LogHelper.info("[Xenorite] is up to date!");
			} else {
				show = true;
				updateStatus = "§b[Xenorite] Current Version: " + currentVersion + " §bNewest Version: " + newestVersion;
				LogHelper.info("[Xenorite] out of date! Your Version: " + currentVersion + " Latest Version: " + newestVersion);
			}
		} else {
			show = true;
			updateStatus = "§b[Xenorite] Failed to connect to update server!";
			LogHelper.info("[Xenorite] Failed to connect to update server!");
		}
	}

	private static void getNewestVersion() {
		// We use a try/catch incase something goes wrong AKA server is down, or
		// no internet connection
		try {
			URL url = new URL("http://techiecrow.ddns.net/minecraft/mods/xenorite/version.txt");
			Scanner s = new Scanner(url.openStream());
			// The way I did this, well I have a space in my version so that why
			// I add a space in and get the next
			newestVersion = s.next();
			newestVersion = newestVersion + " " + s.next();
			// Close your connection!
			s.close();
		} catch (IOException ex) {
			ex.printStackTrace();
			// Part of my log helper!
			LogHelper
					.info("Could not connect to determine if mod was up to date!");
		}
	}
}