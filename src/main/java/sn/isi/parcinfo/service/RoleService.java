package sn.isi.parcinfo.service;

import org.springframework.stereotype.Service;
import sn.isi.parcinfo.entities.Role;

import java.util.List;

@Service
public class RoleService implements IRoleService{
    private IRoleService iRoleService;
    private IRoleService;

    public RoleService(IRoleService iRoleService) {
        this.iRoleService = iRoleService;
    }

    @Override
    public Role save(Role role) {
        return iRoleService.save(role);
    }

    @Override
    public Role update(Role role) {
        Role rol = iRoleService.findById(role.getId()).get();
        rol.setNom(role.getNom());
        return iRoleService.save(role);

    }

    @Override
    public void remove(Role role) {
        iRoleService.delete(iRoleService.findBy(Id).get());
    }

    @Override
    public Role get(int id) {

        return iRoleService.delete(iRoleService.findBy(Id).get());;
    }

    @Override
    public List<Role> getAll() {

        return iRoleService.findAll();
    }

    @Override
    public IRoleService findById(int id) {
        return null;
    }

    @Override
    public Role get() {
        
        return null;
    }

    @Override
    public List<Role> findAll() {
        return iRoleService.findAll();
    }
}
