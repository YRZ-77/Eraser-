package com.eraser.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.eraser.server.pojo.Admin;
import com.eraser.server.pojo.RespBean;
import com.eraser.server.pojo.Role;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author Eraser
 */
public interface IAdminService extends IService<Admin> {
/**
   * 登录返回token
   * @param username
   * @param password
   * @return
   */
    RespBean login(String username, String password, String code, HttpServletRequest request);
/**
   * 根据用户名获取用户
   * @param username
   */
    Admin getAdminByUserName(String username);
    /**
     * 根据用户id或者权限列表
     * @param adminId
     * @return
     */
    List<Role> getRoles(Integer adminId);

    /**
     * 获取所有操作员
     * @param keywords
     * @return
     */
    List<Admin> getAllAdmins(String keywords);

    /**
     * 更新操作员角色
     * @param adminId
     * @param rids
     * @return
     */
    RespBean updateAdminRole(Integer adminId, Integer[] rids);

    /**
     * 更新用户密码
     * @param oldPass
     * @param pass
     * @param adminId
     * @return
     */
    RespBean updateAdminPassword(String oldPass, String pass, Integer adminId);
}
