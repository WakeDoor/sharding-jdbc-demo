package com.zhazhahui.web.dao;

import java.util.List;

import com.zhazhahui.web.model.LoveRecord;
import org.apache.ibatis.annotations.Param;

public interface LoveRecordMapper {
    List<LoveRecord> selectAll();

    Long newLoveRecord(@Param("loveRecord") LoveRecord loveRecord);
}