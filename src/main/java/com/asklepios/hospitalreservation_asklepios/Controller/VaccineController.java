//package com.asklepios.hospitalreservation_asklepios.Controller;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//
//import java.util.List;
//
//
//@Controller
//public class VaccineController {
//
//    @GetMapping()
//    public String showVaccines(Model model) {
//        // 백신 Model 객체에 추가
//        List<String> vaccines = List.of(
//    "결핵(BCG, 피내용)", "B형간염(HepB)", "디프테리아/파상풍/백일해(DTaP)",
//                "파상풍/디프테리아(Td)", "파상풍/디프테리아/백일해(Tdap)", "폴리오(IPV)",
//                "홍역/유행성이하선염/풍진(MMR)", "일본뇌염(불활성화 백신, 사백신)",
//                "일본뇌염(약독화 생백신, 생백신)", "인플루엔자(Flu)", "B형헤모필루스인플루엔자(Hib)",
//                "디프테리아/파상풍/백일해/폴리오(DTaP-IPV)", "디프테리아/파상풍/백일해/폴리오/Hib(DTaP-IPV/Hib)",
//                "수두(VAR)", "A형간염(HepA)", "폐렴구균(PCV 13가)", "폐렴구균(PCV 10가)",
//                "사람유두바이러스(HPV, 가다실) - 자궁경부암", "로타바이러스(로타릭스)", "로타바이러스(로타)"
//        );
//        model.addAttribute("vaccines", vaccines);
//        return "vaccines";
//    }
//}
