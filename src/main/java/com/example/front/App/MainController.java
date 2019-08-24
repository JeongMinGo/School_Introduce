package com.example.front.App;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
    @RequestMapping(value="/introduce")
    public String introduce(){
        return "introduce";
    }
    @RequestMapping(value="/administration")
    public String administration(){
        return "administration";
    }
    @RequestMapping(value="/gunja")
    public String gunja(){
        return "gunja";
    }
    @RequestMapping(value="/union")
    public String union(){
        return "union";
    }
    @RequestMapping(value="/gwangGaeto")
    public String gwangGaeto(){
        return "gwangGaeto";
    }
    @RequestMapping(value="/fine")
    public String fine(){
        return "fine";
    }
    @RequestMapping(value="/press")
    public String press(){
        return "press";
    }
    @RequestMapping(value="/daeyang")
    public String daeyang(){
        return "daeyang";
    }
    @RequestMapping(value="/student")
    public String student(){
        return "student";
    }
    @RequestMapping(value="/library")
    public String library(){
        return "library";
    }
    @RequestMapping(value="/map")
    public String map(){
        return "map";
    }
    @RequestMapping(value="/developer")
    public String developer(){
        return "developer";
    }
}
