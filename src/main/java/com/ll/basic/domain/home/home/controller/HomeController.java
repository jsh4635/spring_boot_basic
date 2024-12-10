package com.ll.basic.domain.home.home.controller;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * @author shjung
 * @since 24. 12. 10.
 */
@Controller
public class HomeController {

    private int age = 22;

    @GetMapping("/")
    @ResponseBody
    public String showMain(){
        return "안녕하세요";
    }

    @GetMapping("/about")
    @ResponseBody
    public String showAbout(){
        return "어바웃";
    }

    @GetMapping("/age")
    @ResponseBody
    public int getAgeAndUp(){
        return age++;
    }
    @GetMapping("/long")
    @ResponseBody
    public long getLong(){
        return 100L;
    }
    @GetMapping("/boolean")
    @ResponseBody
    public boolean getBooelan(){
        return true;
    }

    @GetMapping("/char")
    @ResponseBody
    public char getChar(){
        return 'a';
    }

    @GetMapping("/byte")
    @ResponseBody
    public byte getByte(){
        return 127;
    }

    @GetMapping("/short")
    @ResponseBody
    public short getShort(){
        return 32000;
    }

    @GetMapping("/float")
    @ResponseBody
    public float getFloat(){
        return 3.14f;
    }

    @GetMapping("/double")
    @ResponseBody
    public double getDouble(){
        return 3.12423;
    }

    @GetMapping("/list")
    @ResponseBody
    public List<String> getList(){
        return List.of("a", "b", "c");
    }
    @GetMapping("/map")
    @ResponseBody
    public Map<String, String> getMap(){
        return Map.of("key", "value", "key2", "value2");
    }

    @GetMapping("/array")
    @ResponseBody
    public String[] getArray(){
        return new String[]{"a", "b", "c", "d"};
    }

    @GetMapping("/article")
    @ResponseBody
    public Article getArticle(){
        return new Article(1);
    }
}

@AllArgsConstructor
@Getter
@Setter
class Article{
    private long id;

}