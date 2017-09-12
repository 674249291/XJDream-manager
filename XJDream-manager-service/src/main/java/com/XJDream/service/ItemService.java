package com.XJDream.service;

import com.XJDream.common.EasyUIDataGridResult;
import com.XJDream.pojo.TbItem;

/**
 * Created by Administrator on 2017/9/12.
 */
public interface ItemService {

    TbItem getItemById(Long itemId);

    EasyUIDataGridResult getItemList(int page, int rows);
}
