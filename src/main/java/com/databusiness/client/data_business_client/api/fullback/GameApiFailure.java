package com.databusiness.client.data_business_client.api.fullback;

import com.databusiness.client.data_business_client.api.GameApi;
import com.databusiness.client.data_business_client.domain.Result;
import org.springframework.stereotype.Component;

/**
 * <pre>
 * TODO
 * Created by lianghuikun on 2019-06-07.
 * </pre>
 *
 * @author lianghuikun
 */
@Component
public class GameApiFailure implements GameApi {
    @Override
    public Result getAllList() {
        return Result.errorResult("sorry! service is not available");
    }
}
