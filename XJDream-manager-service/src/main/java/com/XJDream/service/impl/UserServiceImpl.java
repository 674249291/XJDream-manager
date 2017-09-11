package com.XJDream.service.impl;

import com.XJDream.mapper.TbUserMapper;
import com.XJDream.pojo.TbContentCategoryExample;
import com.XJDream.pojo.TbItemDescExample;
import com.XJDream.pojo.TbUser;
import com.XJDream.pojo.TbUserExample;
import com.XJDream.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by xiongjun on 2017/9/11.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private TbUserMapper tbUserMapper;

    @Override
    public TbUser getUserById(Long id) {
        TbUserExample tbUserExample = new TbUserExample();
        //创建查询条件,是使用模板来做增删改查
        TbUserExample.Criteria criteria = tbUserExample.createCriteria();
        criteria.andIdEqualTo(id);
        List<TbUser> list = tbUserMapper.selectByExample(tbUserExample);
        if(list != null && list.size() > 0){
            return list.get(0);
        }
        return null;
    }
}
