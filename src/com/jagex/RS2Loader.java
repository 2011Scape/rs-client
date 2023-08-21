package com.jagex;

import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.math.BigInteger;
import java.net.URL;
import java.util.Properties;

import javax.swing.*;

/**
 * RS2Loader class extends Applet to handle the loading properties, managing cryptographic elements,
 * and handling UI components related to the applet's functionality.
 */
public class RS2Loader extends Applet {

	private static final long serialVersionUID = 1L;

	/**
	 * Properties object containing various settings and configurations.
	 */
	public static Properties properties = new Properties();

	/**
	 * BigInteger representing cryptographic modulus.
	 */
	static BigInteger js5Modulus = new BigInteger("d6808be939bbfd2ec4e96b1581ce3e1144b526e7643a72e3c64fbb902724fbfcf14ab601da6d6f8dbb57d1c369d080d9fc392abeb7886e0076d07f2aea5810e540d2817fd1967e35b39cc95cf7c9170b5fb55f5bf95524b60e938f0d64614bc365b87d66963a8cc8664e32875366099ef297180d01c7c3842162865e11d92299", 16);

	/**
	 * BigInteger representing cryptographic modulus.
	 */
	static BigInteger loginModulus = new BigInteger("a1129cdb79665ed39b10d09e8dcfbc373f7e0b8097b98b1ddc4762149734ce8ea6ce59f3b9d76b1bbe10ad30ff67f87232477d7d98cacff3bd0c309e49000452947bb04d5122fd5cb113ce197393b28ef8d27841e0f3584baf9cb3848ba3be11826457c73545953ee00b3dbcd456774392055ac1382b6e4e49e6aa2bf026a28d165e4a59e907e229c5e372f3e486d2044c030f6efcdaa9d5893ab0609ecd41d56aca5af36845158031ed98a1bcb68bea4f7eaf823e00402fc05571dc1c83d9417f0489ec0f986761a793ad2bc493281b917d572400588a4634503e20ba6518c7b9367d959ef7fa6249a11f032d1707ed84bf2cda0ca8960e97295234d65cc2e1", 16);

	/**
	 * JFrame representing the main applet frame.
	 */
	public JFrame appletFrame;

	/**
	 * JPanel containing the applet's main panel.
	 */
	public JPanel appletPanel = new JPanel();

	/**
	 * Boolean flag for various configurations.
	 */
	public static boolean loadRunescape = false;

	/**
	 * Boolean flag for various configurations.
	 */
	public static boolean ENABLE_LOBBY = false;

	/**
	 * Boolean flag for various configurations.
	 */
	public static boolean ENABLE_LARGE_FRAME = true;

	/**
	 * String representing the IP address for connection.
	 */
	public static String IP = "127.0.0.1";

	/**
	 * Main method to initialize and run the applet.
	 *
	 * @param strings Command-line arguments.
	 */
	public static void main(String[] strings) {
		RS2Loader loader = new RS2Loader();
		loader.doFrame();
	}

	/**
	 * Initialization method to load the applet.
	 */
	public void init() {
		loadApplet();
	}

	/**
	 * Load applet with required parameters and client drawing.
	 */
	void loadApplet() {
		setParms();
		drawClient();
	}

	/**
	 * Frame handling method for the applet.
	 */
	public void doFrame() {
		setParms();
		openFrame();
		drawClient();
	}

	/**
	 * Set the required parameters for the applet.
	 */
	void setParms() {
		properties.put("cabbase", "g.cab");
		properties.put("java_arguments", "-Xmx102m -Dsun.java2d.noddraw=true");
		properties.put("colourid", "0");
		properties.put("worldid", "16");
		properties.put("lobbyid", "15");
		properties.put("lobbyaddress", loadRunescape ? "lobby7.runescape.com" : RS2Loader.IP);
		properties.put("demoid", "0");
		properties.put("demoaddress", "");
		properties.put("modewhere", "1");
		properties.put("modewhat", "0");
		properties.put("lang", "0");
		properties.put("objecttag", "0");
		properties.put("js", "1");
		properties.put("game", "0");
		properties.put("affid", "0");
		properties.put("advert", "1");
		properties.put("settings", "wwGlrZHF5gJcZl7tf7KSRh0MZLhiU0gI0xDX6DwZ-Qk");
		properties.put("country", "0");
		properties.put("haveie6", "0");
		properties.put("havefirefox", "1");
		properties.put("cookieprefix", "");
		properties.put("cookiehost", RS2Loader.IP);
		properties.put("cachesubdirid", "0");
		properties.put("crashurl", "");
		properties.put("unsignedurl", "");
		properties.put("sitesettings_member", "1");
		properties.put("frombilling", "false");
		properties.put("sskey", "");
		properties.put("force64mb", "false");
		properties.put("worldflags", "8");
	}

	/**
	 * Open the applet frame with specified configurations.
	 */
	void openFrame() {
		appletFrame = new JFrame("2011Scape");
		appletFrame.setLayout(new BorderLayout());
		appletPanel.setLayout(new BorderLayout());
		appletPanel.add(this);
		if (ENABLE_LARGE_FRAME) {
			appletPanel.setPreferredSize(new Dimension(1450, 795));
		} else {
			appletPanel.setPreferredSize(new Dimension(765, 503));
		}
		appletFrame.getContentPane().add(appletPanel, "Center");
		appletFrame.pack();
		appletFrame.setVisible(true);
		appletFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		appletFrame.setLocationRelativeTo(null);
	}

	/**
	 * Draw the client within the applet.
	 */
	void drawClient() {
		try {
			GameStub.provideLoaderApplet(this);
			client clnt = new client();
			clnt.init();
			clnt.start();
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}

	/**
	 * Retrieve a parameter value by its key.
	 *
	 * @param string The key for the desired parameter.
	 * @return The value of the parameter.
	 */
	public String getParameter(String string) {
		return (String) properties.get(string);
	}

	/**
	 * Retrieve the document base URL.
	 *
	 * @return The URL of the code base.
	 */
	public URL getDocumentBase() {
		return getCodeBase();
	}

	/**
	 * Retrieve the document base URL.
	 *
	 * @return The URL of the code base.
	 */
	public URL getCodeBase() {
		try {
			if (loadRunescape) {
				return new URL("http://world157.runescape.com/");
			}
			return new URL("http://" + RS2Loader.IP);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
