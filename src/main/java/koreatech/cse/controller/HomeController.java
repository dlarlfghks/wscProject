package koreatech.cse.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

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
        RestTemplate restTemplate = new RestTemplate();

        try {
            UriComponentsBuilder sanbuilder = UriComponentsBuilder.fromHttpUrl(sanUrl)
                    .queryParam("key", sanKey)
                    .queryParam("pageUnit", sanpageUnit)
                    .queryParam("pageIndex", sanpageIndex)
                    .queryParam("searchWrd", san_name);

            System.out.println("san : " + sanbuilder.build().encode().toUri());

            UriComponentsBuilder weatherbuilder = UriComponentsBuilder.fromHttpUrl(weatherUrl)
                    .queryParam("keyValue", weatherKey)
                    .queryParam("version", "1.0")
                    .queryParam("obsid", 7916);

            System.out.println("weather : " + weatherbuilder.build().encode().toUri());

            UriComponentsBuilder famosanbuilder = UriComponentsBuilder.fromHttpUrl(famosanUrl)
                    .queryParam("key", famosanKey)
                    .queryParam("searchMntNm", san_name);

            System.out.println("famosan : " + famosanbuilder.build().encode().toUri());

            wscproj_san.ResultType resultType = restTemplate.getForObject(sanbuilder.build().encode().toUri(), wscproj_san.ResultType.class);

            MetadataType metadataType = restTemplate.getForObject(weatherbuilder.build().encode().toUri(), MetadataType.class);

            ResultType resultType_famo = restTemplate.getForObject(famosanbuilder.build().encode().toUri(), ResultType.class);

            //  model.addAttribute("result", resultType.getKey());

            // %EC%A7%80%EB%A6%AC%EC%82%B0


            System.out.println(resultType.getTotalCnt());
            System.out.println(resultType.getKey());

            System.out.println(metadataType.getOutputData().getItems().getHm10M());
            System.out.println();
            for (GdTrailInfoType index: resultType_famo.getGdTrailInfo()) {
                System.out.println(index.getMntNm());
                System.out.println(index.getDetails());
            }


            for (wscproj_san.MntInfoType index: resultType.getMntInfo()) {
                System.out.println();
                System.out.println();
                System.out.println(index);
                System.out.println(index.getMntiHigh());
                System.out.println(index.getMntiDetails());
                System.out.println(index.getMntiName());
                System.out.println(index.getMntiAdmin());
                System.out.println(index.getMntiSname());
            }



        } catch (HttpClientErrorException e) {
            System.out.println("Exception : " + e.getStatusCode() + ": " + e.getStatusText());
        }
        return "san_search";
    }

    @RequestMapping("/searchsanname/{a}")
    public String pathVariableTest(Model model, @PathVariable String a) {
        RestTemplate restTemplate = new RestTemplate();
        System.out.println();
        System.out.println(a);
        System.out.println();

        try {
            UriComponentsBuilder sanbuilder = UriComponentsBuilder.fromHttpUrl(sanUrl)
                    .queryParam("key", sanKey)
                    .queryParam("pageUnit", sanpageUnit)
                    .queryParam("pageIndex", sanpageIndex)
                    .queryParam("searchWrd", a);

            System.out.println("san : " + sanbuilder.build().encode().toUri());

            UriComponentsBuilder weatherbuilder = UriComponentsBuilder.fromHttpUrl(weatherUrl)
                    .queryParam("keyValue", weatherKey)
                    .queryParam("version", "1.0")
                    .queryParam("obsid", 7916);

            System.out.println("weather : " + weatherbuilder.build().encode().toUri());

            UriComponentsBuilder famosanbuilder = UriComponentsBuilder.fromHttpUrl(famosanUrl)
                    .queryParam("key", famosanKey)
                    .queryParam("searchMntNm", a);

            System.out.println("famosan : " + famosanbuilder.build().encode().toUri());

            wscproj_san.ResultType resultType = restTemplate.getForObject(sanbuilder.build().encode().toUri(), wscproj_san.ResultType.class);

            MetadataType metadataType = restTemplate.getForObject(weatherbuilder.build().encode().toUri(), MetadataType.class);

            ResultType resultType_famo = restTemplate.getForObject(famosanbuilder.build().encode().toUri(), ResultType.class);

            model.addAttribute("result", resultType.getMntInfo());
            System.out.println(a);
          //  model.addAttribute("result", resultType.getKey());

            // %EC%A7%80%EB%A6%AC%EC%82%B0


            System.out.println(resultType.getTotalCnt());
            System.out.println(resultType.getKey());

            System.out.println(metadataType.getOutputData().getItems().getHm10M());
            System.out.println();
            for (GdTrailInfoType index: resultType_famo.getGdTrailInfo()) {
                System.out.println(index.getMntNm());
                System.out.println(index.getDetails());
            }


            for (wscproj_san.MntInfoType index: resultType.getMntInfo()) {
                System.out.println();
                System.out.println();
                System.out.println(index);
                System.out.println(index.getMntiHigh());
                System.out.println(index.getMntiDetails());
                System.out.println(index.getMntiName());
                System.out.println(index.getMntiAdmin());
                System.out.println(index.getMntiSname());
            }



        } catch (HttpClientErrorException e) {
            System.out.println("Exception : " + e.getStatusCode() + ": " + e.getStatusText());
        }

        return "result";
    }

    @ResponseBody
    public String requestMappingPostTest() {
        return "main";
    }
}
