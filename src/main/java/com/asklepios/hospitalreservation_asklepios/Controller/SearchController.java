package com.asklepios.hospitalreservation_asklepios.Controller;

import com.asklepios.hospitalreservation_asklepios.Service.IF_SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SearchController {
    @Autowired
    IF_SearchService searchService;
    @GetMapping("/search")
    public String search(@RequestParam("keyword") String keyword) {
//        System.out.println(keyword);
        searchService.searchHospital(keyword);
        return "search/searchmain";
    }

}
