package org.janine.jian.rest

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HomeController {

    @GetMapping("/home")
    fun home(): String{
        return "home";
    }


}