package com.chan.platform.web.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.apache.commons.lang.StringUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import com.chan.platform.web.domain.SysUser;

/**
 * 扩展JpaRepository，写一个接口同名类，加上后缀为Impl，在applicationDatasource.xml中配置过，可以被扫描
 * 这个类不需要实现任何接口; (可以(JPQL)补充spring data jpa 动态查询不是很方便的缺点);
 * 测试用
 * @author: Chan
 * @since : 2015-4-27
 */
public class SysUserRepositoryImpl {

	@PersistenceContext
	private EntityManager em;
	
	public Page<SysUser> getByCondition(SysUser sysUser) {
		StringBuffer hql = new StringBuffer("select u from SysUser u where 1=1");
		if (StringUtils.isNotBlank(sysUser.getAccount())) {
			hql.append(" and u.account=:account");
		}
		Query q = em.createQuery(hql.toString());
		if (StringUtils.isNotBlank(sysUser.getAccount())) {
			q.setParameter("account", sysUser.getAccount());
		}
		q.setFirstResult(0);
		q.setMaxResults(2);
		Page<SysUser> page = new PageImpl<SysUser>(q.getResultList(),new PageRequest(0, 2), 3);
		return page;
	}
}
