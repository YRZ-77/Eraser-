package com.eraser.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.eraser.server.pojo.Menu;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Eraser
 * @since 2021-05-26
 */
public interface IMenuService extends IService<Menu> {
    /**
     * 通过用户id获取菜单列表
     * @return
     */
    List<Menu> getMenusByAdminId();
    /**
     * 通过角色获取菜单列表
     * @return
     */
    List<Menu> getMenusWithRole();
    /**
     * 查询所有菜单
     * @return
     */
    List<Menu> getALLMenus();
}
