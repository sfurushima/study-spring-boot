package com.example.its.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

// このアノテーションをつけることで、SpringにこのクラスがControllerだと定義する
@Controller
public class IndexController {

    // GETのトップページと紐づけたいのでGETマッピングを行う
    @GetMapping
    public String index() {
        // JSPだと拡張子を記載していたが、Spring MVCが拡張子を保管し、ビューページを表示するため拡張子は不要
        return "index";
    }
}
