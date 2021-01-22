package com.lagou.service;

import com.lagou.domain.Department;
import com.lagou.domain.Emp;

import java.util.List;

/**
 * 部门service层
 */
public interface DepartmentService {
    //查询所有部门
    public List<Department> allDepartmentInformation();
    //通过部门编码和部门名查询单个部门
    public Department SignDepartmentInformation(String dept_num,String dept_name);
    //通过ID查询单个部门
    public Department signDepartmentByIdInformation(int dept_id);
    //模糊查询部门
    public List<Department> LikeSignDepartmentInformation(String dept_name);
    //多条件动态查询客户
    public List<Department> findEmpIf(Department department);
    //部门与员工的一对多查询
    public List<Department> findDepartmentAndEmp();
    //增加部门
    public int addDepartment(Department department);
    //修改部门
    public int editDepartment(Department department);
    //删除部门
    public int deleteDepartment(String dept_num);
}
