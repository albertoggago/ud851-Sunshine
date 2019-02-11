/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.sunshine.utilities;

import android.os.Build;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.net.URL;

import static org.junit.Assert.assertTrue;

@RunWith(AndroidJUnit4.class)
public class TestNetworkUtils {

    @Test
    public void testBuildURLDublin() {
        String city = "Dublin";
        URL url = NetworkUtils.buildUrl(city);
        Assert.assertTrue(url.toString().contains(city));
        Assert.assertTrue(url.toString().contains(NetworkUtils.APIKEY));
        Assert.assertTrue(url.toString().contains(NetworkUtils.FORECAST_BASE_URL));


    }

}