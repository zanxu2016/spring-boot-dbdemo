package me.xuzan.dbdemo.dao;

import me.xuzan.dbdemo.domain.po.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
