/**
 * 
 */
package com.shxt.dao;

import java.io.Serializable;
import java.util.List;

/**
 * @author shanzhi
 *
 */
public interface IBaseDao {
	
   /**
    * @since ����һ����¼����ݿ�
    * @param object
    * @throws Exception
    * @return void
    */
   public void save(Object object) throws Exception;
   
   
   /**
    * @since �޸�һ����¼
    * @param object
    * @throws Exception
    * @return void
    */
   public void update(Object object) throws Exception;
   
   
   /**
    * @since ����ݿ���ɾ��һ����¼
    * @param object
    * @throws Exception
    * @return void
    */
   public void delete(Object object) throws Exception;
   
   
   /**
    * @since ����ݿ��л�ȡһ����¼
    * @param object
    * @throws Exception
    * @return void
    */
   public Object get(Class<Object> cla,Serializable id) throws Exception;
   
   
   /**
    * @since ��ȡ�б�
    * @param object
    * @throws Exception
    * @return void
    */
   public List<Object> list(String hql) throws Exception;
   
   /**
    * @since ���в�ѯ������HQL���
    * @param hql���  ��������
    * @throws Exception
    * @return void
    */
   public List<Object> list(String hql,Object...obj) throws Exception;
   public Object get1(Object obj,int i);
   
   public List cutPage(String pageHql, int firstResult, int MaxResults);
   
   public List cutPage(String pageHql, int firstResult, int MaxResults,
			Object... parameters)throws Exception  ;
   
   public void executeUpdate(String hql, String[] parameters);
   public int getCountPage(String pageHql, int MaxResults,Object... parameters) throws Exception;
   public int getCountPage(String pageHql, int MaxResults);
   public int getTotalCount(String pageHql);
   public int getOneResult(String hql);
   public Long getOneResultCount(String hql);
   public String getOneResultString(String hql);
}
