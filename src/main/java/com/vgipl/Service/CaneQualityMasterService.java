/**
 * 
 */
package com.vgipl.Service;

import java.util.List;

import com.vgipl.Modal.CaneQualityMaster;

/**
 * @author Pratiksha.hatekar
 *
 */
public interface CaneQualityMasterService {

	CaneQualityMaster saveRecord(CaneQualityMaster caneQualityMaster);

	List<CaneQualityMaster> getAllRecords();
	
	CaneQualityMaster getRecordById(Integer id);

	
	CaneQualityMaster updateRecord(Integer id, CaneQualityMaster caneTypeMaster);

	CaneQualityMaster deleteRecordById(Integer id);
}
