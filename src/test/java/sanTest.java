import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import wscproj.*;

import java.util.ArrayList;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration({"file:src/main/resources/common/services.xml",
"file:src/main/resources/common/security.xml",
"file:src/main/resources/common/mybatis.xml"})

public class sanTest {
    @Test
    public void sanTest_1() {
        String sanUrl = "http://www.forest.go.kr/newkfsweb/kfi/kfs/openapi/mntInfoOpenAPI.do";
        String weatherUrl = "http://know.nifos.go.kr/openapi/mtweather/mountListSearch.do";
        String sanKey = "072412711628484ba8148db1fe76cb7d";
        String weatherKey = "5616322344776229063796515611583064046076";

        int sanpageIndex = 1;
        int sanpageUnit = 5;
        String sanname = "지리산";

        RestTemplate restTemplate = new RestTemplate();

        try {
            UriComponentsBuilder sanbuilder = UriComponentsBuilder.fromHttpUrl(sanUrl)
                    .queryParam("key", sanKey)
                    .queryParam("pageUnit", sanpageUnit)
                    .queryParam("pageIndex", sanpageIndex)
                    .queryParam("searchWrd", sanname);

            System.out.println("san : " + sanbuilder.build().encode().toUri());

            UriComponentsBuilder weatherbuilder = UriComponentsBuilder.fromHttpUrl(weatherUrl)
                    .queryParam("keyValue", weatherKey)
                    .queryParam("version", "1.0")
                    .queryParam("obsid", 7916);

            System.out.println("weather : " + weatherbuilder.build().encode().toUri());

            ResultType resultType = restTemplate.getForObject(sanbuilder.build().encode().toUri(), ResultType.class);

            MetadataType metadataType = restTemplate.getForObject(weatherbuilder.build().encode().toUri(), MetadataType.class);

            System.out.println(resultType.getTotalCnt());
            System.out.println(resultType.getKey());
            System.out.println(resultType.getMntInfo().getMntiHigh());
            System.out.println(resultType.getMntInfo().getMntiDetails());
            System.out.println(resultType.getMntInfo().getMntiName());

            System.out.println(metadataType.getOutputData().getItems().getObsname());
            System.out.println(metadataType.getOutputData().getItems().getTs());
            System.out.println(metadataType.getOutputData().getItems().getHm10M());
            System.out.println(metadataType.getOutputData().getItems().getCprn());
        } catch (HttpClientErrorException e) {
            System.out.println("Exception : " + e.getStatusCode() + ": " + e.getStatusText());
        }
    }
}