package com.six.finger.leetcode.weixin;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipayDataDataserviceBillDownloadurlQueryRequest;
import com.alipay.api.response.AlipayDataDataserviceBillDownloadurlQueryResponse;

import java.math.BigDecimal;

public class Wei {

    public static void main(String[] args) {

//        AlipayClient alipayClient = new DefaultAlipayClient("https://openapi.alipay.com/gateway.do","2021003122625942","MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCvOqV5B9rrgaear3+HknRYcbqKTjBCOJDG4RXJ4soMc7ulDLcAmvvaANSzlRGwydHM+YbuuSbW8UQowiyrUI8Og+QPJesM2E5uVOAWUja9YnQr+kHXNL2J4ui2cuj2qznRxFNJEZcu+xzYE3djqWI2qmyT+Fp2ay8SZpBkq0c8say1uYuRtq9oxPcTrGjL0FP/8SIMsvbsAZcgWnTMy37djLRj0mvWqApzJ+H28fHPte2YasMSybWK72eWlNkrdPNU0XK08RpfBSSsRgpaLsRDFA1F8Hfid0vUqjxRHSFfQ4BxpZW+mRvBnO3zg7U2MaLrX8yr7oxmauhYWRF4nS0LAgMBAAECggEAMG30B+Rc5BQcf4sboxueHkeod8suWU8K7HyPKhINJ63g4bgG6Brtmo36O3vqvMK6wn0AhwATNPrPjLhF4j9MmoVnRayELzOlUacRm/my+Vq5ouHyyojgDbjx+mL98hbWzxwErMA42Zo7mZifuaK560Pk6GyOjAYJp3tDUx9ne+VlBIv6cXl/76WjrGp2+1wDdD1/dSs38TMxqybSMJQXx9mpJevGtpfVRTSrONtzuosbz1kzGP4P1xKuV8hjIz1wLMK6a3NQrPwN7bOeW24wdzLNZBgtvLDY+Pj8zcE/7mfl/EwoK0djAIjXaLQm7lB71avCWq5g9Cra5VfKRVlD2QKBgQD0LaBtEWdroBLGVpxSWgKt3e5LYk5khozWn+CS7VFqHJMGGmw9985H4kwgBRtQkrhnviTlRMoOErXrlkd/S8pUV4v8iYVTyHuW368Ow59aA43n3RDiPrvURgZYc7+IAfAFrOHhI1QDtyycpxRzavmZJBXwg+qR7mjmAZYazN5m1QKBgQC3tnS/KhT8kC6lOdwSH0cko2AqkRWXokjiKbfBAcZeXKKpMMBbJiV5n1Fe2OlZMyt64Opfvs2KBxQcCtXeHKiUeKE98azfcdKDIcAf4dsStsO3qh6i7UnzmGSTQDqJzvY4op2uBz3wOlNCiRZu4yB9XCmQiS/ldWyTJd03BMr0XwKBgAImWLA9I/z1ltS6NHwhIL7pIkz1m50U9i55j9+bSUk24TB/kQ5mnSFS47qwcNIfyJHZQbfnCCRhk8p0M0LypuBhOPFLQKpBLJ1icMcff8qqF1jAQILNbJfs2edzdW88HSHfqMlzpyy1MyZZ7jsp6PKpN6w7bRhF0hScVPb9cMPVAoGAVoPPIQNhVLtVrCu+Tq56I2/o5sLiZ0Fej1tUFMmQMHnxhDnYLFSfi1IS0NbXtVEapchrt2E0jE7fEoGry+i1Hw5b6L76SVPh7i0jvB/xujNlogW0Xcffbp8SpiG2L5XOcEdseDsi2RGuigPjE59UepS/Yjio3Kda1UUckz9nkIMCgYEAjcXL4ZQYGyGvu9/McTlYI6M5T1AdVT0r70Mil0wv8UBfLvhDiyN+YYvonavMZnLAGfoqr/1I8ML8MxEkBClpHZrCJ435Zy1JUrPuKyHP9d+oeSScvO41TEQmHKEfeWTwf/s3xRwbHzRplrsDlx7SxsPy5MmrQmhizcunTrfGgoA=","json","GBK","MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCnxj/9qwVfgoUh/y2W89L6BkRAFljhNhgPdyPuBV64bfQNN1PjbCzkIM6qRdKBoLPXmKKMiFYnkd6rAoprih3/PrQEB/VsW8OoM8fxn67UDYuyBTqA23MML9q1+ilIZwBC2AQ2UBVOrFXfFl75p6/B5KsiNG9zpgmLCUYuLkxpLQIDAQAB","RSA2");
//        AlipayDataDataserviceBillDownloadurlQueryRequest request = new AlipayDataDataserviceBillDownloadurlQueryRequest();
//        request.setBizContent("{" +
//                "  \"bill_type\":\"trade\"," +
//                "  \"bill_date\":\"2022-02-29\"" +
//                "}");
//        AlipayDataDataserviceBillDownloadurlQueryResponse response = null;
//        try {
//            response = alipayClient.execute(request);
//        } catch (AlipayApiException e) {
//            e.printStackTrace();
//        }
//        if(response.isSuccess()){
//            System.out.println("调用成功");
//        } else {
//            System.out.println("调用失败");
//        }


            BigDecimal bigDecimal = new BigDecimal("1000.0000000").setScale(0, BigDecimal.ROUND_UNNECESSARY);
        System.out.println(bigDecimal);

    }
}
