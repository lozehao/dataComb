package com.xiand.control;

import com.xiand.entity.MemberGiftLog;
import com.xiand.entity.ProductBean;
import com.xiand.server.interFace.MemberGiftDataServer;
import com.xiand.server.interFace.ProductResourceServer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class ProductResourceController {
    @Resource
    public ProductResourceServer productResourceServer;


    @ResponseBody
    @RequestMapping("/seeProductResource.go")
    public List<ProductBean> seeProductResource(){
        return productResourceServer.seeProductResource();
    }
    @RequestMapping("/addProductResource.go")
    public String addProductResource(@RequestParam("resourceFile") MultipartFile[] files, @RequestParam("resourceName")String resourceName) throws Exception {
        String result="error";
        if (resourceName!=null&&resourceName.length()>0){
            if(files!=null&&files.length>0){
                result= productResourceServer.addProductResource(files,resourceName);
            }
        }
        if(result.equals("success")){
            return "redirect:home.jsp";
        }

        return "redirect:index.jsp";

        /*上传测试
        InputStream inputStream=file.getInputStream();
        String name=file.getOriginalFilename();
        OutputStream outputStream=new FileOutputStream(new File("/Users/luofubing/Downloads/test/"+name));
        byte buffer[]=new byte[inputStream.available()];
        while(inputStream.read(buffer)!=-1){
            outputStream.write(buffer);
        }
        outputStream.close();
        inputStream.close();
        //uploadServ.saveFile(file,request,new ArrayList<String>());
        return null;*/
    }

}
