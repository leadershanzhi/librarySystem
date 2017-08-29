package com.shxt.service;

import java.util.List;

import com.shxt.bo.Lends;
import com.shxt.model.QueryLend;
import com.shxt.util.PageBean;

public interface ILendService {
   public void AddLend(String id);
   public void backLend(String id);
   public int insertLend(String a,String b);
   public void AlterLend();
   public void DeleteLend();
   public void judgeOver();
   public PageBean query(PageBean pageBean,QueryLend query) throws Exception;
   public List<Object> getListre(String cz); 
}
