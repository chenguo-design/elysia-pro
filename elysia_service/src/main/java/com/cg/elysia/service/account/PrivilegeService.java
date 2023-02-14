package com.cg.elysia.service.account;

import java.util.List;

public interface PrivilegeService {
    List<Long> getRolesId(Long accountId);
}
