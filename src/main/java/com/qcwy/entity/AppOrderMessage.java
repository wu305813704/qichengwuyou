package com.qcwy.entity;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;

/**
 * Created by KouKi on 2017/2/23.
 */

public class AppOrderMessage implements Serializable {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private int msg_id;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String job_no;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private int order_no;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private int type;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String send_time;

    public int getMsg_id() {
        return msg_id;
    }

    public void setMsg_id(int msg_id) {
        this.msg_id = msg_id;
    }

    public String getJob_no() {
        return job_no;
    }

    public void setJob_no(String job_no) {
        this.job_no = job_no;
    }

    public int getOrder_no() {
        return order_no;
    }

    public void setOrder_no(int order_no) {
        this.order_no = order_no;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getSend_time() {
        return send_time;
    }

    public void setSend_time(String send_time) {
        this.send_time = send_time;
    }
}
