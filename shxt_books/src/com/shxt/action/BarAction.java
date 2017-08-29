package com.shxt.action;

import java.awt.Font;
import java.util.List;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.title.LegendTitle;
import org.jfree.chart.title.TextTitle;
import org.jfree.data.category.DefaultCategoryDataset;

import com.shxt.model.Bar;
import com.shxt.service.IBookService;
import com.shxt.service.impl.BookServiceImpl;
import com.shxt.util.BaseAction;
public class BarAction extends BaseAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final Font font = new Font("simsun",Font.ITALIC,22);   
	   
	/**  
     * 图表需要的数据  
     * 对于柱状图来说，建立的数据就像Map一样  
     * @return 封装好的画柱状图的数据集对象  
     */  
	
	private static DefaultCategoryDataset getDataset(){ 
		IBookService ibs=new BookServiceImpl();
        DefaultCategoryDataset  dataset = new DefaultCategoryDataset();  
        List<Bar> barlist=ibs.getBar();
        for(int i=0;i<barlist.size();i++){
        	Bar b=barlist.get(i);
        	dataset.setValue(b.getRatio(),b.getName(),b.getName()); 
        }
        return dataset;   
    } 
	/**  
     * 控制图表的各个显示细节，准备chart对象，要注意的就是设置各个部分的Font  
     * 而返回的JFreeChart对象就是各种各样的统计图表，现在返回的是柱状图  
     * @return 准备好了的JFreeChart对象  
     */ 
	public JFreeChart getChart(){   
        final DefaultCategoryDataset dataset = getDataset();   
        JFreeChart chart = ChartFactory.createBarChart3D("各类图书所占百分比图","图书类别","百分比",   
                dataset,   
                PlotOrientation.VERTICAL,   
                true,   
                false,   
                false   
            );   
           
        chart.setTitle(new TextTitle("各类图书所占百分比图",font));   
           
        //重新设置图例的字体，保证汉字的显示   
        LegendTitle legend = chart.getLegend();   
        legend.setItemFont(font);   
           
        //设置X轴坐标上的文字的字体   
        chart.getCategoryPlot().getDomainAxis().setTickLabelFont(font);   
        //设置X轴坐标标题的字体   
        chart.getCategoryPlot().getDomainAxis().setLabelFont(font);   
           
        //设置Y轴坐标上的文字的字体   
        chart.getCategoryPlot().getRangeAxis().setTickLabelFont(font);   
        //设置Y轴坐标标题的字体   
        chart.getCategoryPlot().getRangeAxis().setLabelFont(font);   
           
        return chart;   
    }      
}
