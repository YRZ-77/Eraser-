package com.eraser.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.eraser.server.mapper.NationMapper;
import com.eraser.server.pojo.Nation;
import com.eraser.server.service.INationService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Eraser
 * @since 2021-05-26
 */
@Service
public class NationServiceImpl extends ServiceImpl<NationMapper, Nation> implements INationService {

}
