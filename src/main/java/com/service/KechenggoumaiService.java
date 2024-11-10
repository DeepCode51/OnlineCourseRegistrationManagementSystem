package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KechenggoumaiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.KechenggoumaiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.KechenggoumaiView;


/**
 * 课程购买
 *
 * @author 
 * @email 
 * @date 2020-12-30 13:44:50
 */
public interface KechenggoumaiService extends IService<KechenggoumaiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KechenggoumaiVO> selectListVO(Wrapper<KechenggoumaiEntity> wrapper);
   	
   	KechenggoumaiVO selectVO(@Param("ew") Wrapper<KechenggoumaiEntity> wrapper);
   	
   	List<KechenggoumaiView> selectListView(Wrapper<KechenggoumaiEntity> wrapper);
   	
   	KechenggoumaiView selectView(@Param("ew") Wrapper<KechenggoumaiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KechenggoumaiEntity> wrapper);
   	
}

