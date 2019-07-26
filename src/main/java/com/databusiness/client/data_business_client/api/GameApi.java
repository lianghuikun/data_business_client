package com.databusiness.client.data_business_client.api;

import com.databusiness.client.data_business_client.api.fullback.GameApiFailure;
import com.databusiness.client.data_business_client.domain.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.FeignClientsConfiguration;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * <pre>
 * TODO
 * Created by lianghuikun on 2019-06-07.
 * </pre>
 *
 * @author lianghuikun
 */
@FeignClient(name = "databusiness", configuration = FeignClientsConfiguration.class, fallback = GameApiFailure.class)
public interface GameApi {

    @RequestMapping(value = "/api/v1/databusiness/getAllList", method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE,
            consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    Result getAllList();

}
