package com.databusiness.client.data_business_client.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <pre>
 * TODO
 * Created by lianghuikun on 2019-06-07.
 * </pre>
 * @author lianghuikun
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Game {
    private Integer id;
    private String name;
    private String description;
}
