package com.lagou.service;

import com.lagou.domain.Client;

import java.math.BigInteger;
import java.util.List;
/**
 * 客户service层
 */
public interface ClientService {
    //查询所有客户
    public List<Client> allClientInformation();
    //通过客户编号和客户名查询客户
    public Client signClientInformation(String client_num,String client_name);
    //通过ID查询单个客户
    public Client signClientByIdInformation(int client_id);
    //模糊查询客户
    public List<Client> likeSignClientInformation(String client_name);
    //多条件查询客户
    public List<Client> findClientManyCondition(Client client);
    //增加客户
    public int addClient(Client client);
    //修改客户
    public int editClient(Client client);
    //删除客户
    public int deleteClient(String client_num);

}
