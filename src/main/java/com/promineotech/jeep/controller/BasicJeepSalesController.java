/**
 * 
 */
package com.promineotech.jeep.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.promineotech.jeep.entity.Jeep;
import com.promineotech.jeep.entity.JeepModel;
import com.promineotech.jeep.service.JeepSalesService;
import lombok.extern.slf4j.Slf4j;

/**
 * @author USER
 *
 */
@RestController
@Slf4j
public class BasicJeepSalesController implements JeepSalesController {
  
  @Autowired
  private JeepSalesService jeepSalesService;

  public List<Jeep> fetchJeeps(String model, String trim) {
    log.info("model={}, trim={}", model, trim);
    return jeepSalesService.fetchJeeps(model, trim);
  }

  public List<Jeep> fetchJeeps(JeepModel model, String trim) {
    // TODO Auto-generated method stub
    return null;
  }

//  public List<Jeep> fetchJeeps(JeepModel model, String trim) {
//    // TODO Auto-generated method stub
//    return null;
//  }
//
}
