package com.microsoft.appcenter.sasquatch.activities;

import com.microsoft.appcenter.analytics.Analytics;

import java.util.Map;

public class EventActivity extends LogActivity {

    @Override
    protected void trackLog(String name, Map<String, String> properties) {
        String target = getTransmissionTarget();
        if (target == null) {
            Analytics.trackEvent(name, properties);
        } else {
            Analytics.getTransmissionTarget(target).trackEvent(name, properties);
        }
    }
}
