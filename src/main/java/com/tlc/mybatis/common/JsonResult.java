package com.tlc.mybatis.common;

import com.github.pagehelper.Page;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class JsonResult {
    public static Object success() {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("code", GlobalResultStatus.SUCCESS.getCode());
        map.put("data", "");
        return map;
    }

    public static Object success(Object data) {
        Map<String, Object> map = new LinkedHashMap<String, Object>();
        map.put("code", GlobalResultStatus.SUCCESS.getCode());
        map.put("data", data);
        return map;
    }

    public static Object success(Map<String, Object> data) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("code", GlobalResultStatus.SUCCESS.getCode());
        map.put("data", data);
        return map;
    }

    public static Object success(List<?> list) {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("code", GlobalResultStatus.SUCCESS.getCode());
        map.put("data", list);
        return map;
    }

    public static Object success(Page<?> page) {
        return success(page, new Pager(page));
    }

    public static Object success(List<?> list, int count) {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("code", GlobalResultStatus.SUCCESS.getCode());
        map.put("count", count);
        map.put("data", list);
        return map;
    }

    public static Object success(List<?> list, Pager pager) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("rows", list);
        map.put("total", pager.getTotalPages());
        map.put("page", pager.getPage());
        map.put("records", pager.getTotalRows());
        return map;
    }

    public static Object fail(ResultStatus status) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("code", status.getCode());
        map.put("msg", status.getMsg());
        return map;
    }

    public static Object fail() {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("code", GlobalResultStatus.ERROR.getCode());
        map.put("msg", GlobalResultStatus.ERROR.getMsg());
        return map;
    }

    public static Object fail(ResultStatus status, Object data) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("code", status.getCode());
        map.put("msg", status.getMsg());
        map.put("data", data);
        return map;
    }
}
