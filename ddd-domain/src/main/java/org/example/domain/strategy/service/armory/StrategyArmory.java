package org.example.domain.strategy.service.armory;

import lombok.extern.slf4j.Slf4j;
import org.example.domain.strategy.model.entity.StrategyAwardEntity;
import org.example.domain.strategy.repository.IStrategyRepository;
import org.example.domain.strategy.service.armory.IStrategyArmory;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class StrategyArmory implements IStrategyArmory {
  private IStrategyRepository repository;
  @Override
  public void assemblyLotteryStrategy(Long strategyId) {
    // 1. search for strategy settings
    List<StrategyAwardEntity> strategyAwardEntities = repository.queryStrategyAwardList(strategyId);
  }
}
