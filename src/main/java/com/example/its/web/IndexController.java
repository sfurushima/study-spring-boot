package com.example.its.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

// このアノテーションをつけることで、SpringにこのクラスがControllerだと定義する
@Controller
public class IndexController {

    // GETのトップページと紐づけたいのでGETマッピングを行う
    @GetMapping
    // Response Bodyを付与することで、戻り値の方をStringに定義することができる
    @ResponseBody
    public String index() {
        return "<h1>Hello World!!</h1>";
    }
}
