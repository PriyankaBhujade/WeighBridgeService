/**
 * 
 */
package com.vgipl.Controller.master;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.vgipl.Config.RequestController;
import com.vgipl.Exception.ApplicationException;
import com.vgipl.Modal.RopeTypeMaster;
import com.vgipl.Service.master.RopeTypeService;
import com.vgipl.bo.Constants;
import com.vgipl.bo.RequestResponse;

/**
 * @author Priyanka Kadukar
 *
 */
@Controller
//@CrossOrigin("*")
@RequestMapping("/weigh")
public class RopeTypeMasterController {
	@Autowired
	RopeTypeService ropeService;

	@PostMapping("saveRope")
	public ResponseEntity<RequestResponse> saveRope(@RequestBody RopeTypeMaster rope) throws ApplicationException {
		try {
			RopeTypeMaster ropeT = ropeService.saveRope(rope);
			return RequestController.getBaseResponse(Constants.SuccessCode, Constants.DataSaveSuccess,
					HttpStatus.ACCEPTED, ropeT);
		} catch (ApplicationException e) {
			return RequestController.getBaseResponse(e.getExceptionCode(), e.getExceptionMsg(),
					HttpStatus.ALREADY_REPORTED, null);
		} catch (Exception e) {
			return RequestController.getBaseResponse(Constants.SuccessCode, Constants.CodeAlreadyPresent,
					HttpStatus.ACCEPTED, null);
		}
		
	}

	@GetMapping("/ropes")
	public ResponseEntity<RequestResponse> getRopeList() {
		List<RopeTypeMaster> allRope = ropeService.getAllRope();
		return RequestController.getBaseResponse(Constants.SuccessCode, Constants.DataFetchSuccess, HttpStatus.ACCEPTED,
				allRope);
	}

	@GetMapping("rope/{ropeId}")
	public ResponseEntity<RequestResponse> getRopeById(@PathVariable("ropeId") Integer ropeId) {
		RopeTypeMaster rop = ropeService.getRopeById(ropeId);
		if (rop == null) {
			return RequestController.getBaseResponse(Constants.ErrorCode, Constants.DataListNotFound,
					HttpStatus.NOT_FOUND, null);
		} else {
			return RequestController.getBaseResponse(Constants.SuccessCode, Constants.DataFetchSuccess,
					HttpStatus.ACCEPTED, rop);
		}
	}

	@PutMapping("/rope/{ropeId}")
	public ResponseEntity<RequestResponse> updateRopeMaster(@PathVariable("ropeId") Integer ropeId,
			@RequestBody RopeTypeMaster rope) {
		System.out.println("@PutMapping : ropeId : " + ropeId);
		System.out.println("@PutMapping : rope : " + rope.toString());

		RopeTypeMaster update = null;
		update = ropeService.updateRopeMaster(ropeId, rope);

//		return update.toString();
		return RequestController.getBaseResponse(Constants.SuccessCode, Constants.DataUpdateSuccess,
				HttpStatus.ACCEPTED, update);
	}

	@DeleteMapping("rope/{ropeId}")
	public ResponseEntity<RequestResponse> deleteRopeMaster(@PathVariable("ropeId") Integer ropeId) {
		RopeTypeMaster rope = ropeService.deleteRopeById(ropeId);
		return RequestController.getBaseResponse(Constants.SuccessCode, Constants.DataDeleteSuccess,
				HttpStatus.ACCEPTED, rope);
	}
}
