package koreatech.cse.controller;

import koreatech.cse.domain.San;
import koreatech.cse.service.SanService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
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
    private static SanService sanService = new SanService();

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

    @Transactional
    @RequestMapping(value="/search_json/{id}", method=RequestMethod.GET, produces = "application/json; charset=utf8")
    public ResponseEntity<San> temperature(@PathVariable("id") int id) {
        San san = sanService.Sansearch(id);
        if (san == null) {
            return new ResponseEntity<San>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<San>(san, HttpStatus.OK);
    }

    @RequestMapping(value="/search_xml/{id}", method = RequestMethod.GET, produces = "application/xml; charset=utf8")
    @ResponseBody
    public San result(@PathVariable int id) {
        return sanService.Sansearch(id);
    }

    @ResponseBody
    public String requestMappingPostTest() {
        return "main";
    }
}
