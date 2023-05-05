/**
 * 
 */
package com.vgipl.Controller;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import org.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vgipl.Service.MobileCartielsSlipService;

/**
 * @author Priyanka Kadukar
 *
 */
@RestController
@RequestMapping("/weigh")
public class MobileCartController {
	@Autowired
	MobileCartielsSlipService mobileCartService;
	@GetMapping("/getAgreeForCart")
	public String getAgreementData(HttpServletRequest request
			) throws SQLException {
		 JSONArray agreeList = mobileCartService.getAgreementListData();
			return agreeList.toString();
		
	}

}
