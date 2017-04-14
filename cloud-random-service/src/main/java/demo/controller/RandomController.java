package demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by peng_huang on 2017/4/14.
 */

@RestController
public class RandomController {

    @RequestMapping("/rand")
    public String getWord() {
        Integer ran = Math.toIntExact(Math.round(Math.random() * 1000));
        return ran.toString();
    }
}
