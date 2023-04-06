package com.vgipl.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.vgipl.Modal.RopeTypeMaster;

@Repository
public interface RopeType extends JpaRepository<RopeTypeMaster, Integer>{
	@Query(value = "SELECT NVL(MAX(G.ROPE_ID),0)+1  FROM ROPE_TYPE_MAST G", nativeQuery = true)
	Integer getMaxId();
}
