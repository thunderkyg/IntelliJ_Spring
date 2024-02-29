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
    //FETCH, CHECKOUT, ORIGIN/MASTER TESTING COMMIT
    @GetMapping("hello")
    public String hello(Model model) {
        model.addAttribute("data", "hello!!");
//        String apiRes = callApi("https://www.google.com");
//        String nullRes = null;
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
            System.out.println("Testing Exception1");
            System.out.println("Testing Exception2");
            System.out.println("Testing Exception3");
        }

        return rtnStr;
    }

    public String isNull(String str)
    {
        if ( str == null || str.equals("null") || str.isEmpty())
            return "";
        else
            return str;
    }
}
