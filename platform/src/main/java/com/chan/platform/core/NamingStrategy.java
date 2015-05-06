package com.chan.platform.core;

import org.hibernate.cfg.ImprovedNamingStrategy;

import com.chan.platform.exception.VapBaseException;


/**
 * jpd的外键命名映射策略，数据库的外键都是XX_ID形式
 * @author: Chan
 * @since : 2015-4-25
 */
public class NamingStrategy extends ImprovedNamingStrategy {

	public static final long serialVersionUID = 8840839853628300338L;
	
	public String foreignKeyColumnName(String propertyName, String propertyEntityName, String propertyTableName, String referencedColumnName)
		throws VapBaseException{
		String fk = super.foreignKeyColumnName(propertyName, propertyEntityName, propertyTableName, referencedColumnName);
		return fk + "_ID";
	}
}
