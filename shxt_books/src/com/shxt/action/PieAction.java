package com.shxt.action;


import java.awt.Font;
import java.util.List;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.title.LegendTitle;
import org.jfree.chart.title.TextTitle;
import org.jfree.data.general.DefaultPieDataset;

import com.shxt.model.Bar;
import com.shxt.service.IReaderService;
import com.shxt.service.impl.ReaderServiceImpl;
import com.shxt.util.BaseAction;
/**  
 * 图表实际上分以下部分  
 * 1、图表标题部分  
 * 2、实际统计图部分  
 * 3、图表图例部分  
 * 着重强调，所有涉及到汉字的部分，必须重新设置字体，否则显示乱码  
 *  plot.setLabelFont(new Font("simsun",Font.ITALIC,14));  
 * 否则item的标题会出现中文乱码问题  
 */  
public class PieAction extends BaseAction {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final Font font = new Font("simsun",Font.ITALIC,22);   
   
	  /**  
     * 图表需要的数据  
     * 对于饼图来说，建立的数据就像Map一样  
     * @return 封装好的画pie图的数据集对象  
     */ 
	private static DefaultPieDataset getDataset(){   
        DefaultPieDataset dataset = new DefaultPieDataset(); 
        IReaderService irs=new ReaderServiceImpl();
        List<Bar> pielist=irs.getPie();
        for(int i=0;i<pielist.size();i++){
        	Bar b=pielist.get(i);
        	dataset.setValue(b.getName(),b.getRatio()); 
        } 
        return dataset;   
    }
	/**  
     * 控制图表的各个显示细节，准备chart对象，要注意的就是设置各个部分的Font  
     * 而返回的JFreeChart对象就是各种各样的统计图表，现在返回的是饼图  
     * @return 准备好了的JFreeChart对象  
     */   

    public JFreeChart getChart(){   
        final DefaultPieDataset dataset = getDataset();   
        JFreeChart chart = ChartFactory.createPieChart("四海管理系统读者分析",   
                dataset,   
                true,//是否有标题   
                false,//是否有悬浮提示   
                false//是否有连接   
            );   
           
        chart.setTitle(new TextTitle("四海管理系统读者分析",font));   
           
        //重新设置图例的字体，保证汉字的显示   
        LegendTitle legend = chart.getLegend();   
        legend.setItemFont(font);   
           
        //重新设置统计表对象的字体，保证汉字的显示   
        PiePlot plot = (PiePlot) chart.getPlot();   
        plot.setBackgroundAlpha(0.9f);   
        plot.setLabelFont(font);   
           
        return chart;   
    }
}
