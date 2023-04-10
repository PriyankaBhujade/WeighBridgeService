/**
 * 
 */
package com.vgipl.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vgipl.Config.RequestController;
import com.vgipl.Modal.CaneQualityMaster;
import com.vgipl.Service.CaneQualityMasterService;
import com.vgipl.bo.Constants;
import com.vgipl.bo.RequestResponse;


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
	public ResponseEntity<RequestResponse> saveQualityRecord(@RequestBody CaneQualityMaster caneTypeMaster) {
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
	
	@GetMapping("/caneQuality/{id}")
	public ResponseEntity<RequestResponse> getRecordById(@PathVariable("id") Integer id) {
		CaneQualityMaster caneTypeMaster = caneQualityMasterService.getRecordById(id);
		return RequestController.getBaseResponse(Constants.SuccessCode, Constants.DataFetchSuccess, HttpStatus.ACCEPTED,
				caneTypeMaster);
//		return villageMaster.toString();
	}
	
	@PutMapping("/caneQuality/{id}")
	public ResponseEntity<RequestResponse> updateRecord(@PathVariable("id") Integer id,
			@RequestBody CaneQualityMaster caneTypeMaster) {
		CaneQualityMaster caneTypeMaster2 = caneQualityMasterService.updateRecord(id, caneTypeMaster);
		return RequestController.getBaseResponse(Constants.SuccessCode, Constants.DataUpdateSuccess, HttpStatus.ACCEPTED,
				caneTypeMaster2);
		// return villageMaster2.toString();
	}

	
	
	@DeleteMapping("/caneQuality/{id}")
	public ResponseEntity<RequestResponse> deleteRecordById(@PathVariable("id") Integer id) {
		CaneQualityMaster deleteRecord = caneQualityMasterService.deleteRecordById(id);
		return RequestController.getBaseResponse(Constants.SuccessCode, Constants.DataDeleteSuccess, HttpStatus.ACCEPTED,
				deleteRecord);
		// return deleteRecord;
	}

}
