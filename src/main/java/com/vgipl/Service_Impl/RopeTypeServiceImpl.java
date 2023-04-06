/**
 * 
 */
package com.vgipl.Service_Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vgipl.Modal.RopeTypeMaster;
import com.vgipl.Repository.RopeTypeRepository;
import com.vgipl.Service.RopeTypeService;

/**
 * @author Priyanka Kadukar
 *
 */
@Service
public class RopeTypeServiceImpl implements RopeTypeService{
    @Autowired
    RopeTypeRepository ropeType;
    
	@Override
	public RopeTypeMaster saveRope(RopeTypeMaster rope) {
		Integer maxId = ropeType.getMaxId();
		Integer userId = 101;
		String ipAdress = "192.168.5.156";
		String macAdress = "F8-0D-AC-73-DA-CB";
		// Date EnterDate = new Date();
		rope.setUserId(userId);
		rope.setIpAdress(ipAdress);
		rope.setMacAdress(macAdress);
		return ropeType.save(rope);
	}

}
