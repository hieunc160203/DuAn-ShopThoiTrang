package com.tam.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tam.entity.Account;

public interface AccountDAO extends JpaRepository<Account, String>{
}
