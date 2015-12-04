import Fire.FrstFireInfoType;
import Fire.ResultType;
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

import java.util.Calendar;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration( {"file:src/main/resources/common/services.xml",
        "file:src/main/resources/common/security.xml",
        "file:src/main/resources/common/mybatis.xml"} )
public class FireTest {
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
    public void fireTest() {
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH) + 1;
        int day = cal.get(Calendar.DAY_OF_MONTH);

        String monthstr = "";
        if(month < 10){
            monthstr = "0" + month;
        }else{
            monthstr = String.valueOf(month);
        }
        String daystr = "";
        if(day < 10){
            daystr = "0"+day;
        }else{
            daystr = String.valueOf(day);
        }
        String today = year + monthstr + daystr;
        //System.out.println(today);
        String sanUrl = "http://www.forest.go.kr/newkfsweb/kfi/kfs/openapi/frstFireOpenAPI.do";
        String sanKey = "eb670247e98648a3b40636bcfb70ad6f";
        int pageUnit = 1;//페이지 결과값 개수


        String searchStDt = "20150101";//발생시간 시작일
        String searchEdDt = today;//발생시간 종료일
        RestTemplate restTemplate = new RestTemplate();
        try {
            UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(sanUrl)
                    .queryParam("key", sanKey)
                    .queryParam("pageUnit", pageUnit)
                    .queryParam("pageIndex", 1)
                    .queryParam("searchSdDt", searchStDt)
                    .queryParam("searchEdDt", searchEdDt);

            System.out.println("san : " + builder.build().encode().toUri());

            ResultType resultType = restTemplate.getForObject(builder.build().encode().toUri(), ResultType.class);
            FrstFireInfoType frstFireInfoType = restTemplate.getForObject(builder.build().encode().toUri(), FrstFireInfoType.class);
            ResultType.FrstFireInfo fireInfo = restTemplate.getForObject(builder.build().encode().toUri(), ResultType.FrstFireInfo.class);
            //MetadataType metadataType = restTemplate.getForObject()

            //System.out.println("FireInfo : " + resultType.getFrstFireInfo());
            System.out.println("Key : " +resultType.getKey());
            System.out.println("pageIndex : " + resultType.getPageIndex());
            System.out.println("pageUnit : " + resultType.getPageUnit());
            System.out.println("EdDt : " + resultType.getSearchEdDt());
            System.out.println("StDt : " + resultType.getSearchStDt());
            System.out.println("Total Cnt : " + resultType.getTotalCnt());

            for(int i=0; i<pageUnit; i++){
                System.out.println(resultType.getFrstFireInfo().get(i).getOcurDt());
                System.out.println(resultType.getFrstFireInfo().get(i).getOcurYoil());
                System.out.println(resultType.getFrstFireInfo().get(i).getOcurGm());
                System.out.println(resultType.getFrstFireInfo().get(i).getOcurDo());
                System.out.println(resultType.getFrstFireInfo().get(i).getOcurSgg());
                System.out.println(resultType.getFrstFireInfo().get(i).getOcurCause());
                /*System.out.println(resultType.getFrstFireInfo().get(i));*/

            }

        } catch (HttpClientErrorException e) {
            System.out.println(e.getStatusCode() + ": " + e.getStatusText());
        }
    }
    @After
    public void wrapup() {
        System.out.println("End");
        System.out.println();
    }

}
