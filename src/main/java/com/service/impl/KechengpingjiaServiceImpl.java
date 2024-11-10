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


import com.dao.KechengpingjiaDao;
import com.entity.KechengpingjiaEntity;
import com.service.KechengpingjiaService;
import com.entity.vo.KechengpingjiaVO;
import com.entity.view.KechengpingjiaView;

@Service("kechengpingjiaService")
public class KechengpingjiaServiceImpl extends ServiceImpl<KechengpingjiaDao, KechengpingjiaEntity> implements KechengpingjiaService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<KechengpingjiaEntity> page = this.selectPage(
                new Query<KechengpingjiaEntity>(params).getPage(),
                new EntityWrapper<KechengpingjiaEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<KechengpingjiaEntity> wrapper) {
		  Page<KechengpingjiaView> page =new Query<KechengpingjiaView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<KechengpingjiaVO> selectListVO(Wrapper<KechengpingjiaEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public KechengpingjiaVO selectVO(Wrapper<KechengpingjiaEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<KechengpingjiaView> selectListView(Wrapper<KechengpingjiaEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public KechengpingjiaView selectView(Wrapper<KechengpingjiaEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
