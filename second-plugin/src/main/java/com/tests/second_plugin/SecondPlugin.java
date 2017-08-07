package com.tests.second_plugin;

import com.tests.plugin.sdk.IAnalyzer;
import com.tests.plugin.sdk.IPlugin;
import com.tests.plugin.sdk.IReporter;

public class SecondPlugin implements IPlugin{

    public String getPluginName() {
        return "second-plugin";
    }

    public long getVersion() {
        return 1;
    }

    public String getCustomerIdentifier() {
        return "second";
    }

    public void init() {
        throw new RuntimeException("Error form Second plugin!!");
        // do some init here
    }

    public void shutdown() {
        // do some shutdown here
    }

    public IAnalyzer getAnalyzer() {
        return null;
    }

    public IReporter getReporter() {
        return null;
    }
}
