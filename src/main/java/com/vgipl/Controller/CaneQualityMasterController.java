/**
 * 
 */
package com.vgipl.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vgipl.Modal.CaneQualityMaster;
import com.vgipl.Service.CaneQualityMasterService;
import com.vgipl.core_erp.Config.RequestController;
import com.vgipl.core_erp.bo.Constants;
import com.vgipl.core_erp.bo.RequestResponse;


/**
 * @author Pratiksha.hatekar
 *
 */
@RestController
@CrossOrigin("*")
public class CaneQualityMasterController {

	@Autowired
	CaneQualityMasterService caneQualityMasterService;
	
	@PostMapping("/saveQuality")
	public ResponseEntity<RequestResponse> saveRecord(@RequestBody CaneQualityMaster caneTypeMaster) {
		CaneQualityMaster caneQualityMaster = caneQualityMasterService.saveRecord(caneTypeMaster);
		return RequestController.getBaseResponse(Constants.SuccessCode, Constants.DataSaveSuccess, HttpStatus.ACCEPTED,
				caneQualityMaster);
	}
	
	@GetMapping("/caneQuality")
	public ResponseEntity<RequestResponse> getCaneQuality() {
		List<CaneQualityMaster> list = caneQualityMasterService.getAllRecords();
		return RequestController.getBaseResponse(Constants.SuccessCode, Constants.DataFetchSuccess, HttpStatus.ACCEPTED,
				list);
//		return list.toString();
	}

}
