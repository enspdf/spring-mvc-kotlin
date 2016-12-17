package me.shackox.config

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer

/**
 * Created by SHACKOX on 17/12/16.
 */

open class WebInit : AbstractAnnotationConfigDispatcherServletInitializer() {
    override fun getRootConfigClasses(): Array<out Class<*>> {
        return arrayOf<Class<*>>(RootConfig::class.java)
    }

    override fun getServletMappings(): Array<out String> {
        return arrayOf("/")
    }

    override fun getServletConfigClasses(): Array<out Class<*>> {
        return arrayOf<Class<*>>(WebConfig::class.java)
    }

}
