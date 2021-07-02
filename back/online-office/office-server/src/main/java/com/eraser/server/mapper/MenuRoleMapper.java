package com.eraser.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.eraser.server.pojo.MenuRole;
import org.springframework.stereotype.Repository;


/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Eraser
 * @since 2021-05-26
 */
@Repository
public interface MenuRoleMapper extends BaseMapper<MenuRole> {

    /**
     * 批量更新角色菜单
     * @param rid
     * @param mids
     */
    Integer insertRecord(Integer rid, Integer... mids);
}
