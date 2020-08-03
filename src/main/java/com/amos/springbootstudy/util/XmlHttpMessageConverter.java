package com.amos.springbootstudy.util;

import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.converter.AbstractHttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;

import java.io.IOException;

/**
 * 接口传参、返回自定义格式化，springboot默认为json
 */
public class XmlHttpMessageConverter extends AbstractHttpMessageConverter<AjaxResponse> {
    @Override
    protected boolean supports(Class<?> clazz) {
        return (AjaxResponse.class==clazz);
    }

    @Override
    protected AjaxResponse readInternal(Class<? extends AjaxResponse> clazz, HttpInputMessage inputMessage) throws IOException, HttpMessageNotReadableException {
        return null;
    }

    @Override
    protected void writeInternal(AjaxResponse ajaxResponse, HttpOutputMessage outputMessage) throws IOException, HttpMessageNotWritableException {

        outputMessage.getBody();
    }
}
