/**
 * 
 */
package com.shxt.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.shxt.dao.IBaseDao;
import com.shxt.util.HibernateUtil;

/**
 * @author shanzhi
 *
 */
public class BaseDaoImpl extends HibernateUtil implements IBaseDao {

	public void delete(Object object) throws Exception {
        Session session=null;
        Transaction tx=null;
        try{
        	session=getSession();
        	tx=session.beginTransaction();
        	session.delete(object);
        	tx.commit();
        }catch(Exception e){
        	if(tx!=null){
        		tx.rollback();
        	}
        	throw new RuntimeException(e.getMessage());
        }finally{
        	if(session!=null && session.isOpen()){
        		session.close();
        	}
        }
	}
	public int getOneResult(String hql) {
		Session session=null;
        Transaction tx=null;
        int a;
        try{
        	session=getSession();
        	tx=session.beginTransaction();
        	a=(Integer)session.createQuery(hql).uniqueResult();
        	tx.commit();
        }catch(Exception e){
        	if(tx!=null){
        		tx.rollback();
        	}
        	throw new RuntimeException(e.getMessage());
        }finally{
        	if(session!=null && session.isOpen()){
        		session.close();
        	}
        }
        return a;
	}
	public Long getOneResultCount(String hql) {
		Session session=null;
        Transaction tx=null;
        Long a;
        try{
        	session=getSession();
        	tx=session.beginTransaction();
        	a=(Long)session.createQuery(hql).uniqueResult();
        	tx.commit();
        }catch(Exception e){
        	if(tx!=null){
        		tx.rollback();
        	}
        	throw new RuntimeException(e.getMessage());
        }finally{
        	if(session!=null && session.isOpen()){
        		session.close();
        	}
        }
        return a;
	}

	public Object get(Class<Object> cla, Serializable id) throws Exception {
		Session session=null;
        Transaction tx=null;
        Object object=null;
        try{
        	session=getSession();
        	tx=session.beginTransaction();
        	object=session.get(cla, id);
        	tx.commit();
        }catch(Exception e){
        	if(tx!=null){
        		tx.rollback();
        	}
        	throw new RuntimeException(e.getMessage());
        }finally{
        	if(session!=null && session.isOpen()){
        		session.close();
        	}
        }
		return object;
	}

	public List<Object> list(String hql) throws Exception {
		Session session=null;
        Transaction tx=null;
        List<Object> list=null;
        try{
        	session=getSession();
        	tx=session.beginTransaction();
        	Query query=session.createQuery(hql);
        	list=query.list();
        	
        	tx.commit();
        }catch(Exception e){
        	if(tx!=null){
        		tx.rollback();
        	}
        	throw new RuntimeException(e.getMessage());
        }finally{
        	if(session!=null && session.isOpen()){
        		session.close();
        	}
        }
		return list;
	}

	public void save(Object object) throws Exception {
		Session session=null;
        Transaction tx=null;
        try{
        	session=getSession();
        	tx=session.beginTransaction();
        	session.save(object);
        	tx.commit();
        }catch(Exception e){
        	if(tx!=null){
        		tx.rollback();
        	}
        	throw new RuntimeException(e.getMessage());
        }finally{
        	if(session!=null&&session.isOpen()){
        		session.close();
        	}
        }

	}

	public void update(Object object) throws Exception {
		Session session=null;
        Transaction tx=null;
        try{
        	session=getSession();
        	tx=session.beginTransaction();
        	session.merge(object);
        	tx.commit();
        }catch(Exception e){
        	if(tx!=null){
        		tx.rollback();
        	}
        	throw new RuntimeException(e.getMessage());
        }finally{
        	if(session!=null && session.isOpen()){
        		session.close();
        	}
        }
	}
	
	

	public List<Object> list(String hql, Object... obj) throws Exception {
		Session session=null;
        Transaction tx=null;
        List<Object> list=null;
        try{
        	session=getSession();
        	tx=session.beginTransaction();
        	Query query=session.createQuery(hql);
        	for(int i=0;i<obj.length;i++){
        		query.setParameter(i, obj[i]);
        	}
        	list=query.list();
        	tx.commit();
        }catch(Exception e){
        	if(tx!=null){
        		tx.rollback();
        	}
        	throw new RuntimeException(e.getMessage());
        }finally{
        	if(session!=null && session.isOpen()){
        		session.close();
        	}
        }
		return list;
	}

	public Object get1(Object obj,int i){
		Session session=null;
        Transaction tx=null;
		try{
			if(session==null || session.isOpen()==false){
				session=getSession();
			}
            tx=session.beginTransaction(); //��������
            obj=session.get(obj.getClass(), i);
            tx.commit();  //�ύ����
		}catch (Exception e) {
			e.printStackTrace();
			if (tx!=null){
				tx.rollback(); //�����ύʧ�ܻع�
			}
		}finally{
        	if(session!=null && session.isOpen()){
        		session.close();
        	}
        }
		return obj;
	}
    
	public List<?> cutPage(String pageHql, int firstResult, int MaxResults) {
		Session session = null;
		Transaction tx = null;
		List<Object> list = null;
		try {
			session = getSession();
			tx = session.beginTransaction();
			Query query = session.createQuery(pageHql);
			query.setFirstResult(firstResult);
			query.setMaxResults(MaxResults);
			list = query.list();
			tx.commit();

		} catch (Exception e) {
			if (tx != null) {
				tx.rollback();
			}

			throw new RuntimeException(e.getMessage());
		} finally {
			if (session != null && session.isOpen()) {
				session.close();
			}
		}
		return list;

	}

	public int getCountPage(String pageHql, int MaxResults) {

		int count = 0;
		int countPage = 0;
		Session session = null;
		Transaction tx = null;

		List<Object> list = null;
		try {
			session = getSession();
			tx = session.beginTransaction();
			Query query = session.createQuery(pageHql);
			count = query.list().size();

			countPage = (count % MaxResults == 0) ? count / MaxResults : count
					/ MaxResults + 1;
			tx.commit();

		} catch (Exception e) {
			if (tx != null) {
				tx.rollback();
			}
			throw new RuntimeException(e.getMessage());
		} finally {
			if (session != null && session.isOpen()) {
				session.close();
			}
		}
		
		return countPage;

	}


	public int getCountPage(String pageHql, int MaxResults,Object... parameters) throws Exception {
		int count = 0;
		int countPage = 0;
		Session session = null;
		Transaction tx = null;
		try {
			session = getSession();
			tx = session.beginTransaction();
			Query query = session.createQuery(pageHql);
			for (int i = 0; i < parameters.length; i++) {
				query.setParameter(i, parameters[i]);
			}
			count = ((Integer) query.iterate().next()).intValue();

			countPage = (count % MaxResults == 0) ? count / MaxResults : count
					/ MaxResults + 1;
			tx.commit();

		} catch (Exception e) {
			if (tx != null) {
				tx.rollback();
			}
			throw new RuntimeException(e.getMessage());
		} finally {
			if (session != null && session.isOpen()) {
				session.close();
			}
		}
		
		return countPage;
	}

	
	public List<?> cutPage(String pageHql, int firstResult, int MaxResults,
			Object... parameters) throws Exception {
		Session session = null;
		Transaction tx = null;
		List<Object> list = null;
		try {
			session = getSession();
			tx = session.beginTransaction();
			Query query = session.createQuery(pageHql);
			for (int i = 0; i < parameters.length; i++) {
				query.setParameter(i, parameters[i]);
			}
			query.setFirstResult(firstResult);
			query.setMaxResults(MaxResults);

			list = query.list();
			tx.commit();

		} catch (Exception e) {
			if (tx != null) {
				tx.rollback();
			}

			throw new RuntimeException(e.getMessage());
		} finally {
			if (session != null && session.isOpen()) {
				session.close();
			}
		}
		return list;
	}

	@Override
	public void executeUpdate(String hql, String[] parameters) {
		Session session = null;
		Transaction tx = null;

		List<Object> list = null;
		try {
			session = getSession();
			tx = session.beginTransaction();

			Query query = session.createQuery(hql);
			if (parameters != null && parameters.length > 0) {
				for (int i = 0; i < parameters.length; i++) {
					query.setString(i, parameters[i]);
				}
			}
			query.executeUpdate();

			tx.commit();

		} catch (Exception e) {
			if (tx != null) {
				tx.rollback();
			}

			throw new RuntimeException(e.getMessage());
		} finally {
			if (session != null && session.isOpen()) {
				session.close();
			}
		}

	}

	public int getTotalCount(String pageHql) {
		int count = 0;
		Session session = null;
		Transaction tx = null;
		try {
			session = getSession();
			tx = session.beginTransaction();
			Query query = session.createQuery(pageHql);
			count = query.list().size();
			tx.commit();

		} catch (Exception e) {
			if (tx != null) {
				tx.rollback();
			}
			throw new RuntimeException(e.getMessage());
		} finally {
			if (session != null && session.isOpen()) {
				session.close();
			}
		}
		return count;
	}
	public String getOneResultString(String hql) {
		Session session=null;
        Transaction tx=null;
        String a;
        try{
        	session=getSession();
        	tx=session.beginTransaction();
        	a=(String) session.createQuery(hql).uniqueResult();
        	tx.commit();
        }catch(Exception e){
        	if(tx!=null){
        		tx.rollback();
        	}
        	throw new RuntimeException(e.getMessage());
        }finally{
        	if(session!=null && session.isOpen()){
        		session.close();
        	}
        }
        return a;
	}

	

}
	

