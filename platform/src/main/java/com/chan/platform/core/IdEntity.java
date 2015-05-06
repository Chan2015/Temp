package com.chan.platform.core;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public abstract class IdEntity<PK extends Serializable> extends AbstractPersistable<PK>
{
  private static final long serialVersionUID = 1981685701763591118L;
}
