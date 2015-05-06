package com.chan.platform.core;

import java.io.Serializable;
import javax.persistence.MappedSuperclass;
import org.springframework.data.domain.Persistable;

@MappedSuperclass
public abstract class AbstractPersistable<PK extends Serializable> implements Persistable<PK> {

	private static final long serialVersionUID = -5554308939380869754L;
	
	public abstract PK getId();
	
	protected abstract void setId(PK paramPK);
	
	public boolean isNew(){
		return null == getId();
	}
	
	public String toString(){
		return String.format("Entity of type %s with id: %s", new Object[] { getClass().getName(), getId() });
	}
		
	public boolean equals(Object obj){
		if(null == obj){
			return false;
		}
		else if(this == obj){
			return true;
		}
		else if(!getClass().equals(obj.getClass())){
			return false;
		}
	    AbstractPersistable that = (AbstractPersistable)obj;
	    return null == getId() ? false : getId().equals(that.getId());
	}
	
	public int hashCode(){
		int hashCode = 17;
	
	    hashCode += (null == getId() ? 0 : getId().hashCode() * 31);
	
	    return hashCode;
	}
}
