/**
 * 
 */
package com.vgipl.bo;



/**
 * @author ashwini.shebe
 *
 */
public interface Constants {

	static int SuccessCode = 200;
	static int ErrorCode = 100;
	static int AlreadyPresentErrorCode = 101;

	static String DataSaveSuccess = "Data Saved Successfully";
	static String DataSaveFailed = "Data Saved Failed";

	static String DataUpdateSuccess = "Data Updated Succesfully";
	static String DataUpdateFailed = "Data Update Failed";

	static String DataDeleteSuccess = "Data Deleted Successfully";
	static String DataDeleteFailed = "Data Delete Failed";

	static String DataFetchSuccess = "Data Fetched Successfully";
	static String DataNotFound = "Data Not Found";

	static String DataListFetchSuccess = "Data List Fetched Successfully";
	static String DataListNotFound = "Data List Not Found";

	// Master Constant
	static String CodeAlreadyPresent = "Code Already Present";
	static String NameAlreadyPresent = "Name Already Present";
	static String ErrorMsg = "Something Went Wrong";
	
	// Send Mail
	static String SendMail = "Varification Email Send in Registered Email Address.";
	static String EmailAddressWrong = "Email Address Not Found!";
   
//	User Master Constants
	static String UserNameAlreadyPresent = "User Name Already Present";
	static String DataNotProcess = "Data Not Process";
	
// RopeTypeMaster
	
	static String VehiclePriorityAlreadyPresent = "Vehicle Wise Priority Already Set";
	

}
