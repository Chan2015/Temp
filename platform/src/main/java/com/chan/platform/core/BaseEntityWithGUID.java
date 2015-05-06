package com.chan.platform.core;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.GenericGenerator;

/**
 * 生成36位uuid的主键基类
 * @author: Chan
 * @since : 2015-4-27
 */
@MappedSuperclass
@DynamicUpdate(true)
public class BaseEntityWithGUID extends IdEntity<String>{

	private static final long serialVersionUID = -6617319149801124083L;
	
    @Id
    @GenericGenerator(name="generator", strategy="guid", parameters={})
    @GeneratedValue(generator="generator")
    @Column(columnDefinition="UNIQUEIDENTIFIER")
    private String id;
	
    public BaseEntityWithGUID() {
    	super();
    }
    
    public BaseEntityWithGUID(String id) {
    	super();
    	this.id = id;
    }
    
	@Override
	public String getId() {
		return this.id;
	}

	@Override
	protected void setId(String id) {
		this.id = id;
	}

	
}
