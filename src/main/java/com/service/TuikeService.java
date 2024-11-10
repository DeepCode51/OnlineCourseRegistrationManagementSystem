package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TuikeEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TuikeVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TuikeView;


/**
 * 退课
 *
 * @author 
 * @email 
 * @date 2020-12-30 13:44:50
 */
public interface TuikeService extends IService<TuikeEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TuikeVO> selectListVO(Wrapper<TuikeEntity> wrapper);
   	
   	TuikeVO selectVO(@Param("ew") Wrapper<TuikeEntity> wrapper);
   	
   	List<TuikeView> selectListView(Wrapper<TuikeEntity> wrapper);
   	
   	TuikeView selectView(@Param("ew") Wrapper<TuikeEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TuikeEntity> wrapper);
   	
}

