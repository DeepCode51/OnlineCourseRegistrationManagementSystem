package com.entity.model;

import com.entity.KechenggoumaiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 课程购买
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2020-12-30 13:44:50
 */
public class KechenggoumaiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 课程编号
	 */
	
	private String kechengbianhao;
		
	/**
	 * 课程名称
	 */
	
	private String kechengmingcheng;
		
	/**
	 * 课程类型
	 */
	
	private String kechengleixing;
		
	/**
	 * 价格
	 */
	
	private Integer jiage;
		
	/**
	 * 数量
	 */
	
	private Integer shuliang;
		
	/**
	 * 总金额
	 */
	
	private String zongjine;
		
	/**
	 * 购买日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date goumairiqi;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
		
	/**
	 * 用户名
	 */
	
	private String yonghuming;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 是否支付
	 */
	
	private String ispay;
				
	
	/**
	 * 设置：课程编号
	 */
	 
	public void setKechengbianhao(String kechengbianhao) {
		this.kechengbianhao = kechengbianhao;
	}
	
	/**
	 * 获取：课程编号
	 */
	public String getKechengbianhao() {
		return kechengbianhao;
	}
				
	
	/**
	 * 设置：课程名称
	 */
	 
	public void setKechengmingcheng(String kechengmingcheng) {
		this.kechengmingcheng = kechengmingcheng;
	}
	
	/**
	 * 获取：课程名称
	 */
	public String getKechengmingcheng() {
		return kechengmingcheng;
	}
				
	
	/**
	 * 设置：课程类型
	 */
	 
	public void setKechengleixing(String kechengleixing) {
		this.kechengleixing = kechengleixing;
	}
	
	/**
	 * 获取：课程类型
	 */
	public String getKechengleixing() {
		return kechengleixing;
	}
				
	
	/**
	 * 设置：价格
	 */
	 
	public void setJiage(Integer jiage) {
		this.jiage = jiage;
	}
	
	/**
	 * 获取：价格
	 */
	public Integer getJiage() {
		return jiage;
	}
				
	
	/**
	 * 设置：数量
	 */
	 
	public void setShuliang(Integer shuliang) {
		this.shuliang = shuliang;
	}
	
	/**
	 * 获取：数量
	 */
	public Integer getShuliang() {
		return shuliang;
	}
				
	
	/**
	 * 设置：总金额
	 */
	 
	public void setZongjine(String zongjine) {
		this.zongjine = zongjine;
	}
	
	/**
	 * 获取：总金额
	 */
	public String getZongjine() {
		return zongjine;
	}
				
	
	/**
	 * 设置：购买日期
	 */
	 
	public void setGoumairiqi(Date goumairiqi) {
		this.goumairiqi = goumairiqi;
	}
	
	/**
	 * 获取：购买日期
	 */
	public Date getGoumairiqi() {
		return goumairiqi;
	}
				
	
	/**
	 * 设置：备注
	 */
	 
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
	}
				
	
	/**
	 * 设置：用户名
	 */
	 
	public void setYonghuming(String yonghuming) {
		this.yonghuming = yonghuming;
	}
	
	/**
	 * 获取：用户名
	 */
	public String getYonghuming() {
		return yonghuming;
	}
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：是否支付
	 */
	 
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}
			
}
