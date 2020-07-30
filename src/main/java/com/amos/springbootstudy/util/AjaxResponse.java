package com.amos.springbootstudy.util;


import lombok.Data;

@Data
public class AjaxResponse {

    private int code;  //200 400 500
    private String msg;
    private Object data;


    public static AjaxResponse ajaxResponseStatus(String msg, Object data){
        AjaxResponse ajax=new AjaxResponse();
        ajax.setCode(200);
        ajax.setMsg(msg);
        ajax.setData(data);
        return  ajax;
    }


    public static AjaxResponse ajaxResponseSuccess(){
        AjaxResponse ajax=new AjaxResponse();
        ajax.setCode(200);
        ajax.setMsg("请求响应成功！");
        return  ajax;
    }

}
