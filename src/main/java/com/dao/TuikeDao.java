package com.dao;

import com.entity.TuikeEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TuikeVO;
import com.entity.view.TuikeView;


/**
 * 退课
 * 
 * @author 
 * @email 
 * @date 2020-12-30 13:44:50
 */
public interface TuikeDao extends BaseMapper<TuikeEntity> {
	
	List<TuikeVO> selectListVO(@Param("ew") Wrapper<TuikeEntity> wrapper);
	
	TuikeVO selectVO(@Param("ew") Wrapper<TuikeEntity> wrapper);
	
	List<TuikeView> selectListView(@Param("ew") Wrapper<TuikeEntity> wrapper);

	List<TuikeView> selectListView(Pagination page,@Param("ew") Wrapper<TuikeEntity> wrapper);
	
	TuikeView selectView(@Param("ew") Wrapper<TuikeEntity> wrapper);
	
}
