/*
 * Copyright (c) 2017-2020, Wasiq Bhamla.
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
package com.github.wasiqb.coteafs.appium.ios.vodqa.activities;

import com.github.wasiqb.coteafs.appium.device.DeviceElement;
import com.github.wasiqb.coteafs.appium.ios.IOSDevice;
import io.appium.java_client.MobileBy;

/**
 * @author wasiqb
 * @since Oct 28, 2018
 */
public class SliderActivity extends BaseActivity {
    /**
     * @param device
     * @author wasiqb
     * @since Oct 28, 2018
     */
    public SliderActivity(final IOSDevice device) {
        super(device);
    }

    @Override
    protected DeviceElement prepare() {
        final DeviceElement main = super.prepare();

        DeviceElement.create("Slider")
            .parent(main)
            .forIos(MobileBy.AccessibilityId("slider"));
        DeviceElement.create("Slider1")
            .parent(main)
            .forIos(MobileBy.AccessibilityId("slider1"));

        return main;
    }
}