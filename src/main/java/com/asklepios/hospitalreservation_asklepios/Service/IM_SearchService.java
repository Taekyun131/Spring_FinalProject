package com.asklepios.hospitalreservation_asklepios.Service;

import com.asklepios.hospitalreservation_asklepios.VO.HospitalVO;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class IM_SearchService implements IF_SearchService{
    @Override
    public List<HospitalVO> searchHospital(String name) {

        return List.of();
    }
}
