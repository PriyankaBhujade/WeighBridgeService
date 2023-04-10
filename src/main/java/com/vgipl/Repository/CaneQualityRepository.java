/**
 * 
 */
package com.vgipl.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.vgipl.Modal.CaneQualityMaster;

/**
 * @author Pratiksha.hatekar
 *
 */
@Repository
public interface CaneQualityRepository extends JpaRepository<CaneQualityMaster, Integer> {
	@Query(value = "select max(QUALITY_ID) from CANE_QUALITY_MST", nativeQuery = true)
	Integer getMaxId();
	
	@Query(value = "select c.* from CANE_QUALITY_MST c where c.DELETE_FLAG = 'N'", nativeQuery = true)
	List<CaneQualityMaster> getAllRecords();

	//List<CaneQualityMaster> findbyDeleteFlag(String string);
}
