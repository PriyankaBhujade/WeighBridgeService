/**
 * 
 */
package com.vgipl.Service.Transaction;

import java.sql.SQLException;

import org.json.JSONArray;

/**
 * @author Pratiksha.hatekar
 *
 */
public interface MobileVehicleFieldSlipService {
	
	JSONArray getAgreementList() throws SQLException;

}
