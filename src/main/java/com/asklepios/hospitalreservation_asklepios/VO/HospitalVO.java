package com.asklepios.hospitalreservation_asklepios.VO;

import lombok.Data;

@Data
public class HospitalVO {
    private String hospital_name;
    private String hospital_intro;
    private String hospital_notice;
    private String hospital_time;
    private Integer hospital_date;
    private String hospital_address;
    private String hospital_tel;
}
