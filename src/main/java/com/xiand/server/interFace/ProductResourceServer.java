package com.xiand.server.interFace;

import com.xiand.entity.MemberGiftLog;
import com.xiand.entity.ProductBean;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface ProductResourceServer {
    public List<ProductBean> seeProductResource();
    public String addProductResource(MultipartFile[] files, String resourceName) throws IOException;
}
