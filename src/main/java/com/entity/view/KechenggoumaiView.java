package com.entity.view;

import com.entity.KechenggoumaiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 课程购买
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2020-12-30 13:44:50
 */
@TableName("kechenggoumai")
public class KechenggoumaiView  extends KechenggoumaiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public KechenggoumaiView(){
	}
 
 	public KechenggoumaiView(KechenggoumaiEntity kechenggoumaiEntity){
 	try {
			BeanUtils.copyProperties(this, kechenggoumaiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
