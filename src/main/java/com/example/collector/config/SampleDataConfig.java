package com.example.collector.config;

import com.example.collector.models.DataUsage;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

@Component
public class SampleDataConfig {

    @Bean("sampleDataUsage")
    public List<DataUsage> initDataUsage() {
        List<DataUsage> dataUsageList = new ArrayList<>();
        float value = 2;
        for (int i = 0; i < 365; i++) {
            dataUsageList.add(DataUsage.builder()
                            .usage(value)
                            .usageDateTime(OffsetDateTime.now().minusDays(i))
                    .build());
            value = (value + 1) % 37;
        }
        return dataUsageList;
    }

}
