/**
 * 
 */
package com.vgipl.Service_Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vgipl.Modal.CaneQualityMaster;
import com.vgipl.Repository.CaneQualityRepository;
import com.vgipl.Service.CaneQualityMasterService;

/**
 * @author Pratiksha.hatekar
 *
 */
@Service
public class CaneQualityMasterServiceImpl implements CaneQualityMasterService {
	
	@Autowired
	CaneQualityRepository caneQualityRepository;

	@Override
	public CaneQualityMaster saveRecord(CaneQualityMaster caneQualityMaster) {
		// TODO Auto-generated method stub
		Integer maxId = caneQualityRepository.getMaxId();
//		Integer id = null;
//
//		if (maxId == null)
//			id = 1;
//		else
//			id = maxId + 1;

		// Integer company = 11;
		Integer userId = 101;
		String ipAddress = "192.168.5.156";
		String macAddress = "F8-0D-AC-73-DA-CB";
		// Date EnterDate = new Date();
		caneQualityMaster.setUserId(userId);
		caneQualityMaster.setIpAddress(ipAddress);
		caneQualityMaster.setMacAddress(macAddress);
		// irrigationMaster.setEnterDate(EnterDate);
		return caneQualityRepository.save(caneQualityMaster);
	}

	@Override
	public List<CaneQualityMaster> getAllRecords() {
		// TODO Auto-generated method stub
		List<CaneQualityMaster> caneTypeMasters = caneQualityRepository.getAllRecords();
		return caneTypeMasters;
	}

}
