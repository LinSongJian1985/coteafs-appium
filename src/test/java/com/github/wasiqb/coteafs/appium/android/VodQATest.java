/**
 * Copyright (c) 2017, Wasiq Bhamla.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.wasiqb.coteafs.appium.android;

import org.testng.annotations.Test;

import com.github.wasiqb.coteafs.appium.android.vodqa.actions.LoginActivityAction;
import com.github.wasiqb.coteafs.appium.android.vodqa.activities.MainActivity;

/**
 * @author wasiq.bhamla
 * @since Jan 23, 2018 8:14:51 PM
 */
public class VodQATest extends DefaultTest {
	/**
	 * @author wasiq.bhamla
	 * @since Jan 23, 2018 8:16:56 PM
	 */
	@Test
	public void testLogin () {
		final LoginActivityAction login = new LoginActivityAction (this.androidDevice);
		login.addInputValue ("UserName", "admin")
			.addInputValue ("Password", "admin")
			.perform ();
	}

	/**
	 * @author wasiq.bhamla
	 * @since Jan 23, 2018 9:39:20 PM
	 */
	@Test
	public void testNativeView () {
		final MainActivity main = new MainActivity (this.androidDevice);
		main.onElement ("Back")
			.tap ();
	}
}