package service;

import com.google.inject.Singleton;
import controllers.dto.DemoDto;
import controllers.dto.DemoDtoResponse;

@Singleton

public class DemoServiceImpl implements DemoService{

    @Override
    public DemoDtoResponse displayName(DemoDto dto) {

        String name = dto.getName();
        String age = dto.getAge();

        //hit db and get data

        String rollNum = "10";
        String fullName = "Sonu kumar";
        String address  = " Bangalore";

        DemoDtoResponse demoDtoResponse = DemoDtoResponse.builder()
                .rollNo(rollNum)
                .address(address)
                .fullName(fullName)
                .build();

        return demoDtoResponse;

    }
}
