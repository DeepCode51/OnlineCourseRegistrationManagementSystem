package com.entity.view;

import com.entity.TuikeEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 退课
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2020-12-30 13:44:50
 */
@TableName("tuike")
public class TuikeView  extends TuikeEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public TuikeView(){
	}
 
 	public TuikeView(TuikeEntity tuikeEntity){
 	try {
			BeanUtils.copyProperties(this, tuikeEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
