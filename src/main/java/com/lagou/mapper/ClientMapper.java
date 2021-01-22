package com.lagou.mapper;

import com.lagou.domain.Client;
import org.apache.ibatis.annotations.Param;

import java.math.BigInteger;
import java.util.List;

public interface ClientMapper {
    //查询所有客户
    public List<Client> selAllClient();
    //通过客户编号和客户名查询单个客户
    public Client selSignClient(@Param("client_num") String client_num,@Param("client_name") String client_name);
    //根据id查询单个客户
    public Client findClientById(int client_id);
    //模糊查询客户
    public List<Client> selLikeSignClient(String client_name);
    //动态查询客户
    public List<Client> findClientIf(Client client);
    //员工与客户的一对多查询
    public List<Client> selEmpAndClientByEmpid(int emp_id);
    //增加客户
    public int addClient(Client client);
    //修改客户
    public int editClient(Client client);
    //删除客户
    public int deleteClient(String client_num);
}
