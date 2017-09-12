package com.XJDream.pageTest;

import com.XJDream.mapper.TbItemMapper;
import com.XJDream.pojo.TbItem;
import com.XJDream.pojo.TbItemExample;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by Administrator on 2017/9/12.
 */
public class TestPageHelper {

    @Test
    @Ignore
    public void testPageHelper() throws Exception {
        //1、获得mapper代理对象
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-*.xml");
        TbItemMapper itemMapper = applicationContext.getBean(TbItemMapper.class);
        //2、设置分页
        PageHelper.startPage(1, 30);
        //3、执行查询
        TbItemExample example = new TbItemExample();
        List<TbItem> list = itemMapper.selectByExample(example);
        //4、取分页后结果
        PageInfo<TbItem> pageInfo = new PageInfo<>(list);
        long total = pageInfo.getTotal();
        System.out.println("total:" + total);
        int pages = pageInfo.getPages();
        System.out.println("pages:" + pages);
        int pageSize = pageInfo.getPageSize();
        System.out.println("pageSize:" + pageSize);
    }
}
