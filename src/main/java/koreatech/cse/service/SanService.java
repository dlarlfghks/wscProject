package koreatech.cse.service;

import koreatech.cse.domain.San;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import wscproj.MetadataType;
import wscproj.MntInfoType;
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

    private static RestTemplate restTemplate = new RestTemplate();
    private static San san = new San();

    public San Sansearch(int id) {
        san.init();
        try {
            if (SearchID(id) == null) {
                return null;
            } else {
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
                if (!resultType.getTotalCnt().equals("0")) {
                    for (wscproj_san.MntInfoType index : resultType.getMntInfo()) {
                        if (index.getMntiAdd().substring(0, SearchlistID(id).toString().length()).equals(SearchlistID(id))) {
                            san.setMntname(index.getMntiName());
                            san.setMntAdmin(index.getMntiAdmin());
                            san.setMntAdminNum(index.getMntiAdminNum());
                            san.setMntDetails(index.getMntiDetails());
                            san.setMntHigh(index.getMntiHigh());
                            san.setMntSname(index.getMntiSname());
                            san.setMntSummary(index.getMntiSummary());
                        }
                    }
                } else {
                    san.setMntname(SearchID(id));
                }

                MetadataType metadataType = restTemplate.getForObject(weatherbuilder.build().encode().toUri(), MetadataType.class);
                if (!metadataType.getResultSummary().getTotalCnt().equals("0")) {
                    san.setPa(metadataType.getOutputData().getItems().getPa());
                    san.setTm(metadataType.getInputData().getTm());
                    san.setTs(metadataType.getOutputData().getItems().getTs());
                }

                ResultType resultType_famo = restTemplate.getForObject(famosanbuilder.build().encode().toUri(), ResultType.class);
                if (!resultType_famo.getTotalCnt().equals("0")) {
                    for (wscproj.GdTrailInfoType index : resultType_famo.getGdTrailInfo()) {
                        san.setMntCourse(index.getTrailPlus().get(0).getTpTitl());
                        san.setMntTransport(index.getTransport());
                        san.setMntTourismInf(index.getTourismInf());
                        san.setMntEtcCourse(index.getEtcCourse());
                    }
                }
                return san;
            }
        }catch(HttpClientErrorException e){
            System.out.println("Exception : " + e.getStatusCode() + ": " + e.getStatusText());
            San san = new San();
            san = null;
            return san;
        }

    }

    public String SearchID(int id) {
        switch (id) {
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
            case 1948:
                return "바래기산";
            case 1949:
                return "마감산";
            case 2891:
                return "한석산";
            case 2892:
                return "가득봉";
            case 2893:
                return "불발령";
            case 2894:
                return "감투봉";
            case 2895:
                return "전후재";
            case 2896:
                return "사기막";
            case 2897:
                return "제왕산";
            case 2898:
                return "만덕봉";
            case 2899:
                return "선자령";
            case 2900:
                return "가리왕산";
            case 2901:
                return "봉화치";
            case 2902:
                return "갈고개";
            case 2903:
                return "덕항산";
            case 2904:
                return "함백산";
            case 2905:
                return "사금산";
            case 2906:
                return "배향산";
            case 2907:
                return "사자산";
            case 2908:
                return "남병산";
            case 2909:
                return "대학산";
            case 2911:
                return "가리산";
            case 3891:
                return "장석산";
            case 3892:
                return "천등산";
            case 3893:
                return "원통산";
            case 3894:
                return "박달산";
            case 3895:
                return "남산";
            case 3896:
                return "도솔봉";
            case 3897:
                return "팔음산";
            case 3898:
                return "금단산";
            case 3899:
                return "탑산";
            case 3900:
                return "삼봉산";
            case 6912:
                return "농암산";
            case 6913:
                return "고산봉";
            case 6914:
                return "병풍산";
            case 6915:
                return "고동산";
            case 6916:
                return "용암산";
            case 8891:
                return "형제봉";
            case 8892:
                return "묵계제";
            case 8893:
                return "왕등재";
            case 8894:
                return "법화산";
            case 8895:
                return "향로봉";
            case 8896:
                return "단지봉";
            case 8897:
                return "대기봉";
            case 8901:
                return "천주산";
            case 8902:
                return "실봉산";
            case 8903:
                return "둔철산";
            case 8904:
                return "한우산";
            case 8905:
                return "불모산";
            case 8911:
                return "천성산";
            case 8913:
                return "대운산";
            case 8916:
                return "월아산";
            case 7891:
                return "청옥산";
            case 7892:
                return "큰재";
            case 7893:
                return "통고산";
            case 7894:
                return "가재미재";
            case 7895:
                return "아구산";
            case 7896:
                return "장군봉";
            case 7897:
                return "함박산";
            case 7898:
                return "명동산";
            case 7899:
                return "용바위";
            case 7900:
                return "감연산";
            case 7901:
                return "독경산";
            case 7902:
                return "삿갓봉";
            case 7903:
                return "내연산";
            case 7904:
                return "조항산";
            case 7905:
                return "주월산";
            case 7913:
                return "박석산";
            case 7914:
                return "삼성산";
            case 7915:
                return "발백산";
            case 7916:
                return "비봉산";
            default:
                return null;
        }
    }

    public String SearchlistID(int id) {
        switch (id) {
            case   1912:
            case   1913:
            case   1914:
            case   1915:
            case   1916:
            case   1917:
            case   1918:
                return "서울";
            case   4910:
            case   4911:
                return "세종 ";
            case  8914 :
            case  8915 :
                return "부산";
            case  4912 :
            case  4913 :
                return "대전";
            case  8900 :
            case  8912 :
                return "울산";
            case  1919 :
            case  1946 :
            case  1947 :
            case  1948 :
            case  1949 :
                return "경기";
            case  2891 :
            case  2892 :
            case  2893 :
            case  2894 :
            case  2895 :
            case  2896 :
            case  2897 :
            case  2898 :
            case  2899 :
            case  2900 :
            case  2901 :
            case  2902 :
            case  2903 :
            case  2904 :
            case  2905 :
            case  2906 :
            case  2907 :
            case  2908 :
            case  2909 :
            case  2911 :
                return "강원";
            case   3891:
            case   3892:
            case   3893:
            case   3894:
            case   3895:
            case   3896:
            case   3897:
            case   3898:
            case   3899:
            case   3900:
                return "충청북도";
            case   6912:
            case   6913:
            case   6914:
            case   6915:
            case   6916:
                return "전라남도";
            case   8891:
            case   8892:
            case   8893:
            case   8894:
            case   8895:
            case   8896:
            case   8897:
            case   8901:
            case   8902:
            case   8903:
            case   8904:
            case   8905:
            case   8911:
            case   8913:
            case   8916:
                return "경상남도";
            case   7891:
            case   7892:
            case   7893:
            case   7894:
            case   7895:
            case   7896:
            case   7897:
            case   7898:
            case   7899:
            case   7900:
            case   7901:
            case   7902:
            case   7903:
            case   7904:
            case   7905:
            case   7913:
            case   7914:
            case   7915:
            case   7916:
                return "경상북도";
            default:
                return null;
        }
    }
}

