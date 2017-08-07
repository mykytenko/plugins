package com.tests.first_plugin;

import com.tests.plugin.sdk.IReporter;
import com.tests.plugin.sdk.objects.InternalData;
import com.tests.plugin.sdk.objects.ReportData;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FirstReporter implements IReporter {
    public ReportData getReportingData(InternalData internalData) {

        String data = new String(internalData.getBytes());

        String reportData = Stream.of(data.split(","))
                .map(d -> d + "-first-plugin-reported")
                .collect(Collectors.joining("!  "));

        ReportData report = new ReportData();
        report.setBytes(reportData.getBytes());
        return  report;
    }
}
