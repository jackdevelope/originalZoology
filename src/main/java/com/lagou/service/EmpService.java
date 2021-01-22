package com.lagou.service;

import com.lagou.domain.Emp;

import java.util.List;
/**
 * 员工service层
 */
public interface EmpService {
    //查询所有员工
    public List<Emp> allEmpInformation();
    //通过员工编号和员工姓名查询单个员工
    public Emp signEmpInformation(String emp_num, String emp_name);
    //通过ID查询单个员工
    public Emp signEmpByIdInformation(int emp_id);
    //模糊查询员工
    public List<Emp> likeSignEmpInformation(String emp_name);
    //多条件查询员工
    public List<Emp> selEmpManyCondition(Emp emp);
    //员工与客户的一对多查询
    public List<Emp> selEmpAndClient();
    //增加员工
    public int addEmp(Emp emp);
    //修改员工
    public int editEmp(Emp emp);
    //删除员工
    public int deleteEmp(String emp_num);

}
