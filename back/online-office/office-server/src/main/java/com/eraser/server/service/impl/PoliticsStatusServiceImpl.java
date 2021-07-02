package com.eraser.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.eraser.server.mapper.PoliticsStatusMapper;
import com.eraser.server.pojo.PoliticsStatus;
import com.eraser.server.service.IPoliticsStatusService;
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
public class PoliticsStatusServiceImpl extends ServiceImpl<PoliticsStatusMapper, PoliticsStatus> implements IPoliticsStatusService {

}
