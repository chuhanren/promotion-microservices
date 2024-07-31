package org.example.infrastructure.persistent.repository;

import org.example.domain.strategy.model.entity.StrategyAwardEntity;
import org.example.domain.strategy.repository.IStrategyRepository;
import org.example.infrastructure.persistent.dao.IStrategyAwardDao;
import org.example.infrastructure.persistent.po.StrategyAward;
import org.example.infrastructure.persistent.redis.IRedisService;
import org.example.types.common.Constants;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

public class StrategyRepository implements IStrategyRepository {
  @Resource
  private IStrategyAwardDao strategyAwardDao;
  @Resource
  private IRedisService redisService;

  @Override
  public List<StrategyAwardEntity> queryStrategyAwardList(Long strategyId) {
    String cacheKey = Constants.RedisKey.STRATEGY_AWARD_KEY + strategyId;
    // first to retrieve from cache
    List<StrategyAwardEntity> strategyAwardEntities = redisService.getValue(cacheKey);
    if (strategyAwardEntities != null && !strategyAwardEntities.isEmpty()) return strategyAwardEntities;

    //retrieve from database, but not stored as the entity
    List<StrategyAward> strategyAwards = strategyAwardDao.queryStrategyAwardListByStrategyId(strategyId);
    strategyAwardEntities = new ArrayList<>(strategyAwards.size());

    for(StrategyAward strategyAward : strategyAwards) {

    }

    return null;
  }
}
