/**
 * 
 */
package com.promineotech.jeep.controller.support;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;

/**
 * @author USER
 *
 */

public class BaseTest {
  @LocalServerPort
  public int serverPort;
  
  
  @Autowired
  public
//  @Getter
 TestRestTemplate restTemplate;
  
  protected String getBaseUri() {
    return String.format("http://localhost:%d/jeeps", serverPort);
  }

}
