package com.amos.springbootstudy.controller;

import com.amos.springbootstudy.model.Article;
import com.amos.springbootstudy.util.AjaxResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;

@Slf4j
@RestController
@RequestMapping("/test")
public class ActicleRustFulController {


    //接口信息
   // @ApiOperation(value = "添加文章", notes="添加新的文章", tags="Article", httpMethod = "POST")
    //参数详情
    //@ApiImplicitParams()
    //接口响应详情
    //@ApiResponses()
    //根据article id查询文章  get查询
   @RequestMapping(value = "articles/{id}",method = RequestMethod.GET)
    public AjaxResponse getArticle(@PathVariable("id") String id, HttpServletResponse response, HttpServletRequest httpRequest){

        Article article=Article.builder()
                .id(1)
                .author("amos")
                .content("test")
                .creatTime(new Date())
                .title("t1").build();

        log.info("artcile:" +article);


        return AjaxResponse.ajaxResponseStatus("相应请求成功！",article);
    }



    //新增article id  post查询
    @RequestMapping(value = "articles",method = RequestMethod.POST)
    public AjaxResponse saveArticle(@RequestBody Article article){

        log.info("文章添加成功："+article.toString());

        return AjaxResponse.ajaxResponseSuccess();
    }


    //修改article id  put修改
    @RequestMapping(value = "articles",method = RequestMethod.PUT)
    public AjaxResponse updateArticle(@PathVariable("id") String id){
        if(StringUtils.isEmpty(id)){
            log.error("文章id为空：",new NullPointerException());
        }
        log.info("文章添加成功："+id);

        return AjaxResponse.ajaxResponseSuccess();
    }



    //删除article id  delete 删除
    @RequestMapping(value = "articles",method = RequestMethod.DELETE)
    public AjaxResponse deleteArticle(@PathVariable("id") String id){
        if(StringUtils.isEmpty(id)){
            log.error("文章id为空：",new NullPointerException());
        }
        log.info("文章删除成功："+id);

        return AjaxResponse.ajaxResponseSuccess();
    }

}
