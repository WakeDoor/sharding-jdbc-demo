package com.zhazhahui.web.service.impl;

import java.util.List;

import com.zhazhahui.web.model.LoveRecord;
import com.zhazhahui.web.dao.LoveRecordMapper;

import org.springframework.stereotype.Service;
import com.zhazhahui.web.service.LoveRecordService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author ZhaYongchao
 * @PackageName com.zhazhahui.web.service.impl
 * @Description
 * @create 2020-07-12 20:17
 */
@Service
public class LoveRecordServiceImpl implements LoveRecordService {

    @Autowired
    private LoveRecordMapper loveRecordMapper;

    @Override
    public List<LoveRecord> selectAll() {
        return loveRecordMapper.selectAll();
    }

    @Override
    public Long newLoveRecord(LoveRecord loveRecord) {
        return loveRecordMapper.newLoveRecord(loveRecord);
    }
}
