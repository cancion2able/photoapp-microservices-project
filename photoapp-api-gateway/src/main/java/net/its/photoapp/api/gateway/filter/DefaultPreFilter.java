package net.its.photoapp.api.gateway.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.util.Set;

@Component
public class DefaultPreFilter implements GlobalFilter, Ordered {

    private final Logger logger = LoggerFactory.getLogger(DefaultPreFilter.class);

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        logger.info("A default pre-filter is executed...");
        final String requestPath = exchange.getRequest().getPath().value();
        logger.info("Request path = {}", requestPath);
        final HttpHeaders headers = exchange.getRequest().getHeaders();
        final Set<String> headerNames = headers.keySet();
        headerNames.forEach(headerName -> {
            final String headerValue = headers.getFirst(headerName);
            logger.info("{}: {}", headerName, headerValue);
        });
        return chain.filter(exchange);
    }

    @Override
    public int getOrder() {
        return 0;
    }
}
