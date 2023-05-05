/**
 * 
 */
package com.vgipl.Service_Impl.master;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vgipl.Exception.ApplicationException;
import com.vgipl.Modal.RopeTypeMaster;
import com.vgipl.Repository.RopeTypeRepository;
import com.vgipl.Service.master.RopeTypeService;
import com.vgipl.bo.Constants;



/**
 * @author Priyanka Kadukar
 *
 */
@Service
public class RopeTypeServiceImpl implements RopeTypeService{
    @Autowired
    RopeTypeRepository ropeType;
    
	@Override
	public RopeTypeMaster saveRope(RopeTypeMaster rope) throws ApplicationException {
		Integer maxId = ropeType.getMaxId();
		Integer userId = 101;
		//Integer ropeId =27;
		String ipAdress = "192.168.5.151";
		String macAdress = "F8-0D-AC-73-DA-CB";
		// Date EnterDate = new Date();
		
		rope.setRopeId(maxId);
		rope.setRopeCode(maxId.toString());
	//	rope.setRopeName(ropeName);
		rope.setUserId(userId);
		rope.setIpAdress(ipAdress);
		rope.setMacAdress(macAdress);
		rope.setDeleteFlag("N");
		List<RopeTypeMaster> findByVehicleIdAndPriorityAndDeleteFlag = ropeType.findByVehicleIdAndPriorityAndDeleteFlag(rope.getVehicleId(), rope.getPriority(),rope.getDeleteFlag());
		
		System.out.println("Find :"+findByVehicleIdAndPriorityAndDeleteFlag);
		if(!findByVehicleIdAndPriorityAndDeleteFlag.isEmpty()) {
			throw new ApplicationException(Constants.AlreadyPresentErrorCode, Constants.VehiclePriorityAlreadyPresent);
//			System.out.println("\"Find :\"+findByVehicleIdAndPriority\"Find :\"+findByVehicleIdAndPriority");
		}
		return ropeType.save(rope);
	}

	@Override
	public RopeTypeMaster getRopeById(Integer ropeId) {
		RopeTypeMaster ropeT = ropeType.findById(ropeId).get();
		return ropeT;
	}

	@Override
	public List<RopeTypeMaster> getAllRope() {
//		List<RopeTypeMaster> findAll = ropeType.getAllRecordsRope();
		List<RopeTypeMaster> findAll = ropeType.findByDeleteFlag("N");
		//List<RopeTypeMaster> findAll = ropeType.findAll();
		return findAll;
	}

	@Override
	public RopeTypeMaster updateRopeMaster(Integer ropeId, RopeTypeMaster rope) {
		String ipAddress = "192.168.5.151";
		String macAddress = "82-E9-3A-9A-2C-4B";
		Integer updateBy = 101;
		Date lastupdate = new Date();
        RopeTypeMaster rope1 = getRopeById(ropeId);
        rope1.setRopeCode(rope.getRopeCode());
        rope1.setRopeName(rope.getRopeName());
        rope1.setLocalRopeName(rope.getLocalRopeName());
        rope1.setPriority(rope.getPriority());
        rope1.setVehicleId(rope.getVehicleId());
        rope1.setLastUpdate(rope.getLastUpdate());
		
        ropeType.save(rope1);

		return rope1;
	}

	@Override
	public RopeTypeMaster deleteRopeById(Integer ropeId) {
		System.out.println("inside Delete");
		Integer updateBy = 101;
		Date lastupdate = new Date();
        RopeTypeMaster rope = getRopeById(ropeId);
		
        rope.setDeleteFlag("Y");
       
        rope.setLastUpdate(lastupdate);

        RopeTypeMaster rope2 = ropeType.save(rope);

		return rope2;
	}

}
