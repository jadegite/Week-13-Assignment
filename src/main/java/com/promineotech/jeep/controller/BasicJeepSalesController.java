/**
 * 
 */
package com.promineotech.jeep.controller;

import java.util.List;
import org.springframework.web.bind.annotation.RestController;
import com.promineotech.jeep.entity.Jeep;
import com.promineotech.jeep.entity.JeepModel;

/**
 * @author USER
 *
 */
@RestController
public class BasicJeepSalesController implements JeepSalesController {

  public List<Jeep> fetchJeeps(String model, String trim) {
    return null;
  }

  public List<Jeep> fetchJeeps(JeepModel model, String trim) {
    // TODO Auto-generated method stub
    return null;
  }

}
