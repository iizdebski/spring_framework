package com.izdebski.service.impl;


import com.izdebski.model.Account;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class AccountServiceImpl implements AccountService {

    private static Map<String, Account> map = null;

    static{
        map=new HashMap<>();
        map.put("C67669800", new Account("78278287000", "Saving Account"));
        map.put("C67669811", new Account("78278287111", "Current Account"));
    }


    @Override
    public Account getAccountByCustomerId(String customerId) throws Exception {
        if(customerId==null){
            throw new Exception("Customer Id is invalid");
        }
        Account account = null;
        Set<Map.Entry<String, Account>> entrySet=map.entrySet();
        for (Map.Entry<String, Account> entry : entrySet){
            if(entry.getKey().equals(customerId)){
                account=entry.getValue();
            }
        }
        return account;
    }
}