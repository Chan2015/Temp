package com.chan.platform.core;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import com.chan.platform.exception.SystemException;


/**
 * Spring容器applicationContext的帮助类，屏蔽开发者对于容器的不了解但是又需要直接操作容器bean的尴尬
 * @author: Chan
 * @since : 2015-4-25
 */
public class SpringHelper implements ApplicationContextAware{

	private static final Logger log = LoggerFactory.getLogger(SpringHelper.class);
	
	/**
	 * @author: Chan
	 * @category applicationContext 静态容器常量
	 * @since: 2015-4-25
	 */
	private static ApplicationContext applicationContext;
	
	public void setApplicationContext(ApplicationContext arg0) throws BeansException {
		applicationContext = arg0;
	}
	
	public static ApplicationContext getApplicationContext(){
		checkApplicationContext();
		return applicationContext;
	}
	
	public static Object getBean(String beanName) throws BeansException, SystemException{
		if(null == beanName || "" == beanName){
			throw new SystemException("bean的名称不能为空！");
		}
		if(log.isDebugEnabled()){
			log.debug("beanName:" + beanName);
		}
		return applicationContext.getBean(beanName);
	}
	
	private static void checkApplicationContext(){
		if(null == applicationContext){
			throw new IllegalStateException("applicaitonContext.xml未注入,请在common-config.xml中定义SpringContextHolder");
		}
	}
	
	@SuppressWarnings("unchecked")
	public static <T> T getBean(Class<T> clazz){
		checkApplicationContext();
		return (T) applicationContext.getBeansOfType(clazz);
	}
	
	public static<T> T getBean(String beanName, Class<T> requiredType) throws BeansException, SystemException{
		if(null == beanName || "" == beanName || null == requiredType){
			throw new SystemException("bean的名称不能为空！");
		}
		if(log.isDebugEnabled()){
			log.debug("beanName:" + beanName + " requiredType:" + requiredType);
		}
		return applicationContext.getBean(beanName, requiredType);
	}
	
	public static boolean containsBean(String beanName){
		return applicationContext.containsBean(beanName);
	}
	
	public static boolean isSingleton(String beanName) throws NoSuchBeanDefinitionException{
		return applicationContext.isSingleton(beanName);
	}
	
	public static Class<?> getType(String beanName) throws NoSuchBeanDefinitionException{
		return applicationContext.getType(beanName);
	}
	
	public static String[] getAliases(String beanName) throws NoSuchBeanDefinitionException{
		return applicationContext.getAliases(beanName);
	}
	
	public static void cleanApplicationContext(){
		applicationContext = null;
	}
}
