package com.aravind.covidtracker.controllers;

import com.aravind.covidtracker.models.LocationStats;
import com.aravind.covidtracker.services.CovidDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    CovidDataService dataService;

    @GetMapping("/")
    public String home(Model model){
        List<LocationStats> allStats = dataService.getAllStats();
        long totalReportedCases = allStats.stream().mapToLong(stat -> stat.getLatestTotalCases()).sum();
        long totalNewCases = allStats.stream().mapToLong(stat -> stat.getDiffFromPreviousDay()).sum();
        model.addAttribute("locationStats",allStats);
        model.addAttribute("totalReportedCases",totalReportedCases);
        model.addAttribute("totalNewCases",totalNewCases);
        return "home";
    }
}
