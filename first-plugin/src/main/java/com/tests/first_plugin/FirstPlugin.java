package com.tests.first_plugin;

import com.tests.plugin.sdk.IAnalyzer;
import com.tests.plugin.sdk.IPlugin;
import com.tests.plugin.sdk.IReporter;

public class FirstPlugin implements IPlugin {

    public String getPluginName() {
        return "first-plugin";
    }

    public long getVersion() {
        return 1;
    }

    public String getCustomerIdentifier() {
        return "first";
    }

    public void init() {
        // do some init here
    }

    public void shutdown() {
        // do some shutdown here
    }

    public IAnalyzer getAnalyzer() {
        return new FirstAnalyzer();
    }

    public IReporter getReporter() {
        return new FirstReporter();
    }
}
