package com.asklepios.hospitalreservation_asklepios.Controller;

import com.asklepios.hospitalreservation_asklepios.Service.IF_SearchService;
import com.asklepios.hospitalreservation_asklepios.VO.HospitalVO;
import com.asklepios.hospitalreservation_asklepios.VO.Hospital_doctorVO;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;
import java.util.Map;

@RestController

public class SearchController {
    @Autowired
    IF_SearchService searchService;
    @GetMapping("/search")
    public ModelAndView search(@RequestParam("keyword") String keyword,
                         Model model) {
//        System.out.println(keyword);
//        List<HospitalVO> hlist =searchService.searchHospital(keyword);
        List<Hospital_doctorVO> hlist=searchService.searchInfo(keyword);
//        System.out.println(hlist.size());
//        System.out.println(hlist.toString());
        model.addAttribute("hlist", hlist);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("search/searchmain");
        return modelAndView;
//        return "search/searchmain";
    }
    @PostMapping("/filter")
    public List<Hospital_doctorVO> filterDate(@RequestParam Map<String, Object> hospitalList,
                                       @RequestParam("type")String type) throws JsonProcessingException {
            String data = hospitalList.get("hospitalList").toString();
        ObjectMapper mapper = new ObjectMapper();
        List<Hospital_doctorVO> modHospitalList = mapper.readValue(data, new TypeReference<List<Hospital_doctorVO>>() {
        });
//        for(HospitalVO hospitalVO:modHospitalList){
//            System.out.println(hospitalVO.toString());
//        }

        if(type.equals("date")){
            List<Hospital_doctorVO> filteredDate = searchService.filterDate(modHospitalList);
            return filteredDate;
        }else if(type.equals("ing")){
            List<Hospital_doctorVO> filteredDate = searchService.filterIng(modHospitalList);
        }
        return modHospitalList;
    }

}
