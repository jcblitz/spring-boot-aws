package demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jcblitz on 2/11/17.
 */
@RestController
public class WelcomeController {

    @RequestMapping("/")
    public String welcome() {
        return "Hi";
    }
}
