package com.example.collector.controllers;

import com.example.collector.models.DataUsage;
import com.example.collector.services.DataUsageCollectorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/dataUsage")
public class DataUsageCollectorController {

    @Autowired
    private DataUsageCollectorService dataUsageCollectorService;

    @GetMapping("/week")
    public List<DataUsage> getForLastWeek() {
        return dataUsageCollectorService.getLastWeek();
    }

    @GetMapping("/month")
    public List<DataUsage> getForLastMonth() {
        return dataUsageCollectorService.getLastMonth();
    }

    @GetMapping("/month")
    public List<DataUsage> getForLastSixMonth() {
        return dataUsageCollectorService.getLastSixMonth();
    }

}
