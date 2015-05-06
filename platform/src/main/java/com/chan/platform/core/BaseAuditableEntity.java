package com.chan.platform.core;

import java.util.Date;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.joda.time.DateTime;
import org.springframework.data.domain.Auditable;

/**
 * 对每条实体进行createdBy、createdDate、lastModifiedBy以及lastModifiedDate的赋值
 * @author: Chan
 * @since : 2015-4-27
 */
@MappedSuperclass
public class BaseAuditableEntity extends BaseEntityWithGUID implements Auditable<String, String>{

	private static final long serialVersionUID = -6617319149801124083L;	
	
	private String createdBy;
	
	@Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;
	
	private String lastModifiedBy;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date lastModifiedDate;	
	
	public String getCreatedBy() {
		return this.createdBy;
	}

	public DateTime getCreatedDate() {
		return null == this.createdDate ? null : new DateTime(this.createdDate);
	}

	public String getLastModifiedBy() {
		return this.lastModifiedBy;
	}

	public DateTime getLastModifiedDate() {
		return null == this.lastModifiedDate ? null : new DateTime(this.lastModifiedDate);
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public void setCreatedDate(DateTime createdDate) {
		this.createdDate = (null == createdDate ? null : createdDate.toDate());
	}

	public void setLastModifiedBy(String lastModifiedBy) {
		this.lastModifiedBy = lastModifiedBy;
	}

	public void setLastModifiedDate(DateTime lastModifiedDate) {
		this.lastModifiedDate = (null == lastModifiedDate ? null : lastModifiedDate.toDate());
	}
}
