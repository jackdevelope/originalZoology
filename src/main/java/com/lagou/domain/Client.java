package com.lagou.domain;

import lombok.Data;

import java.io.Serializable;
import java.math.BigInteger;


@Data
public class Client implements Serializable {
    private static final long serialVersionUID = -7904575622322777939L;
    private Integer client_id;//客户号
    private Integer  emp_id; //员工号
    private String  emp_name;//员工名
    private String  client_num;//客户编号
    private String  client_name;//客户名
    private String  client_job;
    private String  client_telephone;
    private String  client_address;
    private String client_bank_account;//银行账号
    private java.lang.String  remark;

    @Override
    public String toString() {
        return "Client{" +
                "client_id=" + client_id +
                ", emp_id=" + emp_id +
                ", emp_name='" + emp_name + '\'' +
                ", client_num='" + client_num + '\'' +
                ", client_name='" + client_name + '\'' +
                ", client_job='" + client_job + '\'' +
                ", client_telephone='" + client_telephone + '\'' +
                ", client_address='" + client_address + '\'' +
                ", client_bank_account='" + client_bank_account + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }
}
