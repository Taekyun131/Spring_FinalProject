package com.asklepios.hospitalreservation_asklepios.Controller;

import com.asklepios.hospitalreservation_asklepios.Service.IF_UserService;
import com.asklepios.hospitalreservation_asklepios.Service.IM_UserService;
import com.asklepios.hospitalreservation_asklepios.VO.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class JoinController {

    @Autowired
    IF_UserService userService;

    @GetMapping("/agreement")
    public String agreement() {
        return "userJoin/insertCommonInfo";
    }

    @PostMapping("/commoninfo")
    public String commoninfo(@ModelAttribute UserVO userVO) {
        System.out.println(userVO.toString());
        userService.addUserCommonInfo(userVO);
        return "userJoin/insertAdditionalInfo";
    }

}
