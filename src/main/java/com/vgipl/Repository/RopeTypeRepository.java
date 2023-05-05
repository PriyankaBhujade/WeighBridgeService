package com.vgipl.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.vgipl.Modal.RopeTypeMaster;


@Repository
public interface RopeTypeRepository extends JpaRepository<RopeTypeMaster, Integer>{
	@Query(value = "SELECT NVL(MAX(ROPE_ID),0)+1  FROM ROPE_TYPE_MAST ", nativeQuery = true)
	Integer getMaxId();

	List<RopeTypeMaster> findByDeleteFlag(String string);

	List<RopeTypeMaster> findByVehicleIdAndPriority(Integer vehicleId, Integer priority);

	List<RopeTypeMaster> findByVehicleIdAndPriorityAndDeleteFlag(Integer vehicleId, Integer priority,
			String string);
	
	//@Query(value = "select v.* from ROPE_TYPE_MAST v where v.DELETE_FLAG = 'N'", nativeQuery = true)
//	List<RopeTypeMaster> getAllRecordsRope();

//	List<RopeTypeMaster> findByDeleteFlag(String string);
}
