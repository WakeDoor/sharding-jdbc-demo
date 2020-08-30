package com.zhazhahui.web.controller;

import java.util.List;

import com.zhazhahui.web.model.LoveRecord;
import com.zhazhahui.web.service.LoveRecordService;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author ZhaYongchao
 * @PackageName com.zhazhahui.web.controller
 * @Description
 * @create 2020-07-12 20:17
 */
@RestController
@RequestMapping("/love_record")
public class LoveRecordController {

    @Autowired
    private LoveRecordService loveRecordService;

    @GetMapping("/getAllLoveRecord")
    public List<LoveRecord> selectAll(){
        return loveRecordService.selectAll();
    }

    @PostMapping("/newLoveRecord")
    public Long newLoveRecord(@RequestBody LoveRecord loveRecord){
        return loveRecordService.newLoveRecord(loveRecord);
    }
}
