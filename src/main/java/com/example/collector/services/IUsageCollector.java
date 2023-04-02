package com.example.collector.services;

import com.example.collector.models.DataUsage;

import java.util.List;

public interface IUsageCollector {

    List<DataUsage> getLastWeek();

    List<DataUsage> getLastMonth();

    List<DataUsage> getLastSixMonth();

}
