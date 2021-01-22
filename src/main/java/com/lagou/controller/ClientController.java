package com.lagou.controller;

import com.lagou.domain.Client;
import com.lagou.domain.Emp;
import com.lagou.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.math.BigInteger;
import java.util.List;
@RestController
public class ClientController {
    @Autowired
    private ClientService clientService;
    //查询所有客户
    @GetMapping(value = "/clientSelAll")
    public List<Client> allClient(){
       return clientService.allClientInformation();
     }
    //通过客户编号和客户名查询
    @GetMapping(value = "/clientSel/{client_num}/{client_name}")
    public Client signClientInformation(@PathVariable String client_num,@PathVariable String client_name){
        return clientService.signClientInformation(client_num,client_name);
    }
    //通过客户ID查询客户
    @GetMapping(value = "/clientSel/{client_id}")
    public Client signClientById(@PathVariable int client_id){
        return clientService.signClientByIdInformation(client_id);
    }
    //模糊查询客户
    @GetMapping(value = "/clientSelname/{client_name}")
    public List<Client> likeSignClientInformation(@PathVariable String client_name){
        return clientService.likeSignClientInformation(client_name);
    }
    //多条件查询客户
    @GetMapping(value = "/clientSelMoney")
    public List<Client> findClientMany(Client client){
        return clientService.findClientManyCondition(client);
    }
    //增加部门客户
    @PostMapping(value = "/clientAdd")
    public int addClientInformation(){
        Client client=new Client();
        client.setEmp_id(789);
        client.setEmp_name("小王");
        client.setClient_num("34568");
        client.setClient_name("tom");
        client.setClient_job("Electrical engineer");
        client.setClient_telephone("18686548107");
        client.setClient_address("鸿博锦绣花园17-1-401");
        client.setClient_bank_account("62096 8870 3004 3655 839");
        client.setRemark("重要客户");
        clientService.addClient(client);
        return client.getClient_id();
    }
    //编辑部门客户
    @PutMapping(value = "/clientEdit")
    public int editClientInformation(){
        Client client=new Client();
        client.setClient_id(5);
        client.setEmp_id(789);
        client.setEmp_name("小李");
        client.setClient_num("34988");
        client.setClient_name("tom");
        client.setClient_job("Electrical engineer");
        client.setClient_telephone("13943725688");
        client.setClient_address("鸿博锦绣花园17-1-402");
        client.setClient_bank_account("6216 8819 3005 3657 889");
        client.setRemark("已将变为普通客户");
        return clientService.editClient(client);
    }
    //删除部门客户
    @DeleteMapping(value = "/clientDel/{client_num}")
    public int delClientInformation(@PathVariable String client_num){
        return clientService.deleteClient(client_num);
    }
}
