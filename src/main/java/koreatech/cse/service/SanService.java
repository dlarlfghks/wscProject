package koreatech.cse.service;

import koreatech.cse.domain.San;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import wscproj.MetadataType;
import wscproj.ResultType;

/**
 * Created by GilHwan on 2015-12-07.
 */
@Service
public class SanService {
    private String sanUrl = "http://www.forest.go.kr/newkfsweb/kfi/kfs/openapi/mntInfoOpenAPI.do";
    private String weatherUrl = "http://know.nifos.go.kr/openapi/mtweather/mountListSearch.do";
    private String famosanUrl = "http://www.forest.go.kr/newkfsweb/kfi/kfs/openapi/gdTrailInfoOpenAPI.do";
    private String sanKey = "072412711628484ba8148db1fe76cb7d";
    private String weatherKey = "5616322344776229063796515611583064046076";
    private String famosanKey = "e6af29c8e4b7463baeb484d62388f2bf";

    private int sanpageIndex = 1;
    private int sanpageUnit = 5;

    RestTemplate restTemplate = new RestTemplate();

    public String Sansearch(int id) {
        try {
            UriComponentsBuilder sanbuilder = UriComponentsBuilder.fromHttpUrl(sanUrl)
                    .queryParam("key", sanKey)
                    .queryParam("pageUnit", sanpageUnit)
                    .queryParam("pageIndex", sanpageIndex)
                    .queryParam("searchWrd", SearchID(id));

            System.out.println("san : " + sanbuilder.build().encode().toUri());

            UriComponentsBuilder weatherbuilder = UriComponentsBuilder.fromHttpUrl(weatherUrl)
                    .queryParam("keyValue", weatherKey)
                    .queryParam("version", "1.0")
                    .queryParam("obsid", id);

            System.out.println("weather : " + weatherbuilder.build().encode().toUri());

            UriComponentsBuilder famosanbuilder = UriComponentsBuilder.fromHttpUrl(famosanUrl)
                    .queryParam("key", famosanKey)
                    .queryParam("searchMntNm", SearchID(id));

            System.out.println("famosan : " + famosanbuilder.build().encode().toUri());

            wscproj_san.ResultType resultType = restTemplate.getForObject(sanbuilder.build().encode().toUri(), wscproj_san.ResultType.class);

            MetadataType metadataType = restTemplate.getForObject(weatherbuilder.build().encode().toUri(), MetadataType.class);

            ResultType resultType_famo = restTemplate.getForObject(famosanbuilder.build().encode().toUri(), ResultType.class);

            if(resultType.getTotalCnt().equals('0') || metadataType.getResultSummary().getTotalCnt().equals('0')){
                San san = new San();
                san = null;
                return san.toString();
            }

            San san = new San();
            san.setMntname(resultType.getMntInfo().get(0).getMntiName());
            san.setMntAdmin(resultType.getMntInfo().get(0).getMntiAdmin());
            san.setMntAdminNum(resultType.getMntInfo().get(0).getMntiAdminNum());
            san.setMntDetails(resultType.getMntInfo().get(0).getMntiDetails());
            san.setMntHigh(resultType.getMntInfo().get(0).getMntiHigh());
            san.setMntSname(resultType.getMntInfo().get(0).getMntiSname());
            san.setMntSummary(resultType.getMntInfo().get(0).getMntiSummary());
            san.setPa(metadataType.getOutputData().getItems().getPa());
            san.setTm(metadataType.getInputData().getTm());
            san.setTs(metadataType.getOutputData().getItems().getTs());
            return san.toString();
        } catch (HttpClientErrorException e) {
            System.out.println("Exception : " + e.getStatusCode() + ": " + e.getStatusText());
            San san = new San();
            san = null;
            return san.toString();
        }
    }

    public String SearchID(int id) {
        switch(id){
            case 1912:
                return "천장산";
            case 1913:
                return "용마산";
            case 1914:
                return "봉산";
            case 1915:
                return "개화산";
            case 1916:
                return "구룡산";
            case 1917:
                return "관악산";
            case 1918:
                return "수락산";
            case 4910:
                return "관불산";
            case 4911:
                return "칠불산";
            case 8914:
                return "양달산";
            case 8915:
                return "백양산";
            case 4912:
                return "계족산";
            case 4913:
                return "보문산";
            case 8900:
                return "능동산";
            case 8912:
                return "백운산";
            case 1919:
                return "황학산";
            case 1946:
                return "칠보산";
            case 1947:
                return "운악산";
            default:
                return null;
        }
    }
}
