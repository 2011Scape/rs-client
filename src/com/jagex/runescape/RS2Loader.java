package com.jagex.runescape;

import com.jagex.runescape.misc.Constants;

import javax.swing.*;
import java.applet.Applet;
import java.awt.*;
import java.net.URL;
import java.util.Properties;

public class RS2Loader extends Applet {
	private static final long serialVersionUID = 1L;
	public static Properties properties = new Properties();
	public JFrame appletFrame;
	public JPanel appletPanel = new JPanel();

	public static void main(String[] strings) {
		RS2Loader loader = new RS2Loader();
		loader.doFrame();
	}

	public void init() {
		loadApplet();
	}

	void loadApplet() {
		setParms();
		drawClient();
	}

	public void doFrame() {
		setParms();
		openFrame();
		drawClient();
	}

	void setParms() {
		properties.put("cabbase", "g.cab");
		properties.put("java_arguments", "-Xmx102m -Dsun.java2d.noddraw=true");
		properties.put("colourid", "0");
		properties.put("worldid", "16");
		properties.put("lobbyid", "15");
		properties.put("lobbyaddress", Constants.LOAD_RUNESCAPE ? "lobby7.runescape.com" : "127.0.0.1");
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
		properties.put("cookiehost", "127.0.0.1");
		properties.put("cachesubdirid", "0");
		properties.put("crashurl", "");
		properties.put("unsignedurl", "");
		properties.put("sitesettings_member", "1");
		properties.put("frombilling", "false");
		properties.put("sskey", "");
		properties.put("force64mb", "false");
		properties.put("worldflags", "8");
	}

	void openFrame() {
		appletFrame = new JFrame("Jagex");
		appletFrame.setLayout(new BorderLayout());
		appletPanel.setLayout(new BorderLayout());
		appletPanel.add(this);
		if(Constants.LARGER_APPLET_SIZE) {
			appletPanel.setPreferredSize(new Dimension(1383, 795));
		} else {
			appletPanel.setPreferredSize(new Dimension(765, 503));
		}
		appletFrame.getContentPane().add(appletPanel, "Center");
		appletFrame.pack();
		appletFrame.setVisible(true);
		appletFrame.setLocationRelativeTo(null);
		appletFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}

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

	public String getParameter(String string) {
		return (String) properties.get(string);
	}

	public URL getDocumentBase() {
		return getCodeBase();
	}

	public URL getCodeBase() {
		try {
			if (Constants.LOAD_RUNESCAPE) {
				return new URL("http://world157.runescape.com/");
			}
			return new URL("http://127.0.0.1");
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
