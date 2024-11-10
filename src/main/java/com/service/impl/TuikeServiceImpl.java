package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.TuikeDao;
import com.entity.TuikeEntity;
import com.service.TuikeService;
import com.entity.vo.TuikeVO;
import com.entity.view.TuikeView;

@Service("tuikeService")
public class TuikeServiceImpl extends ServiceImpl<TuikeDao, TuikeEntity> implements TuikeService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TuikeEntity> page = this.selectPage(
                new Query<TuikeEntity>(params).getPage(),
                new EntityWrapper<TuikeEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TuikeEntity> wrapper) {
		  Page<TuikeView> page =new Query<TuikeView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<TuikeVO> selectListVO(Wrapper<TuikeEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TuikeVO selectVO(Wrapper<TuikeEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TuikeView> selectListView(Wrapper<TuikeEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TuikeView selectView(Wrapper<TuikeEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
