package com.shxt.service;

import java.util.List;
import java.util.Set;

import com.shxt.bo.Dict;
import com.shxt.bo.Readers;
import com.shxt.model.Bar;
import com.shxt.model.Role;

public interface IReaderService {
   public Readers checkReader(Role role);
   public void AddReader(Readers r);
   public void AlterReader(Readers r);
   public void DeleteReader();
   public Readers SearchReader(String s);
   public String judgeSame(String s);
   public Set<Dict> getAllSdept();
   public String judgeExist(String s);
   public List<Object> getOweBooks(String s);
   public int handleOweMoney(String s);
   public void handleOwe(String s);
   public List<Bar> getPie();
   public String judegePw(String s1,String s2);
}
