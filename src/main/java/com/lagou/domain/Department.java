package com.lagou.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.List;


@Data
public class Department implements Serializable {
    private static final long serialVersionUID = 5625488659923227956L;
    private int dept_id;//部门id
     private String dept_num;//部门编号
     private String dept_name; //部门名
     private String dept_duty;//部门职责
     private String dept_major_name;//部门主管名
     private String dept_major_telephone;//部门主管电话
     private String dept_major_email;//部门主管email
     private String dept_telephone;
     private String remark;
     private List<Emp> empList;

    @Override
    public String toString() {
        return "Department{" +
                "dept_id='" + dept_id + '\'' +
                ", dept_num='" + dept_num + '\'' +
                ", dept_name='" + dept_name + '\'' +
                ", dept_duty='" + dept_duty + '\'' +
                ", dept_major_name='" + dept_major_name + '\'' +
                ", dept_major_telephone='" + dept_major_telephone + '\'' +
                ", dept_major_email='" + dept_major_email + '\'' +
                ", dept_telephone='" + dept_telephone + '\'' +
                ", remark='" + remark + '\'' +
                ", empList=" + empList +
                '}';
    }
}
