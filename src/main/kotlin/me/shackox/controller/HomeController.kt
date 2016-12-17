package me.shackox.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

/**
 * Created by SHACKOX on 17/12/16.
 */

@Controller
class HomeController {
    @RequestMapping(value = "/")
    fun home() : String {
        return "home"
    }
}