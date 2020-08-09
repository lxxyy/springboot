/*
 * Copyright (c) 2020. zhanghan_java@163.com All Rights Reserved.
 * 项目名称：Spring Boot实战解决高并发数据入库: Redis 缓存+MySQL 批量入库
 * 类名称：RedisConfig.java
 * 创建人：张晗
 * 联系方式：zhanghan_java@163.com
 * 开源地址: https://github.com/dangnianchuntian/springboot
 * 博客地址: https://zhanghan.blog.csdn.net
 */

package com.zhanghan.zhnearbypeople.service;


import com.zhanghan.zhnearbypeople.controller.request.ListNearByPeopleRequest;
import com.zhanghan.zhnearbypeople.controller.request.PostGeoRequest;

public interface GeoService {


    Object postGeo(PostGeoRequest postArticleViewsRequest);

    Object listNearByPeople(ListNearByPeopleRequest listNearByPeopleRequest);

}
