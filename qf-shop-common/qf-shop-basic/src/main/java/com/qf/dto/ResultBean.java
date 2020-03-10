package com.qf.dto;

import java.io.Serializable;

public class ResultBean implements Serializable {

    private int errno;

    //结果的数据
    private Object data;

    //具体的信息
    private String message;

    //成功
    public static ResultBean success(){
        ResultBean resultBean = new ResultBean();
        resultBean.setErrno(0);
        resultBean.setData(null);
        resultBean.setMessage("success");
        return resultBean;
    }

    //成功  带具体信息
    public static ResultBean success(String message){
        ResultBean resultBean = new ResultBean();
        resultBean.setErrno(0);
        resultBean.setData(null);
        resultBean.setMessage(message);
        return resultBean;
    }

    public static ResultBean success(Object data){
        ResultBean resultBean = new ResultBean();
        resultBean.setErrno(0);
        resultBean.setData(data);
        resultBean.setMessage("success");
        return resultBean;
    }

    public static ResultBean success(Object data, String message){
        ResultBean resultBean = new ResultBean();
        resultBean.setErrno(0);
        resultBean.setData(data);
        resultBean.setMessage(message);
        return resultBean;
    }

    //失败
    public static ResultBean error(){
        ResultBean resultBean = new ResultBean();
        resultBean.setErrno(1);
        resultBean.setData(null);
        resultBean.setMessage("error");
        return resultBean;
    }

    public static ResultBean error(String message){
        ResultBean resultBean = new ResultBean();
        resultBean.setErrno(1);
        resultBean.setData(null);
        resultBean.setMessage(message);
        return resultBean;
    }

    public int getErrno() {
        return errno;
    }

    public void setErrno(int errno) {
        this.errno = errno;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
