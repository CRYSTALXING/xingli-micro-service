package com.xingli.common.entity.vo;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CommonResult {

    public static String SUCCESS_MESSAGE = "操作成功";
    public static String ERROR_MESSAGE = "操作成功";

    public static Integer SUCCESS_CODE = 200;
    public static Integer ERROR_CODE = 500;


    private boolean result;
    private Integer code;
    private String message;
    private Object data;

    public CommonResult(boolean result,Integer code, String message) {
        this.result = result;
        this.code = code;
        this.message = message;
    }

    public CommonResult(boolean result,Integer code, String message, Object data) {
        this.result = result;
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public static CommonResult ok(Object data) {
        return new CommonResult(true,SUCCESS_CODE, SUCCESS_MESSAGE, data);
    }

    public static CommonResult ok() {
        return new CommonResult(true,SUCCESS_CODE, SUCCESS_MESSAGE);
    }

    public static CommonResult error() {
        return new CommonResult(false,ERROR_CODE, ERROR_MESSAGE);
    }

}