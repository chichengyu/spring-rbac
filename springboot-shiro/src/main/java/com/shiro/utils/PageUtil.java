package com.shiro.utils;


import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import com.shiro.vo.req.RolePageReqVo;
import com.shiro.vo.resp.PageVo;
import com.sun.org.apache.regexp.internal.RE;

import java.util.List;

/**
 * 分页工具类
 */
public class PageUtil {

    /**
     * 分页数据组装
     * @param pageInfo
     * @param <T>
     * @return
     */
    public static <T>PageVo<T> getPageVo(PageInfo<T> pageInfo){
        PageVo<T> pageInfoPageVo = new PageVo<T>();
        pageInfoPageVo.setTotalRows(pageInfo.getTotal());//总记录数
        pageInfoPageVo.setTotalPages(pageInfo.getPages());//总页数
        pageInfoPageVo.setPageNum(pageInfo.getPageNum());//当前第几页
        pageInfoPageVo.setPageSize(pageInfo.getPageSize());//每页记录数
        pageInfoPageVo.setCurPageSize(pageInfo.getSize());//当前页记录数
        pageInfoPageVo.setList(pageInfo.getList());//结果集
        return pageInfoPageVo;
    }
}
