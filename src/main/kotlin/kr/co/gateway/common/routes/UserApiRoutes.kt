package kr.co.gateway.common.routes

import org.springframework.beans.factory.annotation.Value
import org.springframework.cloud.gateway.route.RouteLocator
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder
import org.springframework.cloud.gateway.route.builder.filters
import org.springframework.cloud.gateway.route.builder.routes
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

/**
 * Created by JongHyun Lee on 2021-03-03
 */
@Configuration
class UserApiRoutes(
  @Value("\${user-api.url}") val baseUrl: String
) {

  @Bean
  fun userApiRoute(routeLocatorBuilder: RouteLocatorBuilder): RouteLocator =
    routeLocatorBuilder.routes {
      route(id = "USER-SERVICE", uri = baseUrl) {
        filters { rewritePath("/user/(?<path>.*)", "/\${path}") }
        path("/user/**")
      }
    }
}
