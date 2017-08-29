package com.shxt.service;

import java.util.List;

import com.shxt.bo.Messages;

public interface IMessageService {
   public void addMessage(Messages m);
   public List<Object> listMessage();
   public Messages showMessage(String mid);
   public void changePoint(String mid);
}
