package com.lagou.controller;

import com.lagou.domain.Client;
import com.lagou.domain.Emp;
import com.lagou.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import com.lagou.utils.DateUtils;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.ParseException;
import java.util.List;

@RestController
public class EmpController {
    @Autowired
    private EmpService empService;
    //查询所有员工
    @GetMapping(value = "empSelAll")
    public List<Emp> allEmp(){
      List<Emp> emps = empService.allEmpInformation();
      return emps;
    }
    //通过员工编号和员工名查询
    @GetMapping(value = "/empSel/{emp_num}/{emp_name}")
    public Emp SignEmpInformation(@PathVariable String emp_num, @PathVariable String emp_name){
       return empService.signEmpInformation(emp_num,emp_name);
    }
    //通过员工ID查询
    @GetMapping(value = "/empSel/{emp_id}")
    public Emp signEmpById(@PathVariable int  emp_id){
        return empService.signEmpByIdInformation(emp_id);
    }
    //模糊查询员工
    @GetMapping(value = "/empSelectName/{emp_name}")
    public List<Emp> likeSignEmpInformation(@PathVariable String emp_name){
        return empService.likeSignEmpInformation(emp_name);
    }
    //多条件查询客户
    @GetMapping(value = "/empSelMoney")
    public List<Emp> findEmpMany(Emp emp){
        return empService.selEmpManyCondition(emp);
    }
    //查询相应员工的客户
    @GetMapping(value = "/selEmpAndClient")
    public List<Emp> findEmpAndClient(){
        return empService.selEmpAndClient();
    }
    //增加员工信息
   @PostMapping(value = "/empAdd")
    public int addEmpInformation() throws ParseException {
        BigDecimal emp_working_days = new BigDecimal(Double.valueOf(7.5));
        Emp emp=new Emp();
        emp.setDept_id(2);
        emp.setDept_name("销售部");
        emp.setEmp_num("XS13148LL78000");
        emp.setEmp_name("李乐");
        emp.setEmp_job("salesman");
        emp.setEmp_duty("如何将产品推销出去");
        emp.setEmp_salary("3k");
        emp.setEmp_working_days(emp_working_days);
        emp.setEmp_join_datetime(DateUtils.getDateFormart());
        emp.setEmp_client_record("李乐于2019年11月6日向王磊销售了一台洗衣机");
        BigInteger emp_client_ammount = BigInteger.valueOf(3000);
        emp.setEmp_client_ammount(emp_client_ammount);
        emp.setEmp_check("考核内容为:销售价格,产品内容,产品特征.其结果表示为可以转正");
        emp.setEmp_type("正职");
        emp.setEmp_telephone("13977810000");
        emp.setEmp_qq("3091422909");
        emp.setEmp_wechat("13977810000");
        emp.setEmp_qqemail("3091422909@.com");
        emp.setEmp_163email("13977810000@163.com");
        emp.setRemark("此员工诚实可靠");
        empService.addEmp(emp);
        return emp.getEmp_id();
    }
    //编辑员工信息
    @PutMapping(value = "/empEdit")
    public int editEmpInformation() throws ParseException {
        BigDecimal emp_working_days = new BigDecimal(Double.valueOf(9.5));
        Emp emp=new Emp();
        emp.setDept_id(2);
        emp.setEmp_id(9);
        emp.setDept_name("技术部");
        emp.setEmp_num("JS56730LG69100");
        emp.setEmp_name("刘戈");
        emp.setEmp_job("engineer");
        emp.setEmp_duty("如何安照进度完成开发任务");
        emp.setEmp_salary("8k");
        emp.setEmp_working_days(emp_working_days);
        emp.setEmp_join_datetime(DateUtils.getDateFormart());
        emp.setEmp_client_record("无");
        BigInteger emp_client_ammount = BigInteger.valueOf(0);
        emp.setEmp_client_ammount(emp_client_ammount);
        emp.setEmp_check("考核内容为:springboot的使用,微服务,分布式技术.数据库分库分表.其结果表示可以转正");
        emp.setEmp_type("正职");
        emp.setEmp_telephone("13877111000");
        emp.setEmp_qq("30914111119");
        emp.setEmp_wechat("13900810777");
        emp.setEmp_qqemail("30111992909@.com");
        emp.setEmp_163email("139778149000@163.com");
        emp.setRemark("此员工诚实可靠");
        return empService.editEmp(emp);
    }
    //删除员工信息
    @DeleteMapping(value = "/empDel/{emp_num}")
    public int delEmpInformation(@PathVariable String emp_num){
        return  empService.deleteEmp(emp_num);
    }
}
