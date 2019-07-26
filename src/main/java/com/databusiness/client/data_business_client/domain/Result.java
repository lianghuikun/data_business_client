package com.databusiness.client.data_business_client.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <pre>
 * TODO
 * Created by lianghuikun on 2019-06-07.
 * </pre>
 *
 * @author lianghuikun
 */
@Data
@AllArgsConstructor
public class Result {

    /**
     * 成功
     */
    public static final int SUCCESS = 1;
    /**
     * 警告
     */
    public static final int WARN = 2;
    /**
     * 失败
     */
    public static final int ERROR = 0;

    /**
     * 成功消息
     */
    public static final String SUCCESS_MSG = "操作成功！";
    /**
     * 失败消息
     */
    public static final String ERROR_MSG = "操作失败！";

    /**
     * 结果状态码(可自定义结果状态码) 1:操作成功 0:操作失败
     */
    private int code;
    /**
     * 错误编码
     */
    private int errorCode;

    private int errorcode;
    /**
     * 响应结果描述
     */
    private String msg;
    /**
     * 其它数据信息（比如跳转地址）
     */
    private Object obj;

    public Result() {
        super();
    }

    /**
     * @param code 结果状态码(可自定义结果状态码或者使用内部静态变量 1:操作成功 0:操作失败 2:警告)
     * @param msg  响应结果描述
     * @param obj  其它数据信息（比如跳转地址）
     */
    public Result(int code, String msg, Object obj) {
        super();
        this.code = code;
        this.msg = msg;
        this.obj = obj;
    }

    /**
     * @param code 结果状态码(可自定义结果状态码或者使用内部静态变量 1:操作成功 0:操作失败 2:警告)
     * @param msg  响应结果描述
     * @param obj  其它数据信息（比如跳转地址）
     */
    public Result(int code, int errorCode, String msg, Object obj) {
        super();
        this.code = code;
        this.errorCode = errorCode;
        this.errorcode = errorCode;
        this.msg = msg;
        this.obj = obj;
    }

    /**
     * 默认操作成功结果.
     */
    public static Result successResult() {
        return new Result(SUCCESS, SUCCESS_MSG, null);
    }

    /**
     * 默认操作成功结果.结果集
     */
    public static Result successResult(Object obj) {
        return new Result(SUCCESS, SUCCESS_MSG, obj);
    }

    /**
     * 默认操作失败结果.
     */
    public static Result errorResult() {
        return new Result(ERROR, ERROR_MSG, null);
    }

    /**
     * 默认操作失败结果.返回错误原因
     */
    public static Result errorResult(String msg) {
        return new Result(ERROR, msg, null);
    }

    /**
     * 默认操作失败结果.返回错误编码、原因
     */
    public static Result errorResult(int code, String msg) {
        return new Result(ERROR, code, msg, null);
    }

    public static Result errorResult(int code, int errorCode, String msg) {
        return new Result(code, errorCode, msg, null);
    }

}
