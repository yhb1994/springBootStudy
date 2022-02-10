package com.example.springbootstudybase.mybatis.page;

import com.baomidou.mybatisplus.core.metadata.OrderItem;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.commons.collections.MapUtils;
import org.apache.commons.lang.StringUtils;

import java.util.Map;

/**
 * 自定义分页属性封装
 * Created by yhb on 2022-02-10
 */
public class MyPage<T> {

    private long pageCount = 1;

    private long limitCount = 10;

    private final String PAGE_NAME = "page";

    private final String LIMIT_NAME = "limit";

    private final String DESC_NAME = "desc";

    private final String ASC_NAME = "asc";

    private final String SEPARATOR = ",";

    public Page<T> getPage(Map<String, Object> map) {
        //分页数据
        pageCount = MapUtils.getLongValue(map, PAGE_NAME, pageCount);
        limitCount = MapUtils.getLongValue(map, LIMIT_NAME, limitCount);
        Page<T> page = new Page<>(pageCount, limitCount);

        //排序正序,倒序 防止SQL注入（因为排序是通过拼接SQL实现排序的，会有SQL注入风险）
        //需要对特殊字符做校验 比如";",删库的词汇
        String asc = MapUtils.getString(map, ASC_NAME, "");
        String desc = MapUtils.getString(map, DESC_NAME, "");
        if (StringUtils.isNotBlank(asc)) {
            page.addOrder(OrderItem.ascs(asc.split(SEPARATOR)));
        }
        if (StringUtils.isNotBlank(desc)) {
            page.addOrder(OrderItem.descs(desc.split(SEPARATOR)));
        }
        return page;
    }


}
