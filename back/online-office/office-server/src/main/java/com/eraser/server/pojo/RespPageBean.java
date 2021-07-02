package com.eraser.server.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @ClassName RespPageBean
 * @Description 分页公共返回对象
 * @Author Eraser
 * @Date 2021/6/15 13:54
 * @Version V1.0
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RespPageBean {
    /**
     * 总条数
     */
    private Long total;
    /**
     * 数据List
     */
    private List<?> data;


}