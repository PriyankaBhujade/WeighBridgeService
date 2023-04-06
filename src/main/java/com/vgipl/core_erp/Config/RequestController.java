/**
 * 
 */
package com.vgipl.core_erp.Config;

/**
 * @author ashwini.shebe
 *
 */
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.vgipl.core_erp.bo.RequestResponse;



public class RequestController {
	
	public static ResponseEntity<RequestResponse> getBaseResponse(int code, String msg,  HttpStatus httpStatus, Object response) {
		
		RequestResponse baseResponse = new RequestResponse();
		
		baseResponse.setCode(code);
		baseResponse.setMsg(msg);
		baseResponse.setHttpStatus(httpStatus);
		baseResponse.setResponse(response);
		
		return new ResponseEntity<RequestResponse>(baseResponse, httpStatus);
	}
	
	

}
