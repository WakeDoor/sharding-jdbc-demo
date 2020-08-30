package com.zhazhahui.web.service;

import java.util.List;

import com.zhazhahui.web.model.LoveRecord;

/**
 * @author ZhaYongchao
 * @PackageName com.zhazhahui.web.service.impl
 * @Description
 * @create 2020-07-12 20:17
 */
public interface LoveRecordService {

    List<LoveRecord> selectAll();

    Long newLoveRecord(LoveRecord loveRecord);
}
