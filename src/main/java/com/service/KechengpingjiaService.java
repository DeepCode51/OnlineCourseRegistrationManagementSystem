package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KechengpingjiaEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.KechengpingjiaVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.KechengpingjiaView;


/**
 * 课程评价
 *
 * @author 
 * @email 
 * @date 2020-12-30 13:44:50
 */
public interface KechengpingjiaService extends IService<KechengpingjiaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KechengpingjiaVO> selectListVO(Wrapper<KechengpingjiaEntity> wrapper);
   	
   	KechengpingjiaVO selectVO(@Param("ew") Wrapper<KechengpingjiaEntity> wrapper);
   	
   	List<KechengpingjiaView> selectListView(Wrapper<KechengpingjiaEntity> wrapper);
   	
   	KechengpingjiaView selectView(@Param("ew") Wrapper<KechengpingjiaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KechengpingjiaEntity> wrapper);
   	
}

