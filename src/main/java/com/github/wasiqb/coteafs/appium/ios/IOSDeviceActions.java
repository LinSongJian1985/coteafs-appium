package com.github.wasiqb.coteafs.appium.ios;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.github.wasiqb.coteafs.appium.device.DeviceActions;

import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;

/**
 * @author wasiq.bhamla
 * @since 26-Apr-2017 11:34:39 PM
 */
public class IOSDeviceActions extends DeviceActions <IOSDriver <MobileElement>> {
	private static final Logger log;

	static {
		log = LogManager.getLogger (IOSDeviceActions.class);
	}

	/**
	 * @author wasiq.bhamla
	 * @since 26-Apr-2017 11:34:58 PM
	 * @param driver
	 */
	public IOSDeviceActions (final IOSDriver <MobileElement> driver) {
		super (driver);
	}

	/**
	 * @author wasiq.bhamla
	 * @since 08-May-2017 3:21:20 PM
	 * @param strategy
	 * @param keyName
	 */
	public void hideKeyboard (final String strategy, final String keyName) {
		final String msg = "Hiding keyboard on device using %s strategy for key %s...";
		log.info (String.format (msg, strategy, keyName));
		this.driver.hideKeyboard (strategy, keyName);
	}

	/**
	 * @author wasiq.bhamla
	 * @since 26-Apr-2017 11:37:04 PM
	 */
	public void shake () {
		log.info ("Shaking the device...");
		this.driver.shake ();
	}
}