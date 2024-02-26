package hello.hellospring.controller;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.IOException;

@Controller
public class HelloController {

    //PUSH/PULL TESTING Comeback
    @GetMapping("hello")
    public String hello(Model model) {
        model.addAttribute("date", "hello!!");
        String apiRes = callApi("https://www.google.com");
        System.out.println(apiRes);

        String nullRes = null;
        System.out.println(isNull(nullRes));

        return "hello";
    }

    public String callApi(String url) {

        String rtnStr = "";
        System.out.println("Url Check: " + url);

        try {
            Document doc = Jsoup.connect(url).timeout(10 * 1000).post();
            Element body = doc.body();
            rtnStr = body.text();

        } catch (IOException e1) {
            System.out.println("Error Occurance" + e1.getMessage());
        }

        return rtnStr;
    }

    @GetMapping
    public String TestingUrl(String url) {

        String rtnStr = "";
        System.out.println("Url Check: " + url);

        try {
            Document doc = Jsoup.connect(url).timeout(10 * 1000).post();
            Element body = doc.body();
            rtnStr = body.text();

        } catch (IOException e1) {
            System.out.println("Error Occurance" + e1.getMessage());
        }

        return rtnStr;
    }

    public String isNull(String str)
    {
        if ( str == null || str.equals("null") || str.equals("") )
            return "";
        else
            return str;
    }
}
