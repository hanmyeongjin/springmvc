package mymyeong.springmvc.thymeleaf.basic

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/basic")
class BasicController {

    @GetMapping("text-basic")
    fun textBasic(model: Model): String {
        model.addAttribute("data", "hello spring")
        return "basic/text-basic"
    }
}