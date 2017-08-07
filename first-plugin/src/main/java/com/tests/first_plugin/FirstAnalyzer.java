package com.tests.first_plugin;

import com.tests.plugin.sdk.IAnalyzer;
import com.tests.plugin.sdk.objects.InputData;
import com.tests.plugin.sdk.objects.InternalData;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FirstAnalyzer implements IAnalyzer {
    public InternalData analyzeInputData(InputData inputData) {


        String data = new String(inputData.getBytes());
        String analyzedData = Stream.of(data.split(","))
                .map(d -> d + "-first-plugin-analyzed")
                .collect(Collectors.joining(","));

        InternalData internalData = new InternalData();
        internalData.setBytes(analyzedData.getBytes());
        return  internalData;
    }
}
