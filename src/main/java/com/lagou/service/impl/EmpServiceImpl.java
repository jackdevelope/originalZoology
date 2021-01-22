package com.lagou.service.impl;

import com.lagou.domain.Emp;
import com.lagou.mapper.EmpMapper;
import com.lagou.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * 员工service层实现
 */
@Service
public class EmpServiceImpl implements EmpService {
    @Autowired
    private EmpMapper empMapper;

    @Override
    //查询所有员工
    public List<Emp> allEmpInformation() {
        List<Emp> emps = empMapper.selAllEmp();
        return emps;
    }

    //通过员工编号和员工姓名查询单个员工
    @Override
    public Emp signEmpInformation(String emp_num, String emp_name) {
        return empMapper.selSignEmp(emp_num,emp_name);
    }
    //通过ID查询单个员工
    @Override
    public Emp signEmpByIdInformation(int emp_id) {
        return empMapper.selEmpById(emp_id);
    }
    //模糊查询员工
    @Override
    public List<Emp> likeSignEmpInformation(String emp_name) {
        String empName="%"+emp_name+"%";
        return empMapper.selLikeSignEmp(empName);
    }
    //多条件查询员工
    @Override
    public List<Emp> selEmpManyCondition(Emp emp) {
        return empMapper.selEmpIf(emp);
    }
    //员工与客户的一对多查询
    @Override
    public List<Emp> selEmpAndClient() {
        return empMapper.selEmpAndClient();
    }
    //增加员工
    @Override
    public int addEmp(Emp emp) {
        return empMapper.addEmp(emp);
    }
    //修改员工
    @Override
    public int editEmp(Emp emp) {
        return empMapper.editEmp(emp);
    }
    //删除员工
    @Override
    public int deleteEmp(String emp_num) {
        return empMapper.deleteEmp(emp_num);
    }
}
