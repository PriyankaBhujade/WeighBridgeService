/**
 * 
 */
package com.vgipl.Service_Impl.Transaction;

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

import com.vgipl.Service.Transaction.MobileVehicleFieldSlipService;

/**
 * @author Pratiksha.hatekar
 *
 */
@Service
public class MobileVehicleFieldSlipServiceImpl implements MobileVehicleFieldSlipService {
	@Autowired
	DataSource datasource;
	
	@Override
	public JSONArray getAgreementList() throws SQLException {
		// TODO Auto-generated method stub
		
		Connection conn = datasource.getConnection();
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
			jObj3.put("plantationId", rs.getString(1));
			
			jObj3.put("agreeNo", rs.getString(2));
			jObj3.put("agreeDate", rs.getString(3));
			jObj3.put("planDate", rs.getString(7));
			jObj3.put("canevariety", rs.getString(11));
			jObj3.put("caneTypeCode", rs.getString(15));
			jObj3.put("caneTypeName", rs.getString(14));
			jObj3.put("villageCode", rs.getString(27));
			jObj3.put("villageName", rs.getString(28));
			jObj3.put("shivarGutCode", rs.getString(21));
			jObj3.put("shivarGutName", rs.getString(22));
			jObj3.put("shivarVillageCode", rs.getString(18));
			jObj3.put("shivarVillageName", rs.getString(19));
			jObj3.put("gutCode", rs.getString(29));
			jObj3.put("gutName", rs.getString(30));
			jObj3.put("formNo", rs.getString(5));
			jObj3.put("surveyNo", rs.getString(6));
			jObj3.put("cultCode", rs.getString(24));
			jObj3.put("cultName", rs.getString(26));
			jObj3.put("member", rs.getString(31));
			jObj3.put("hectorR", rs.getString(8));
			
		jArray.put(jObj3);
		}
		rs.close();
		stmt.close();
		conn.close();
		return jArray;
	}

}
