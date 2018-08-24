package com.xiand.server.impl;

import com.xiand.dao.mapper.ProductResourceMapper;
import com.xiand.entity.ProductBean;
import com.xiand.server.interFace.ProductResourceServer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

@Service
public class ProductResourceServerImpl implements ProductResourceServer {
    @Resource
    private ProductResourceMapper productResourceMapper;
    public List<ProductBean> seeProductResource(){
        return productResourceMapper.seeProductResource();
    }
    private static final Logger logger = LogManager.getLogger(ProductResourceServerImpl.class);
    /**
     * 功能描述   保存图片
     public static String saveFile(MultipartFile file, HttpServletRequest request,List<String> list) throws IOException {
     if (!file.isEmpty()) {
     try {
     // 保存的文件路径(如果用的是Tomcat服务器，文件会上传到\\%TOMCAT_HOME%\\webapps\\YourWebProject\\upload\\文件夹中
     // )
     String filePath = "/Users/luofubing/Downloads/test/Login.jsp"+ file.getOriginalFilename();
     System.out.println(filePath);
     list.add(file.getOriginalFilename());
     File saveDir = new File(filePath);
     if (!saveDir.getParentFile().exists())
     saveDir.getParentFile().mkdirs();

     // 转存文件
     file.transferTo(saveDir);

     return null;
     } catch (Exception e) {
     System.out.println(e);
     }
     }
     return null;
     }
     */

    public String addProductResource(MultipartFile[] files, String resourceName){
        try {
            File floder=new File("/Users/luofubing/Downloads/"+resourceName);

            if(floder.exists()){
                return "error";
            }else{
                floder.mkdir();
            }
            List<String> fileNmaeList=new ArrayList<>();
            for(MultipartFile file:files){
                InputStream inputStream=file.getInputStream();
                String filename=file.getOriginalFilename();
                fileNmaeList.add(filename);
                OutputStream outputStream=new FileOutputStream(floder+"/"+filename);
                byte[] buffer=new byte[inputStream.available()];
                while(inputStream.read(buffer)!=-1){
                    outputStream.write(buffer);
                }
                outputStream.close();
                inputStream.close();
            }
            if(fileNmaeList!=null&&fileNmaeList.size()>0){
                StringBuffer names=new StringBuffer();
                for(int i=0;i<fileNmaeList.size();i++){
                    String str=resourceName+"/"+fileNmaeList.get(i);
                    if(i>0){
                        str=","+str;
                    }
                    names.append(str);
                }
                ProductBean productBean=new ProductBean();
                productBean.setTitle(resourceName);
                productBean.setContent(names.toString());
                productResourceMapper.addProductResource(productBean);
            }
        }catch (Exception e){
            logger.error("----error:----"+e);
            return "error";
        }
        return "success";
    }
}
