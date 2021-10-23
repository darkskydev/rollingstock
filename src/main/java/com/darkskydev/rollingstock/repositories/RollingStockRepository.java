package com.darkskydev.rollingstock.repositories;

import java.util.List;

import com.darkskydev.rollingstock.entities.RollingStockEntity;

import org.springframework.data.repository.CrudRepository;

public interface RollingStockRepository extends CrudRepository<RollingStockEntity, Long> {

  List<RollingStockEntity> findByReportingmark(String reportingmark);

  RollingStockEntity findById(long id);

  List<RollingStockEntity> findAll();
}
