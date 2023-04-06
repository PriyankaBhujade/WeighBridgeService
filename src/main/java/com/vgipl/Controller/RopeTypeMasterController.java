/**
 * 
 */
package com.vgipl.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.vgipl.Modal.RopeTypeMaster;
import com.vgipl.Service.RopeTypeService;
import com.vgipl.core_erp.Config.RequestController;
import com.vgipl.core_erp.bo.Constants;
import com.vgipl.core_erp.bo.RequestResponse;



/**
 * @author Priyanka Kadukar
 *
 */
@Controller
@CrossOrigin("*")
@RequestMapping("/agri")
public class RopeTypeMasterController {
 @Autowired
 RopeTypeService ropeService;
 
 @PostMapping("saveRope")
	 public ResponseEntity<RequestResponse> saveRope(@RequestBody RopeTypeMaster rope){
	RopeTypeMaster ropeT = 	 ropeService.saveRope(rope);
	return RequestController.getBaseResponse(Constants.SuccessCode, Constants.DataSaveSuccess, HttpStatus.ACCEPTED,
			ropeT);
	 }
	 
 }

