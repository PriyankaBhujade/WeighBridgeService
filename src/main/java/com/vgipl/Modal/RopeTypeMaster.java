/**
 * 
 */
package com.vgipl.Modal;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;


import lombok.Getter;

import lombok.Setter;



/**
 * @author Priyanka Kadukar
 *
 */
@Entity
@Setter
@Getter
/*
 * @NoArgsConstructor
 * 
 * @AllArgsConstructor
 */
@Table(name = "ROPE_TYPE_MAST")
public class RopeTypeMaster {
	
//	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Id
	@Column(name = "ROPE_ID" ,nullable = false)
	private Integer ropeId;
	
	@Column(name = "ROPE_NAME")
	private String ropeName;
	
	@Column(name = "ROPE_CODE")
	private String ropeCode;
	
	//@Column(name = "STATUS")
	//private String status;
	
	@Column(name = "USER_ID")
	private Integer userId;
	
	@Column(name = "VEHICLE_TYPE_ID")
	private Integer vehicleId;
	
	@Column(name = "PRIORITY")
	private Integer priority;
	
	@Column(name = "MAC_ADDRESS")
	private String macAdress;
	
	@Column(name = "LOCAL_ROPE_NAME")
	private String localRopeName;
	
	@Column(name = "LASTUPDATE")
	private Date lastUpdate;
	
	@Column(name = "IP_ADDRESS")
	private String ipAdress;
	
	@Column(name = "Delete_flag")
	private String deleteFlag;

}
