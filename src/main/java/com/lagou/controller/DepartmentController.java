package com.lagou.controller;

import com.lagou.domain.Department;
import com.lagou.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * 部门管理controller层
 */
@RestController
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;
   //查询所有
    @GetMapping(value = "/departmentSelAll")
    public List<Department> allDepartment(){
        ModelAndView modelAndView =new ModelAndView();
        List<Department> departmentList = departmentService.allDepartmentInformation();
        return departmentList;
    }
    //通过部门编号和部门名查询
    @GetMapping(value = "/departmentSel/{dept_num}/{dept_name}")
    public Department SignDepartmentInformation(@PathVariable String dept_num,@PathVariable String dept_name){
        return departmentService.SignDepartmentInformation(dept_num,dept_name);
    }
    //通过部门ID查询
    @GetMapping(value = "/departmentSel/{dept_id}")
    public Department signDepartmentById(@PathVariable int dept_id){
        return departmentService.signDepartmentByIdInformation(dept_id);
    }
    //模糊查询部门
    @GetMapping(value = "/departmentSelect/{dept_name}")
    public List<Department> likeSignDepartmentInformation(@PathVariable String dept_name){
        return departmentService.LikeSignDepartmentInformation(dept_name);
    }
    //多条件查询客户
    @GetMapping(value = "/departmentSelMoney")
    public List<Department> findDepartmentMany(Department department){
        return departmentService.findEmpIf(department);
    }
    //查询相应部门的员工
    @GetMapping(value = "/selDepartmentAndEmp")
    public List<Department> findDepartmentAndEmp(){
        return departmentService.findDepartmentAndEmp();
    }
    //增加部门信息
   @PostMapping(value = "/departmentAdd")
   public int addDepartmentInformation(){
        Department department=new Department();
        department.setDept_num("JS98456");
        department.setDept_name("技术部");
        department.setDept_duty("技术开发");
        department.setDept_major_name("王伟");
        department.setDept_major_telephone("123989802345");
        department.setDept_major_email("123989802345@163.com");
        department.setDept_telephone("400-400-4003");
        department.setRemark("专为技术服务");
       departmentService.addDepartment(department);
        return department.getDept_id();
    }
    //编辑部门信息
    @PutMapping(value = "/departmentEdit")
    public int editDepartmentInformation(){
        Department department=new Department();
        department.setDept_id(4);
        department.setDept_num("CG984956");
        department.setDept_name("采购部");
        department.setDept_duty("采购物资");
        department.setDept_major_name("王里");
        department.setDept_major_telephone("123989809001");
        department.setDept_major_email("123989802000@163.com");
        department.setDept_telephone("400-400-4005");
        department.setRemark("保障物资充沛");
       return departmentService.editDepartment(department);
    }
    //删除部门信息
    @DeleteMapping(value = "/departmentDel/{dept_num}")
    public int delDepartmentInformation(@PathVariable String dept_num){
       return  departmentService.deleteDepartment(dept_num);
    }
}
