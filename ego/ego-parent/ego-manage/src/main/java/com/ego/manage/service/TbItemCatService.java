package com.ego.manage.service;

import com.ego.commons.pojo.EasyUiTree;

import java.util.List;

/**
 * @author 辉
 * 座右铭:坚持总能遇见更好的自己!
 * @date 2019/7/13
 */
public interface TbItemCatService {


    /**
     * 根据父菜单查询所有的子菜单
     * @param pid 父菜单的id
     * @return 子菜单的id
     */
    List<EasyUiTree> show(long pid);

}
