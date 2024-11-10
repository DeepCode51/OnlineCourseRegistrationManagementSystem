package com.dao;

import com.entity.KechengpingjiaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KechengpingjiaVO;
import com.entity.view.KechengpingjiaView;


/**
 * 课程评价
 * 
 * @author 
 * @email 
 * @date 2020-12-30 13:44:50
 */
public interface KechengpingjiaDao extends BaseMapper<KechengpingjiaEntity> {
	
	List<KechengpingjiaVO> selectListVO(@Param("ew") Wrapper<KechengpingjiaEntity> wrapper);
	
	KechengpingjiaVO selectVO(@Param("ew") Wrapper<KechengpingjiaEntity> wrapper);
	
	List<KechengpingjiaView> selectListView(@Param("ew") Wrapper<KechengpingjiaEntity> wrapper);

	List<KechengpingjiaView> selectListView(Pagination page,@Param("ew") Wrapper<KechengpingjiaEntity> wrapper);
	
	KechengpingjiaView selectView(@Param("ew") Wrapper<KechengpingjiaEntity> wrapper);
	
}
