package com.uplog.uplog.member.dao;

import com.uplog.uplog.member.model.Testcreate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestRepository extends JpaRepository<Testcreate,Long> {
}
