package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.KechenggoumaiEntity;
import com.entity.view.KechenggoumaiView;

import com.service.KechenggoumaiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 课程购买
 * 后端接口
 * @author 
 * @email 
 * @date 2020-12-30 13:44:50
 */
@RestController
@RequestMapping("/kechenggoumai")
public class KechenggoumaiController {
    @Autowired
    private KechenggoumaiService kechenggoumaiService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,KechenggoumaiEntity kechenggoumai, HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			kechenggoumai.setYonghuming((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<KechenggoumaiEntity> ew = new EntityWrapper<KechenggoumaiEntity>();
		PageUtils page = kechenggoumaiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, kechenggoumai), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,KechenggoumaiEntity kechenggoumai, HttpServletRequest request){
        EntityWrapper<KechenggoumaiEntity> ew = new EntityWrapper<KechenggoumaiEntity>();
		PageUtils page = kechenggoumaiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, kechenggoumai), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( KechenggoumaiEntity kechenggoumai){
       	EntityWrapper<KechenggoumaiEntity> ew = new EntityWrapper<KechenggoumaiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( kechenggoumai, "kechenggoumai")); 
        return R.ok().put("data", kechenggoumaiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(KechenggoumaiEntity kechenggoumai){
        EntityWrapper< KechenggoumaiEntity> ew = new EntityWrapper< KechenggoumaiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( kechenggoumai, "kechenggoumai")); 
		KechenggoumaiView kechenggoumaiView =  kechenggoumaiService.selectView(ew);
		return R.ok("查询课程购买成功").put("data", kechenggoumaiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") String id){
        KechenggoumaiEntity kechenggoumai = kechenggoumaiService.selectById(id);
        return R.ok().put("data", kechenggoumai);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") String id){
        KechenggoumaiEntity kechenggoumai = kechenggoumaiService.selectById(id);
        return R.ok().put("data", kechenggoumai);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody KechenggoumaiEntity kechenggoumai, HttpServletRequest request){
    	kechenggoumai.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(kechenggoumai);

        kechenggoumaiService.insert(kechenggoumai);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody KechenggoumaiEntity kechenggoumai, HttpServletRequest request){
    	kechenggoumai.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(kechenggoumai);

        kechenggoumaiService.insert(kechenggoumai);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody KechenggoumaiEntity kechenggoumai, HttpServletRequest request){
        //ValidatorUtils.validateEntity(kechenggoumai);
        kechenggoumaiService.updateById(kechenggoumai);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        kechenggoumaiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<KechenggoumaiEntity> wrapper = new EntityWrapper<KechenggoumaiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			wrapper.eq("yonghuming", (String)request.getSession().getAttribute("username"));
		}

		int count = kechenggoumaiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
