package hello;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdderController {

    @RequestMapping("/adder/{x}/{y}")
    public Adder adder(@PathVariable(value="x") int x, @PathVariable(value="y") int y) {
        return new Adder(x,y) ;
    }
}
