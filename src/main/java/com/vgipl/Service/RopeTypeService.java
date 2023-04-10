/**
 * 
 */
package com.vgipl.Service;

import java.util.List;

import com.vgipl.Modal.RopeTypeMaster;
import com.vgipl.Exception.ApplicationException;

/**
 * @author Priyanka Kadukar
 *
 */
public interface RopeTypeService {

	RopeTypeMaster saveRope(RopeTypeMaster rope) throws ApplicationException;
// public RopeTypeMaster saveRopeMaster (RopeTypeMaster rope);

	RopeTypeMaster getRopeById(Integer ropeId);

	List<RopeTypeMaster> getAllRope();
	
	 RopeTypeMaster updateRopeMaster(Integer ropeId ,RopeTypeMaster rope);

	RopeTypeMaster deleteRopeById(Integer ropeId);
}
