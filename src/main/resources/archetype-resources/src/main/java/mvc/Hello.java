#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/")
public class Hello {

    @RequestMapping(method=RequestMethod.GET)
    public String hello(Model model) {
        model.addAttribute("message", "Hello, world!");
        return "hello";
    }

}