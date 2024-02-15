package hello.hellospring.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

@Controller
public class FileBatchController {

    @RequestMapping("/member/makeFile.do")
    public ModelAndView makeFile(HttpServletRequest request) throws IOException {
        ModelAndView mv=new ModelAndView("/member/userInfo/batchPopup");

        // CI 생성
        boolean ciFlag = false;
        try {
            OutputStream op = new FileOutputStream("C:/Users/Preload/Desktop/김영기/SCRIBBLE/TestingFile.txt");

            // CI 변환
            String ciTxt = "";
            for(int i = 1; i <=	 2000; i++){
                String character = i + "11111111111111";
                character = character.substring(0, 13);
                ciTxt += i + "^" + character + "\r\n";
            }
            byte[] by = ciTxt.getBytes();
            op.write(by);
            op.close();
            System.out.println("done");
        } catch (Exception e) {
            System.out.println("TEST FAIL");
        }

        return mv;
    }

}