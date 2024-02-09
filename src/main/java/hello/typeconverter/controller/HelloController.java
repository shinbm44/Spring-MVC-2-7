package hello.typeconverter.controller;

import hello.typeconverter.Type.IpPort;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello-v1")
    public String helloV1(HttpServletRequest request) {
        String data = request.getParameter("data"); // 문자 타입 조회
        Integer intValue = Integer.valueOf(data); //  숫자 타입으로 변경
        System.out.println("intValue = " + intValue);
        return "ok";
    // HTTP 요청 파라미터는 모두 문자로 처리된다. 따라서 다른 타입으로 변환하고 싶으면,
    // 타입을 변환해준다.
    }

    @GetMapping("/hello-v2")
    public String helloV2(@RequestParam Integer data) {
        System.out.println("data = " + data);
        return "ok";
    //@RequestParam을 사용하면, 편하게 타입 변환된 data를 받을 수 있다.
    //@ModelAttribute나 PathVarialbe도 마찬가지로 스프링mvc가 타입 변환을 해준다.

    }

    @GetMapping("/ip-port")
    public String ipPort(@RequestParam IpPort ipPort){
        System.out.println("ipPort Ip = " + ipPort.getIp());
        System.out.println("ipPort Port = " + ipPort.getPort());
        return "ok";
    }

}
