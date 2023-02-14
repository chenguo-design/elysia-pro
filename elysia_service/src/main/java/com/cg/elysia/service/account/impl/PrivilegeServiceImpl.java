package com.cg.elysia.service.account.impl;

import com.cg.elysia.service.account.PrivilegeService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PrivilegeServiceImpl implements PrivilegeService {
    @Override
    public List<Long> getRolesId(Long accountId) {
        return null;
    }
}
