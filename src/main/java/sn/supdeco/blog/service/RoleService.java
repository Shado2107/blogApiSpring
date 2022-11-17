package sn.supdeco.blog.service;

import sn.supdeco.blog.dao.RoleDao;
import sn.supdeco.blog.entity.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {

    @Autowired
    private RoleDao roleDao;

    public Role createNewRole(Role role) {
        return roleDao.save(role);
    }
}
