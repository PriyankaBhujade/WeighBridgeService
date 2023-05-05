/**
 * 
 */
package com.vgipl.Service;

import java.sql.SQLException;

import org.json.JSONArray;

/**
 * @author Priyanka Kadukar
 *
 */
public interface MobileCartielsSlipService {
JSONArray getAgreementListData() throws SQLException;
}
