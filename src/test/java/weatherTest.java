
import org.apache.ibatis.annotations.ResultType;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.util.UriComponentsBuilder;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(
        {"file:src/main/resources/common/services.xml",
                "file:src/main/resources/common/mybatis.xml"}
)
public class weatherTest {
      @Autowired
    private WebApplicationContext wac;
    @Value("${env.text}")
    private String envText;

    @Before
    public void setup() {
        System.out.println("wac: " + wac);
        System.out.println("this: " + this);
    }

    @Test
    public void weatherTest() {
        String sanUrl = "http://know.nifos.go.kr/openapi/mtweather/mountListSearch.do";
        String sanKey = "4337298518263458129990035415471445925404";
        int pageUnit = 10;
        int pageIndex = 1;

        // POJO 클래스의 List 멤버 위에 붙여야 할 어노테이션
        // @JacksonXmlElementWrapper(useWrapping=false)
        // protected List<MntInfoType> mntInfo;

        RestTemplate restTemplate = new RestTemplate();
        try {
            UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(sanUrl)
                    .queryParam("keyValue", sanKey)
                    .queryParam("pageUnit", pageUnit)
                    .queryParam("pageIndex", 1);

            System.out.println("san : " + builder.build().encode().toUri());

            ResultType resultType = restTemplate.getForObject(builder.build().encode().toUri(),
                    ResultType.class);

            //String totalCnt = resultType.getTotalCnt();
            //System.out.println(totalCnt);

           //System.out.println(resultType.getMntInfo().get(0).getMntiName());

        }catch (HttpClientErrorException e) {
            System.out.println("Exception : " + e.getStatusCode() + ": " + e.getStatusText());
        }
    }


    @After
    public void wrapup() {
        System.out.println("wrapup");
        System.out.println();
    }
}