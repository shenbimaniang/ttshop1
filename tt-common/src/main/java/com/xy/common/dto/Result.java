package com.xy.common.dto;

import java.util.List;

/**
 * 专门用于easyui的datagrid通用分页类(响应参数)
 * User: 。。。
 * Date: 2017/10/18
 * Time: 17:04
 * Version:V1.0
 */
public class Result<T> {
    private long total;
    private List<T> rows;

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }
}
