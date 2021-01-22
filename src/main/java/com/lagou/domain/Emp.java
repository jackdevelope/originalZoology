package com.lagou.domain;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


@Data
public class Emp implements Serializable {
    private static final long serialVersionUID = 9000358198113606407L;
    private int  emp_id;//员工id
    private int  dept_id;//部门id
    private String  dept_name;//部门名
    private String  emp_num;//员工编号
    private String  emp_name;//员工名
    private String  emp_job;//员工岗位
    private String  emp_duty;//员工职责
    private String  emp_salary;//员工薪水
    private java.math.BigDecimal emp_working_days;//员工工作时长
    private Date    emp_join_datetime;//员工入职时间
    private String  emp_client_record;
    private java.math.BigInteger emp_client_ammount; //客户数量
    private String  emp_check;//记录员工在职考核内容及结果
    private String  emp_type;//说明是否为正式员工
    private String  emp_telephone;
    private String  emp_qq;
    private String  emp_wechat;
    private String  emp_qqemail;
    private String  emp_163email;
    private java.lang.String remark;//记录员工在职考核评价
    private List<Client> clientList;

    @Override
    public String toString() {
        return "Emp{" +
                "emp_id=" + emp_id +
                ", dept_id=" + dept_id +
                ", dept_name='" + dept_name + '\'' +
                ", emp_num='" + emp_num + '\'' +
                ", emp_name='" + emp_name + '\'' +
                ", emp_job='" + emp_job + '\'' +
                ", emp_duty='" + emp_duty + '\'' +
                ", emp_salary='" + emp_salary + '\'' +
                ", emp_working_days=" + emp_working_days +
                ", emp_join_datetime=" + emp_join_datetime +
                ", emp_client_record='" + emp_client_record + '\'' +
                ", emp_client_ammount=" + emp_client_ammount +
                ", emp_check='" + emp_check + '\'' +
                ", emp_type='" + emp_type + '\'' +
                ", emp_telephone='" + emp_telephone + '\'' +
                ", emp_qq='" + emp_qq + '\'' +
                ", emp_wechat='" + emp_wechat + '\'' +
                ", emp_qqemail='" + emp_qqemail + '\'' +
                ", emp_163email='" + emp_163email + '\'' +
                ", remark='" + remark + '\'' +
                ", clientList=" + clientList +
                '}';
    }
}
