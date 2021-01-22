package com.lagou.service.impl;

import com.lagou.domain.Client;
import com.lagou.mapper.ClientMapper;
import com.lagou.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.List;

/**
 * 员工service层实现
 */
@Service
public class ClientServiceImpl implements ClientService {
    @Autowired
    ClientMapper clientMapper;
    @Override
    //查询所有客户
    public List<Client> allClientInformation() {
       return clientMapper.selAllClient();
    }
    @Override
    //通过客户编号和客户名查询客户
    public Client signClientInformation(String client_num, String client_name) {
        return clientMapper.selSignClient(client_num,client_name);
    }
    @Override
    //通过ID查询单个客户
    public Client signClientByIdInformation(int client_id) {
        return clientMapper.findClientById(client_id);
    }
    @Override
    //模糊查询客户
    public List<Client> likeSignClientInformation(String client_name) {
        String clientName="%"+client_name+"%";
        return clientMapper.selLikeSignClient(clientName);
    }
    //多条件查询客户
    @Override
    public List<Client> findClientManyCondition(Client client) {
        return clientMapper.findClientIf(client);
    }

    @Override
    //增加客户
    public int addClient(Client client) {
        return clientMapper.addClient(client);
    }

    @Override
    //修改客户
    public int editClient(Client client) {
     return clientMapper.editClient(client);
    }

    @Override
    //删除客户
    public int deleteClient(String client_num) {
        System.out.println("success");
       return clientMapper.deleteClient(client_num);
    }
}
