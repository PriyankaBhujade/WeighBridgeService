/**
 * 
 */
package com.vgipl.Service_Impl.master;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vgipl.Modal.CaneQualityMaster;
import com.vgipl.Repository.CaneQualityRepository;
import com.vgipl.Service.master.CaneQualityMasterService;

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
		caneQualityMaster.setId(maxId);
		caneQualityMaster.setUserId(userId);
		caneQualityMaster.setIpAddress(ipAddress);
		caneQualityMaster.setMacAddress(macAddress);
		caneQualityMaster.setDeleteFlag("N");
		// irrigationMaster.setEnterDate(EnterDate);
		return caneQualityRepository.save(caneQualityMaster);
	}

	@Override
	public List<CaneQualityMaster> getAllRecords() {
		// TODO Auto-generated method stub
		List<CaneQualityMaster> caneTypeMasters = caneQualityRepository.getAllRecords();
		return caneTypeMasters;
	}

	@Override
	public CaneQualityMaster deleteRecordById(Integer id) {
		// TODO Auto-generated method stub
		System.out.println("id======"+id);
		CaneQualityMaster caneTypeMaster = getRecordById(id);
		Date lastUpdate = new Date();
		caneTypeMaster.setLastUpdate(lastUpdate);
		caneTypeMaster.setDeleteFlag("Y");

		CaneQualityMaster caneTypeMaster2 = caneQualityRepository.save(caneTypeMaster);
		return caneTypeMaster2;
	}

	

	@Override
	public CaneQualityMaster getRecordById(Integer id) {
		// TODO Auto-generated method stub
		CaneQualityMaster caneTypeMaster = caneQualityRepository.findById(id).get();
		return caneTypeMaster;
	}

	@Override
	public CaneQualityMaster updateRecord(Integer id, CaneQualityMaster caneQualityMaster) {
		// TODO Auto-generated method stub
		CaneQualityMaster caneTypeMaster2 = caneQualityRepository.findById(id).get();
		Integer updateBy = 101;
		Date lastUpdate = new Date();
		String ipAddress = "192.168.5.76";
		String macAddress = "00-01-6C-D9-8A-4B";

		caneTypeMaster2.setId(caneQualityMaster.getId());
		caneTypeMaster2.setBranchStr(caneQualityMaster.getBranchStr());
		caneTypeMaster2.setCode(caneQualityMaster.getCode());
		caneTypeMaster2.setQualityName(caneQualityMaster.getQualityName());
		caneTypeMaster2.setLocalQualityName(caneQualityMaster.getLocalQualityName());
		caneTypeMaster2.setLastUpdate(lastUpdate);
		caneTypeMaster2.setIpAddress(ipAddress);
		caneTypeMaster2.setMacAddress(macAddress);
		caneTypeMaster2.setUserId(caneQualityMaster.getUserId());
		

		caneQualityRepository.save(caneTypeMaster2);
		return caneTypeMaster2;
	}

}
