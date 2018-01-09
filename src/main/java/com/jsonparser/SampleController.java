package com.jsonparser;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SampleController {
    @RequestMapping(value = "/api/parse", method = RequestMethod.POST)
    public @ResponseBody Sample parseJSON(@RequestBody Sample sample) {
        return sample;
    }
}//