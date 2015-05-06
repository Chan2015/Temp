package com.chan.platform.web.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.chan.platform.web.domain.SysUser;


/**
 * 系统用户实例persistent借款
 * Repository：是 Spring Data的一个核心接口，它不提供任何方法，开发者需要在自己定义的接口中声明需要的方法；
 * CrudRepository：继承Repository，提供增删改查方法，可以直接调用；
 * PagingAndSortingRepository：继承CrudRepository，具有分页查询和排序功能；
 * JpaRepository：继承PagingAndSortingRepository，针对JPA技术提供的接口；
 * JpaSpecificationExecutor：可以执行复杂的逻辑查询
 * @author: Chan
 * @since : 2015-4-27
 */
public interface SysUserRepository extends JpaRepository<SysUser, Integer> , JpaSpecificationExecutor<SysUser>{

	/**
     * 实体account属性查询(条件属性以首字母大写)，作为查询条件的属性一定要遵守驼峰命名规范
     * JPQL:from SysUser u where u.account=?1
     */
    SysUser findByAccount(String account);
    
    /**
     * JPQL:from SysUser u where u.account like ?1
     */
    SysUser findByAccountLike(String account);
    
    /**
     * JPQL:from SysUser u where u.account in ?1
     */
    List<SysUser> findByAccountIn(List<String> accounts);
    
    /**
     * JPQL:from SysUser u where u.account=?1 and u.password=?2
     */
    SysUser findByAccountAndPassword(String account,String password);
    
    /**
     * page对象含有List<T> getContent()方法，可以去除对应数据
     */
    Page<SysUser>findByAccount(String account,Pageable pageable);
    
    /**
     * 方法的参数个数必须和@Query里面需要的参数个数一致 
     */
    @Query(" select o from SysUser o where o.account=?1")
    SysUser findUserByQuery(String account);
    
    /**
     * 方法的参数个数必须和@Query里面需要的参数个数一致(指定别名) 
     */
    @Query(" select o from SysUser o where o.account=:acc")
    SysUser findUserByQueryParam(@Param("acc")String account);
    
    
}
