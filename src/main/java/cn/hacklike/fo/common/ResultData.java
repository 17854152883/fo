package cn.hacklike.fo.common;

import com.baomidou.mybatisplus.extension.api.R;

import javax.xml.ws.Response;
import java.io.Serializable;

public class ResultData<T> implements Serializable {

    private static final long serialVersionUID = -5419762347791117681L;

    private String code = "0";

    private String msg = "success";

    private Integer count = 0;

    private T data;


    public ResultData() {
    }

    public static <T> ResultData<T> newInstance() {
        return new ResultData();
    }

    public static <T> ResultData<T> newInstance(T data) {
        ResultData resultData = new ResultData();
        resultData.setData(data);
        return resultData;
    }



    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
