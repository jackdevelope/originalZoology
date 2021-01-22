package com.lagou.mapper;

import com.lagou.domain.Client;
import com.lagou.domain.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 部门员工管理mapper层
 */
public interface EmpMapper {
    //查询所有员工
    public List<Emp> selAllEmp();
    //通过员工编号和员工姓名查询单个员工
    public Emp selSignEmp(@Param("emp_num") String emp_num, @Param("emp_name") String emp_name);
    //根据id查询单个员工
    public Emp selEmpById(int emp_id);
    //模糊查询员工
    public List<Emp> selLikeSignEmp(String emp_name);
    //多条件动态查询客户
    public List<Emp> selEmpIf(Emp emp);
    //员工与客户的一对多查询
    public List<Emp> selEmpAndClient();
    //部门与员工的一对多查询
    public List<Emp> selDepartmentAndEmpByDepId(int dept_id);
    //增加员工
    public int addEmp(Emp emp);
    //修改员工
    public int editEmp(Emp emp);
    //删除员工
    public int deleteEmp(String emp_num);

}
