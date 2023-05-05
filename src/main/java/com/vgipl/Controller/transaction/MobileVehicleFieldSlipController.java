/**
 * 
 */
package com.vgipl.Controller.transaction;

import java.sql.SQLException;

import org.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vgipl.Service.Transaction.MobileVehicleFieldSlipService;

/**
 * @author Pratiksha.hatekar
 *
 */

@RestController
@RequestMapping("/weigh")
public class MobileVehicleFieldSlipController {

	@Autowired
	MobileVehicleFieldSlipService fieldSlipService;
	
	@GetMapping("/agreementList")
	public String getAgreementList() throws SQLException {
		JSONArray array = fieldSlipService.getAgreementList();
		return array.toString();
		
	}

}
