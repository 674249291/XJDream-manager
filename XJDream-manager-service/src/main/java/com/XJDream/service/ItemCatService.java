package com.XJDream.service;

import com.XJDream.common.EasyUITreeNode;

import java.util.List;

/**
 * Created by Administrator on 2017/9/12.
 */
public interface ItemCatService {

    List<EasyUITreeNode> getItemCatList(long parentId);
}
