/*
 * MarzbanAPI
 * Unified GUI Censorship Resistant Solution Powered by Xray
 *
 * OpenAPI spec version: 0.7.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.api;

import io.swagger.client.model.HTTPValidationError;
import io.swagger.client.model.SubscriptionUserResponse;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for SubscriptionApi
 */
@Ignore
public class SubscriptionApiTest {

    private final SubscriptionApi api = new SubscriptionApi();

    /**
     * User Get Usage
     *
     * Fetches the usage statistics for the user within a specified date range.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void userGetUsageTest() throws Exception {
        String token = null;
        String start = null;
        String end = null;
        Object response = api.userGetUsage(token, start, end);

        // TODO: test validations
    }
    /**
     * User Subscription
     *
     * Provides a subscription link based on the user agent (Clash, V2Ray, etc.).
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void userSubscriptionTest() throws Exception {
        String token = null;
        String userAgent = null;
        Object response = api.userSubscription(token, userAgent);

        // TODO: test validations
    }
    /**
     * User Subscription Info
     *
     * Retrieves detailed information about the user&#x27;s subscription.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void userSubscriptionInfoTest() throws Exception {
        String token = null;
        SubscriptionUserResponse response = api.userSubscriptionInfo(token);

        // TODO: test validations
    }
    /**
     * User Subscription With Client Type
     *
     * Provides a subscription link based on the specified client type (e.g., Clash, V2Ray).
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void userSubscriptionWithClientTypeTest() throws Exception {
        String clientType = null;
        String token = null;
        String userAgent = null;
        Object response = api.userSubscriptionWithClientType(clientType, token, userAgent);

        // TODO: test validations
    }
}
