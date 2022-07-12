package com.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@NoArgsConstructor
@Accessors(chain = true)
@AllArgsConstructor
@Getter
public class UserGuarantee {

  private String userId;
  private String house;
  private String car;
  private String shares;
  private String bond;

}
