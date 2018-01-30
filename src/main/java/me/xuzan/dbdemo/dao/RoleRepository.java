package me.xuzan.dbdemo.dao;

import me.xuzan.dbdemo.domain.po.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
