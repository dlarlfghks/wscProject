package koreatech.cse.controller;

import koreatech.cse.service.SanService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import wscproj.GdTrailInfoType;
import wscproj.MetadataType;
import wscproj.ResultType;

import java.util.Map;

@Controller
@RequestMapping("/")
public class HomeController {
    @Value("${env.text}")
    private String env;

    @ModelAttribute("name")
    private String getName() {
        return "IamHomeControllerModelAttribute";
    }

    @RequestMapping
    public String home(Model model) {
        model.addAttribute("textFromController", "World");
        return "main";
    }

    @RequestMapping("/env")
    public String env(Model model) {
        model.addAttribute("textFromController", env);
        return "main";
    }

    @RequestMapping(value="/san_search")
    @ResponseBody
    public String result(@ModelAttribute String san_name) {
        return "san_search";
    }

    @RequestMapping("/searchsanname/{a}")
    public String pathVariableTest(Model model, @PathVariable int a) {
        SanService sanService = new SanService();
        model.addAttribute("sanService", sanService.Sansearch(a));
        return "result";
    }

    @ResponseBody
    public String requestMappingPostTest() {
        return "main";
    }
}
