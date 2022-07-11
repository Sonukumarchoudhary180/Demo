package service;

import com.google.inject.ImplementedBy;
import controllers.dto.DemoDto;
import controllers.dto.DemoDtoResponse;

@ImplementedBy(DemoServiceImpl.class)
public interface DemoService {


    DemoDtoResponse displayName(DemoDto dto);
}
