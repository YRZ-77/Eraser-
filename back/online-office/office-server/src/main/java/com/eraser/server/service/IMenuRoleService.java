package com.eraser.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.eraser.server.pojo.MenuRole;
import com.eraser.server.pojo.RespBean;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Eraser
 * @since 2021-05-26
 */
public interface IMenuRoleService extends IService<MenuRole> {

    /**
     * 更新角色菜单
     * @param rid
     * @param mids
     * @return
     */
    RespBean updateMenuRole(Integer rid, Integer[] mids);
}
