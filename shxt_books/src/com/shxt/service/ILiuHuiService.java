package com.shxt.service;

import java.util.List;

import com.shxt.bo.HuiFu;
import com.shxt.bo.LiuYan;

public interface ILiuHuiService {
    public void addLiuYan(LiuYan ly);
    public void addHuiFu(HuiFu hf,String id);
    public List<Object> getAllLiuYan();
    public List<Object> getSelfLiuYan();
    public void delLiuYan(String s);
}
