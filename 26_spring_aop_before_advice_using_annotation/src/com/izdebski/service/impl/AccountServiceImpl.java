package com.izdebski.service.impl;

import com.izdebski.aop.aspect.Auditable;
import com.izdebski.model.Account;
import org.springframework.stereotype.Service;


@Service("accountService")
public class AccountServiceImpl implements AccountService {

    /* (non-Javadoc)
     * @see com.infotech.service.impl.AccountService#updateAccountBalance(com.infotech.model.Account, java.lang.Long)
     */
    @Auditable(Auditable.AuditDestination.DATABASE)
    @Override
    public void updateAccountBalance(Account account, Long amount){
        System.out.println("Account No:"+account.getAccountNumber()+", Amount:"+amount);
    }
}