package com.eraser.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.eraser.server.pojo.Role;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Eraser
 * @since 2021-05-26
 */
@Repository
public interface RoleMapper extends BaseMapper<Role> {
    /**
     * 根据用户id获取权限列表
     * @param adminId
     * @return
     */
    List<Role> getRoles(Integer adminId);
}
