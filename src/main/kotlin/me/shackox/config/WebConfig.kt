package me.shackox.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.EnableWebMvc
import org.springframework.web.servlet.view.InternalResourceViewResolver

/**
 * Created by SHACKOX on 17/12/16.
 */

@Configuration
@EnableWebMvc
@ComponentScan("me.shackox")
open class WebConfig {
    @Bean
    open fun resolver() : InternalResourceViewResolver {
        val resolver = InternalResourceViewResolver()
        resolver.setPrefix("/")
        resolver.setSuffix(".jsp")
        return resolver
    }
}
