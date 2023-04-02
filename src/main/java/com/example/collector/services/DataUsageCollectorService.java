package com.example.collector.services;

import com.example.collector.models.DataUsage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

// todo: need to create a repository/client to fetch these details from a DB or a different service
@Service
public class DataUsageCollectorService implements IUsageCollector {

    @Autowired
    @Qualifier("sampleDataUsage")
    private List<DataUsage> dataUsageList;

    public List<DataUsage> getLastWeek() {
        // todo: complete code
        return null;
    }

    public List<DataUsage> getLastMonth() {
        // todo: complete code
        return null;
    }

    public List<DataUsage> getLastSixMonth() {
        // todo: complete code
        return null;
    }

}
