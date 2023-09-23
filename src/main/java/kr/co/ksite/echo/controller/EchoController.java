package kr.co.ksite.echo.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpRequest;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.nio.charset.StandardCharsets;


@RestController
public class EchoController {

    @RequestMapping(value = "/echo" , method = RequestMethod.POST)
    public ResponseEntity echo(@RequestBody String data) {
        return ResponseEntity.status(200).header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_UTF8_VALUE).body("서진이 천재");
    }
}
