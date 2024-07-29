package org.example.infrastructure.persistent.po;

import lombok.Data;
import java.util.Date;

@Data
public class Strategy {
  private Long id;
  private Long  strategy_id;
  private String strategy_desc;
  private Date  create_time;
  private Date update_time;
}
