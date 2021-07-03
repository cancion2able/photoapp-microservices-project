/**
 * Copyright (c) 2021, by Arlo Technologies, Inc. All rights reserved.
 *
 * This software is the confidential and proprietary information of Arlo Technologies, Inc.
 * ("Confidential Information"). You shall not disclose such Confidential Information and
 * shall use it only in accordance with the terms of the license agreement you entered into with
 * Arlo Technologies, Inc.
 */
package net.its.photoapp.api.gateway.filter;

import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory;
import org.springframework.stereotype.Component;

@Component
public class AuthorizationHeaderFilter extends AbstractGatewayFilterFactory<AuthorizationHeaderFilter.Config> {

    public static class Config {
        // Put configuration properties here
    }

    @Override
    public GatewayFilter apply(Config config) {
        return null;
    }
}
