package com.lagou.service.impl;

import com.lagou.domain.Department;
import com.lagou.mapper.DepartmentMapper;
import com.lagou.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 部门service层实现
 */
@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    private DepartmentMapper departmentMapper;
    @Override
    //查询所有部门
    public List<Department> allDepartmentInformation() {
        List<Department> departments = departmentMapper.selAllDpartment();
        return departments;
    }
    @Override
    //通过部门ID查询单个部门
    public Department signDepartmentByIdInformation(int dept_id) {
       return departmentMapper.selDepartmentById(dept_id);
    }
    @Override
    //通过部门编码和部门名查询单个部门
    public Department SignDepartmentInformation(String dept_num,String dept_name) {
        return departmentMapper.selSignDepartment(dept_num,dept_name);
    }
    @Override
    //模糊查询部门
    public List<Department> LikeSignDepartmentInformation(String dept_name) {
        String deptName="%"+dept_name+"%";
        return departmentMapper.selLikeSignDepartment(deptName);
    }
    @Override
    //多条件动态查询客户
    public List<Department> findEmpIf(Department department) {
        return departmentMapper.selDepartmentIf(department);
    }
    @Override
    //部门与员工的一对多查询
    public List<Department> findDepartmentAndEmp() {
        return departmentMapper.selDepartmentAndEmp();
    }

    @Override
    //增加部门
    public int addDepartment(Department department) {
        return departmentMapper.addDepartment(department);
    }
    @Override
    //修改部门
    public int editDepartment(Department department) {
        return departmentMapper.editDepartment(department);
    }
    @Override
    //删除部门
    public int deleteDepartment(String dept_num) {
        return departmentMapper.deleteDpartment(dept_num);
    }
}
