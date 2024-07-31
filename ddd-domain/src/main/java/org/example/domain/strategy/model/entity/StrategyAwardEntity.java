package org.example.domain.strategy.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class StrategyAwardEntity {
  private Long id;
  private Long strategyId;
  private Integer awardCount;
  /** 奖品库存剩余 */
  private Integer awardCountSurplus;
  /** 奖品中奖概率 */
  private BigDecimal awardRate;
}