/**
 * 
 */
package com.vgipl.Modal;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * @author Pratiksha.hatekar
 *
 */
@Entity
@Data
@Table(name = "CANE_QUALITY_MST")
public class CaneQualityMaster {
	
	@Id
	@Column(name = "QUALITY_ID")
	private Integer id;

	
	@Column(name = "COMPANY")
	private Integer company;
	
	
	@Column(name = "BRANCH")
	private Integer branch;
	
	
	@Column(name = "BRANCH_STR")
	private String branchStr;
	
	
	@Column(name = "QUALITY_CODE")
	private String code;
	
	
	@Column(name = "QUALITY_NAME")
	private String qualityName;
	
	
	@Column(name = "LOCAL_QUALITY_NAME")
	private String localQualityName;
	
	
	@Column(name = "LASTUPDATE")
	private Date lastUpdate;
	
	
	@Column(name = "IP_ADDRESS")
	private String ipAddress;
	
	
	@Column(name = "MAC_ADDRESS")
	private String macAddress;
	
	
	@Column(name = "USER_ID")
	private Integer userId;
	
	
	@Column(name = "DEFAULT_FLAG")
	private String defaultFlag;
	
	
	@Column(name = "QUALITY_FLAG")
	private String qualityFlag;
	
	
}
