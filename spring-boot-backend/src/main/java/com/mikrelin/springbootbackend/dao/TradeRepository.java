package com.mikrelin.springbootbackend.dao;

import com.mikrelin.springbootbackend.entity.Trade;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TradeRepository extends JpaRepository<Trade, Integer> {

    List<Trade> findByUserId(int userId);
}
