/**
 * 
 */
package com.vgipl.Service_Impl;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import javax.sql.DataSource;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vgipl.Service.MobileCartielsSlipService;

/**
 * @author Priyanka Kadukar
 *
 */
@Service
public class MobileCartFieldSlipImpl implements MobileCartielsSlipService {
@Autowired
DataSource dataSource;
	@Override
	public JSONArray getAgreementListData() throws SQLException {
		Connection conn = dataSource.getConnection();
		CallableStatement stmt = conn.prepareCall("call AGRI_ERP.PR_GET_AGRIMENT_FOR_FIELDSLIP(?,?,?,?)");
		stmt.setInt(1, 11);
		stmt.setInt(2, 12);
		stmt.setInt(3, 8);
		stmt.registerOutParameter(4, Types.REF_CURSOR);
		ResultSet rs;
		String i, k;

		JSONArray jArray = new JSONArray();

		JSONObject jObj3 = null;

		boolean st = stmt.execute();
		rs = (ResultSet) stmt.getObject(4);
		// rs = stmt.getString(3);
		

		while (rs.next()) {
			jObj3 = new JSONObject();
			jObj3.put("pId", rs.getString(1));
			
			jObj3.put("agreementDate", rs.getString(2));
			/*
			 * jObj3.put("pName", rs.getString(3)); System.out.println("Result1 : " +
			 * rs.getString(1)); System.out.println("Result : " + rs.getString(2));
			 */
		jArray.put(jObj3);
		}
		rs.close();
		stmt.close();
		conn.close();
		return jArray;
	
	}

}
