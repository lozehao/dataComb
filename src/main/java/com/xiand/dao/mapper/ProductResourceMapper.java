package com.xiand.dao.mapper;

import com.xiand.entity.MemberGiftLog;
import com.xiand.entity.ProductBean;

import java.util.List;

public interface ProductResourceMapper {
    public List<ProductBean> seeProductResource();
    public void addProductResource(ProductBean productBean);
}
