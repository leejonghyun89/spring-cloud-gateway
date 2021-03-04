package kr.co.gateway

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication

/**
 * Created by JongHyun Lee on 2021-03-02
 */
@SpringBootApplication
@EnableConfigurationProperties
class MsaGatewayApplication

fun main(args: Array<String>) {
  runApplication<MsaGatewayApplication>(*args)
}