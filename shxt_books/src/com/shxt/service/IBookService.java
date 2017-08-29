package com.shxt.service;

import java.util.List;
import java.util.Set;

import com.shxt.bo.Books;
import com.shxt.bo.Dict;
import com.shxt.model.Bar;
import com.shxt.model.QueryBook;
import com.shxt.util.PageBean;

public interface IBookService {
   public void AddBook(Books b);
   public void SearchBook();
   public void DeleteBook(int i);
   public void AlterBook(Books b);
   public Books getBook(int x);
   public Set<Dict> getAllType();
   public Set<Dict> getAllPub();
   public List<Object> getRankBook();
   public PageBean query(PageBean pageBean,QueryBook query) throws Exception; 
   public List<Bar> getBar();
}
