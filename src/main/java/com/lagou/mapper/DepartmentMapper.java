package com.lagou.mapper;

import com.lagou.domain.Client;
import com.lagou.domain.Department;
import com.lagou.domain.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;
/**
 * 部门mapper层
 */
public interface DepartmentMapper {
    //查询所有部门
    public List<Department> selAllDpartment();
    //根据id查询单个部门
    public Department selDepartmentById(int dept_id);
    //通过部门id和部门姓名查询单个部门
    public Department selSignDepartment(@Param("dept_num") String dept_num,@Param("dept_name") String dept_name);
    //模糊查询部门
    public List<Department> selLikeSignDepartment(String dept_name);
    //多条件动态查询部门
    public List<Department> selDepartmentIf(Department department);
    //部门与员工的一对多查询
    public List<Department> selDepartmentAndEmp();
    //增加部门
    public int addDepartment(Department department);
    //修改部门
    public int editDepartment(Department department);
    //删除部门
    public int deleteDpartment(String dept_num);

}
