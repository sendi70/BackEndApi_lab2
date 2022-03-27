package wsei.Lab2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class Exercise2
{
    @RequestMapping("/Exercise2")
    @ResponseBody
    public String index() {
        return "Hello World!";
    }
}
