package com.zhazhahui.web.model;

import lombok.Data;

import java.util.Date;

@Data
public class LoveRecord {

    private Long id;

    private Date recordDate;

    private Integer recordLevel;

    private String description;

    private Integer isDeleted;

    private Long createBy;

    private Date createAt;

    private Long modifyBy;

    private Date modifyAt;
}