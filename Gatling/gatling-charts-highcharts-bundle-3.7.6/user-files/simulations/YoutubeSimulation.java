
import java.time.Duration;
import java.util.*;

import io.gatling.javaapi.core.*;
import io.gatling.javaapi.http.*;
import io.gatling.javaapi.jdbc.*;

import static io.gatling.javaapi.core.CoreDsl.*;
import static io.gatling.javaapi.http.HttpDsl.*;
import static io.gatling.javaapi.jdbc.JdbcDsl.*;

public class YoutubeSimulation extends Simulation {

  {
    HttpProtocolBuilder httpProtocol = http
      .baseUrl("https://i.ytimg.com")
      .inferHtmlResources(AllowList(), DenyList(".*\\.js", ".*\\.css", ".*\\.gif", ".*\\.jpeg", ".*\\.jpg", ".*\\.ico", ".*\\.woff", ".*\\.woff2", ".*\\.(t|o)tf", ".*\\.png", ".*detectportal\\.firefox\\.com.*"))
    ;
    
    Map<CharSequence, String> headers_0 = new HashMap<>();
    headers_0.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9");
    headers_0.put("accept-encoding", "gzip, deflate, br");
    headers_0.put("accept-language", "en-GB,en-US;q=0.9,en;q=0.8");
    headers_0.put("sec-ch-ua", " Not A;Brand\";v=\"99\", \"Chromium\";v=\"99\", \"Google Chrome\";v=\"99");
    headers_0.put("sec-ch-ua-arch", "x86");
    headers_0.put("sec-ch-ua-bitness", "64");
    headers_0.put("sec-ch-ua-full-version", "99.0.4844.51");
    headers_0.put("sec-ch-ua-full-version-list", " Not A;Brand\";v=\"99.0.0.0\", \"Chromium\";v=\"99.0.4844.51\", \"Google Chrome\";v=\"99.0.4844.51");
    headers_0.put("sec-ch-ua-mobile", "?0");
    headers_0.put("sec-ch-ua-model", "");
    headers_0.put("sec-ch-ua-platform", "Linux");
    headers_0.put("sec-ch-ua-platform-version", "5.13.0");
    headers_0.put("sec-fetch-dest", "document");
    headers_0.put("sec-fetch-mode", "navigate");
    headers_0.put("sec-fetch-site", "none");
    headers_0.put("sec-fetch-user", "?1");
    headers_0.put("upgrade-insecure-requests", "1");
    headers_0.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/99.0.4844.51 Safari/537.36");
    headers_0.put("x-client-data", "CIy2yQEIo7bJAQipncoBCPbzygEIlaHLAQjr8ssBCJ75ywEI5oTMAQiljswBCMyYzAEI9ZrMAQjQm8wBCJqczAEIpZ/MAQjQoswB");
    
    Map<CharSequence, String> headers_2 = new HashMap<>();
    headers_2.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9");
    headers_2.put("accept-encoding", "gzip, deflate, br");
    headers_2.put("accept-language", "en-GB,en-US;q=0.9,en;q=0.8");
    headers_2.put("sec-ch-ua", " Not A;Brand\";v=\"99\", \"Chromium\";v=\"99\", \"Google Chrome\";v=\"99");
    headers_2.put("sec-ch-ua-arch", "x86");
    headers_2.put("sec-ch-ua-bitness", "64");
    headers_2.put("sec-ch-ua-full-version", "99.0.4844.51");
    headers_2.put("sec-ch-ua-full-version-list", " Not A;Brand\";v=\"99.0.0.0\", \"Chromium\";v=\"99.0.4844.51\", \"Google Chrome\";v=\"99.0.4844.51");
    headers_2.put("sec-ch-ua-mobile", "?0");
    headers_2.put("sec-ch-ua-model", "");
    headers_2.put("sec-ch-ua-platform", "Linux");
    headers_2.put("sec-ch-ua-platform-version", "5.13.0");
    headers_2.put("sec-fetch-dest", "document");
    headers_2.put("sec-fetch-mode", "navigate");
    headers_2.put("sec-fetch-site", "none");
    headers_2.put("sec-fetch-user", "?1");
    headers_2.put("service-worker-navigation-preload", "true");
    headers_2.put("upgrade-insecure-requests", "1");
    headers_2.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/99.0.4844.51 Safari/537.36");
    headers_2.put("x-client-data", "CIy2yQEIo7bJAQipncoBCPbzygEIlaHLAQjr8ssBCJ75ywEI5oTMAQiljswBCMyYzAEI9ZrMAQjQm8wBCJqczAEIpZ/MAQjQoswB");
    
    Map<CharSequence, String> headers_3 = new HashMap<>();
    headers_3.put("accept", "*/*");
    headers_3.put("accept-encoding", "gzip, deflate, br");
    headers_3.put("accept-language", "en-GB,en-US;q=0.9,en;q=0.8");
    headers_3.put("origin", "https://www.youtube.com");
    headers_3.put("sec-ch-ua", " Not A;Brand\";v=\"99\", \"Chromium\";v=\"99\", \"Google Chrome\";v=\"99");
    headers_3.put("sec-ch-ua-arch", "x86");
    headers_3.put("sec-ch-ua-bitness", "64");
    headers_3.put("sec-ch-ua-full-version", "99.0.4844.51");
    headers_3.put("sec-ch-ua-full-version-list", " Not A;Brand\";v=\"99.0.0.0\", \"Chromium\";v=\"99.0.4844.51\", \"Google Chrome\";v=\"99.0.4844.51");
    headers_3.put("sec-ch-ua-mobile", "?0");
    headers_3.put("sec-ch-ua-model", "");
    headers_3.put("sec-ch-ua-platform", "Linux");
    headers_3.put("sec-ch-ua-platform-version", "5.13.0");
    headers_3.put("sec-fetch-dest", "empty");
    headers_3.put("sec-fetch-mode", "cors");
    headers_3.put("sec-fetch-site", "cross-site");
    headers_3.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/99.0.4844.51 Safari/537.36");
    headers_3.put("x-client-data", "CIy2yQEIo7bJAQipncoBCPbzygEIlaHLAQjr8ssBCJ75ywEI5oTMAQiljswBCMyYzAEI9ZrMAQjQm8wBCJqczAEIpZ/MAQjQoswB");
    
    Map<CharSequence, String> headers_4 = new HashMap<>();
    headers_4.put("accept", "*/*");
    headers_4.put("accept-encoding", "gzip, deflate, br");
    headers_4.put("accept-language", "en-GB,en-US;q=0.9,en;q=0.8");
    headers_4.put("sec-ch-ua", " Not A;Brand\";v=\"99\", \"Chromium\";v=\"99\", \"Google Chrome\";v=\"99");
    headers_4.put("sec-ch-ua-arch", "x86");
    headers_4.put("sec-ch-ua-bitness", "64");
    headers_4.put("sec-ch-ua-full-version", "99.0.4844.51");
    headers_4.put("sec-ch-ua-full-version-list", " Not A;Brand\";v=\"99.0.0.0\", \"Chromium\";v=\"99.0.4844.51\", \"Google Chrome\";v=\"99.0.4844.51");
    headers_4.put("sec-ch-ua-mobile", "?0");
    headers_4.put("sec-ch-ua-model", "");
    headers_4.put("sec-ch-ua-platform", "Linux");
    headers_4.put("sec-ch-ua-platform-version", "5.13.0");
    headers_4.put("sec-fetch-dest", "manifest");
    headers_4.put("sec-fetch-mode", "cors");
    headers_4.put("sec-fetch-site", "same-origin");
    headers_4.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/99.0.4844.51 Safari/537.36");
    headers_4.put("x-client-data", "CIy2yQEIo7bJAQipncoBCPbzygEIlaHLAQjr8ssBCJ75ywEI5oTMAQiljswBCMyYzAEI9ZrMAQjQm8wBCJqczAEIpZ/MAQjQoswB");
    
    Map<CharSequence, String> headers_5 = new HashMap<>();
    headers_5.put("accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8");
    headers_5.put("accept-encoding", "gzip, deflate, br");
    headers_5.put("accept-language", "en-GB,en-US;q=0.9,en;q=0.8");
    headers_5.put("sec-ch-ua", " Not A;Brand\";v=\"99\", \"Chromium\";v=\"99\", \"Google Chrome\";v=\"99");
    headers_5.put("sec-ch-ua-arch", "x86");
    headers_5.put("sec-ch-ua-bitness", "64");
    headers_5.put("sec-ch-ua-full-version", "99.0.4844.51");
    headers_5.put("sec-ch-ua-full-version-list", " Not A;Brand\";v=\"99.0.0.0\", \"Chromium\";v=\"99.0.4844.51\", \"Google Chrome\";v=\"99.0.4844.51");
    headers_5.put("sec-ch-ua-mobile", "?0");
    headers_5.put("sec-ch-ua-model", "");
    headers_5.put("sec-ch-ua-platform", "Linux");
    headers_5.put("sec-ch-ua-platform-version", "5.13.0");
    headers_5.put("sec-fetch-dest", "image");
    headers_5.put("sec-fetch-mode", "no-cors");
    headers_5.put("sec-fetch-site", "cross-site");
    headers_5.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/99.0.4844.51 Safari/537.36");
    headers_5.put("x-client-data", "CIy2yQEIo7bJAQipncoBCPbzygEIlaHLAQjr8ssBCJ75ywEI5oTMAQiljswBCMyYzAEI9ZrMAQjQm8wBCJqczAEIpZ/MAQjQoswB");
    
    Map<CharSequence, String> headers_7 = new HashMap<>();
    headers_7.put("accept", "*/*");
    headers_7.put("accept-encoding", "gzip, deflate, br");
    headers_7.put("accept-language", "en-GB,en-US;q=0.9,en;q=0.8");
    headers_7.put("authorization", "SAPISIDHASH 1648541074_359394b4d60107fe3314b762c5024a7ea9e54b13");
    headers_7.put("content-type", "application/json");
    headers_7.put("origin", "https://www.youtube.com");
    headers_7.put("sec-ch-ua", " Not A;Brand\";v=\"99\", \"Chromium\";v=\"99\", \"Google Chrome\";v=\"99");
    headers_7.put("sec-ch-ua-arch", "x86");
    headers_7.put("sec-ch-ua-bitness", "64");
    headers_7.put("sec-ch-ua-full-version", "99.0.4844.51");
    headers_7.put("sec-ch-ua-full-version-list", " Not A;Brand\";v=\"99.0.0.0\", \"Chromium\";v=\"99.0.4844.51\", \"Google Chrome\";v=\"99.0.4844.51");
    headers_7.put("sec-ch-ua-mobile", "?0");
    headers_7.put("sec-ch-ua-model", "");
    headers_7.put("sec-ch-ua-platform", "Linux");
    headers_7.put("sec-ch-ua-platform-version", "5.13.0");
    headers_7.put("sec-fetch-dest", "empty");
    headers_7.put("sec-fetch-mode", "same-origin");
    headers_7.put("sec-fetch-site", "same-origin");
    headers_7.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/99.0.4844.51 Safari/537.36");
    headers_7.put("x-client-data", "CIy2yQEIo7bJAQipncoBCPbzygEIlaHLAQjr8ssBCJ75ywEI5oTMAQiljswBCMyYzAEI9ZrMAQjQm8wBCJqczAEIpZ/MAQjQoswB");
    headers_7.put("x-goog-authuser", "0");
    headers_7.put("x-goog-visitor-id", "Cgs0eDNCaTBqbkVSdyiO-4qSBg%3D%3D");
    headers_7.put("x-origin", "https://www.youtube.com");
    headers_7.put("x-youtube-client-name", "1");
    headers_7.put("x-youtube-client-version", "2.20220325.00.00");
    
    Map<CharSequence, String> headers_14 = new HashMap<>();
    headers_14.put("accept", "*/*");
    headers_14.put("accept-encoding", "gzip, deflate, br");
    headers_14.put("accept-language", "en-GB,en-US;q=0.9,en;q=0.8");
    headers_14.put("authorization", "SAPISIDHASH 1648541075_7514d6c8a8661c1d73f0ff5dc3f1b36d1f071e0d");
    headers_14.put("content-type", "application/json");
    headers_14.put("origin", "https://www.youtube.com");
    headers_14.put("sec-ch-ua", " Not A;Brand\";v=\"99\", \"Chromium\";v=\"99\", \"Google Chrome\";v=\"99");
    headers_14.put("sec-ch-ua-arch", "x86");
    headers_14.put("sec-ch-ua-bitness", "64");
    headers_14.put("sec-ch-ua-full-version", "99.0.4844.51");
    headers_14.put("sec-ch-ua-full-version-list", " Not A;Brand\";v=\"99.0.0.0\", \"Chromium\";v=\"99.0.4844.51\", \"Google Chrome\";v=\"99.0.4844.51");
    headers_14.put("sec-ch-ua-mobile", "?0");
    headers_14.put("sec-ch-ua-model", "");
    headers_14.put("sec-ch-ua-platform", "Linux");
    headers_14.put("sec-ch-ua-platform-version", "5.13.0");
    headers_14.put("sec-fetch-dest", "empty");
    headers_14.put("sec-fetch-mode", "same-origin");
    headers_14.put("sec-fetch-site", "same-origin");
    headers_14.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/99.0.4844.51 Safari/537.36");
    headers_14.put("x-client-data", "CIy2yQEIo7bJAQipncoBCPbzygEIlaHLAQjr8ssBCJ75ywEI5oTMAQiljswBCMyYzAEI9ZrMAQjQm8wBCJqczAEIpZ/MAQjQoswB");
    headers_14.put("x-goog-authuser", "0");
    headers_14.put("x-goog-visitor-id", "Cgs0eDNCaTBqbkVSdyiO-4qSBg%3D%3D");
    headers_14.put("x-origin", "https://www.youtube.com");
    headers_14.put("x-youtube-client-name", "1");
    headers_14.put("x-youtube-client-version", "2.20220325.00.00");
    
    Map<CharSequence, String> headers_17 = new HashMap<>();
    headers_17.put("accept", "*/*");
    headers_17.put("accept-encoding", "gzip, deflate, br");
    headers_17.put("accept-language", "en-GB,en-US;q=0.9,en;q=0.8");
    headers_17.put("content-type", "application/json+protobuf");
    headers_17.put("origin", "https://www.youtube.com");
    headers_17.put("sec-ch-ua", " Not A;Brand\";v=\"99\", \"Chromium\";v=\"99\", \"Google Chrome\";v=\"99");
    headers_17.put("sec-ch-ua-arch", "x86");
    headers_17.put("sec-ch-ua-bitness", "64");
    headers_17.put("sec-ch-ua-full-version", "99.0.4844.51");
    headers_17.put("sec-ch-ua-full-version-list", " Not A;Brand\";v=\"99.0.0.0\", \"Chromium\";v=\"99.0.4844.51\", \"Google Chrome\";v=\"99.0.4844.51");
    headers_17.put("sec-ch-ua-mobile", "?0");
    headers_17.put("sec-ch-ua-model", "");
    headers_17.put("sec-ch-ua-platform", "Linux");
    headers_17.put("sec-ch-ua-platform-version", "5.13.0");
    headers_17.put("sec-fetch-dest", "empty");
    headers_17.put("sec-fetch-mode", "cors");
    headers_17.put("sec-fetch-site", "cross-site");
    headers_17.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/99.0.4844.51 Safari/537.36");
    headers_17.put("x-client-data", "CIy2yQEIo7bJAQipncoBCPbzygEIlaHLAQjr8ssBCJ75ywEI5oTMAQiljswBCMyYzAEI9ZrMAQjQm8wBCJqczAEIpZ/MAQjQoswB");
    headers_17.put("x-goog-api-key", "AIzaSyDyT5W0Jh49F30Pqqtyfdf7pDLFKLJoAnw");
    headers_17.put("x-user-agent", "grpc-web-javascript/0.1");
    
    Map<CharSequence, String> headers_18 = new HashMap<>();
    headers_18.put("accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8");
    headers_18.put("accept-encoding", "gzip, deflate, br");
    headers_18.put("accept-language", "en-GB,en-US;q=0.9,en;q=0.8");
    headers_18.put("sec-ch-ua", " Not A;Brand\";v=\"99\", \"Chromium\";v=\"99\", \"Google Chrome\";v=\"99");
    headers_18.put("sec-ch-ua-arch", "x86");
    headers_18.put("sec-ch-ua-bitness", "64");
    headers_18.put("sec-ch-ua-full-version", "99.0.4844.51");
    headers_18.put("sec-ch-ua-full-version-list", " Not A;Brand\";v=\"99.0.0.0\", \"Chromium\";v=\"99.0.4844.51\", \"Google Chrome\";v=\"99.0.4844.51");
    headers_18.put("sec-ch-ua-mobile", "?0");
    headers_18.put("sec-ch-ua-model", "");
    headers_18.put("sec-ch-ua-platform", "Linux");
    headers_18.put("sec-ch-ua-platform-version", "5.13.0");
    headers_18.put("sec-fetch-dest", "image");
    headers_18.put("sec-fetch-mode", "no-cors");
    headers_18.put("sec-fetch-site", "same-site");
    headers_18.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/99.0.4844.51 Safari/537.36");
    headers_18.put("x-client-data", "CIy2yQEIo7bJAQipncoBCPbzygEIlaHLAQjr8ssBCJ75ywEI5oTMAQiljswBCMyYzAEI9ZrMAQjQm8wBCJqczAEIpZ/MAQjQoswB");
    
    Map<CharSequence, String> headers_19 = new HashMap<>();
    headers_19.put("accept", "*/*");
    headers_19.put("accept-encoding", "gzip, deflate, br");
    headers_19.put("accept-language", "en-GB,en-US;q=0.9,en;q=0.8");
    headers_19.put("sec-ch-ua", " Not A;Brand\";v=\"99\", \"Chromium\";v=\"99\", \"Google Chrome\";v=\"99");
    headers_19.put("sec-ch-ua-arch", "x86");
    headers_19.put("sec-ch-ua-bitness", "64");
    headers_19.put("sec-ch-ua-full-version", "99.0.4844.51");
    headers_19.put("sec-ch-ua-full-version-list", " Not A;Brand\";v=\"99.0.0.0\", \"Chromium\";v=\"99.0.4844.51\", \"Google Chrome\";v=\"99.0.4844.51");
    headers_19.put("sec-ch-ua-mobile", "?0");
    headers_19.put("sec-ch-ua-model", "");
    headers_19.put("sec-ch-ua-platform", "Linux");
    headers_19.put("sec-ch-ua-platform-version", "5.13.0");
    headers_19.put("sec-fetch-dest", "script");
    headers_19.put("sec-fetch-mode", "no-cors");
    headers_19.put("sec-fetch-site", "same-site");
    headers_19.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/99.0.4844.51 Safari/537.36");
    headers_19.put("x-client-data", "CIy2yQEIo7bJAQipncoBCPbzygEIlaHLAQjr8ssBCJ75ywEI5oTMAQiljswBCMyYzAEI9ZrMAQjQm8wBCJqczAEIpZ/MAQjQoswB");
    
    Map<CharSequence, String> headers_21 = new HashMap<>();
    headers_21.put("accept", "*/*");
    headers_21.put("accept-encoding", "gzip, deflate, br");
    headers_21.put("accept-language", "en-GB,en-US;q=0.9,en;q=0.8");
    headers_21.put("authorization", "SAPISIDHASH 1648541075_7514d6c8a8661c1d73f0ff5dc3f1b36d1f071e0d");
    headers_21.put("content-type", "application/json");
    headers_21.put("origin", "https://www.youtube.com");
    headers_21.put("sec-ch-ua", " Not A;Brand\";v=\"99\", \"Chromium\";v=\"99\", \"Google Chrome\";v=\"99");
    headers_21.put("sec-ch-ua-arch", "x86");
    headers_21.put("sec-ch-ua-bitness", "64");
    headers_21.put("sec-ch-ua-full-version", "99.0.4844.51");
    headers_21.put("sec-ch-ua-full-version-list", " Not A;Brand\";v=\"99.0.0.0\", \"Chromium\";v=\"99.0.4844.51\", \"Google Chrome\";v=\"99.0.4844.51");
    headers_21.put("sec-ch-ua-mobile", "?0");
    headers_21.put("sec-ch-ua-model", "");
    headers_21.put("sec-ch-ua-platform", "Linux");
    headers_21.put("sec-ch-ua-platform-version", "5.13.0");
    headers_21.put("sec-fetch-dest", "empty");
    headers_21.put("sec-fetch-mode", "cors");
    headers_21.put("sec-fetch-site", "same-origin");
    headers_21.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/99.0.4844.51 Safari/537.36");
    headers_21.put("x-client-data", "CIy2yQEIo7bJAQipncoBCPbzygEIlaHLAQjr8ssBCJ75ywEI5oTMAQiljswBCMyYzAEI9ZrMAQjQm8wBCJqczAEIpZ/MAQjQoswB");
    headers_21.put("x-goog-authuser", "0");
    headers_21.put("x-goog-visitor-id", "Cgs0eDNCaTBqbkVSdyiO-4qSBg%3D%3D");
    headers_21.put("x-origin", "https://www.youtube.com");
    headers_21.put("x-youtube-ad-signals", "dt=1648541072383&flash=0&frm&u_tz=330&u_his=2&u_h=768&u_w=1366&u_ah=741&u_aw=1294&u_cd=24&bc=31&bih=150&biw=1278&brdim=72%2C27%2C72%2C27%2C1294%2C27%2C1294%2C741%2C1294%2C150&vis=1&wgl=true&ca_type=image&bid=ANyPxKrpb02YhRy0AV84a6hXNeIEQG3AIjGwChwaQUwAUsIFwoNz_hiCz57brlaUsUNPkZHvgtD4m5e5kX-r75y_5SDwdrlxug");
    headers_21.put("x-youtube-client-name", "1");
    headers_21.put("x-youtube-client-version", "2.20220325.00.00");
    headers_21.put("x-youtube-device", "cbr=Chrome&cbrver=99.0.4844.51&ceng=WebKit&cengver=537.36&cos=X11&cplatform=DESKTOP");
    headers_21.put("x-youtube-identity-token", "QUFFLUhqbi1nTDg2SUx3WG5kWUlVakZ2ZzZsUUdiaFJvZ3w=");
    headers_21.put("x-youtube-page-cl", "437169989");
    headers_21.put("x-youtube-page-label", "youtube.desktop.web_20220325_00_RC00");
    headers_21.put("x-youtube-time-zone", "Asia/Calcutta");
    headers_21.put("x-youtube-utc-offset", "330");
    
    Map<CharSequence, String> headers_24 = new HashMap<>();
    headers_24.put("accept", "*/*");
    headers_24.put("accept-encoding", "gzip, deflate, br");
    headers_24.put("accept-language", "en-GB,en-US;q=0.9,en;q=0.8");
    headers_24.put("authorization", "SAPISIDHASH 1648541077_50637595b3d5ccf4d17dddc4dcf70a9ad58589f4");
    headers_24.put("content-type", "application/json");
    headers_24.put("origin", "https://www.youtube.com");
    headers_24.put("sec-ch-ua", " Not A;Brand\";v=\"99\", \"Chromium\";v=\"99\", \"Google Chrome\";v=\"99");
    headers_24.put("sec-ch-ua-arch", "x86");
    headers_24.put("sec-ch-ua-bitness", "64");
    headers_24.put("sec-ch-ua-full-version", "99.0.4844.51");
    headers_24.put("sec-ch-ua-full-version-list", " Not A;Brand\";v=\"99.0.0.0\", \"Chromium\";v=\"99.0.4844.51\", \"Google Chrome\";v=\"99.0.4844.51");
    headers_24.put("sec-ch-ua-mobile", "?0");
    headers_24.put("sec-ch-ua-model", "");
    headers_24.put("sec-ch-ua-platform", "Linux");
    headers_24.put("sec-ch-ua-platform-version", "5.13.0");
    headers_24.put("sec-fetch-dest", "empty");
    headers_24.put("sec-fetch-mode", "same-origin");
    headers_24.put("sec-fetch-site", "same-origin");
    headers_24.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/99.0.4844.51 Safari/537.36");
    headers_24.put("x-client-data", "CIy2yQEIo7bJAQipncoBCPbzygEIlaHLAQjr8ssBCJ75ywEI5oTMAQiljswBCMyYzAEI9ZrMAQjQm8wBCJqczAEIpZ/MAQjQoswB");
    headers_24.put("x-goog-authuser", "0");
    headers_24.put("x-goog-visitor-id", "Cgs0eDNCaTBqbkVSdyiO-4qSBg%3D%3D");
    headers_24.put("x-origin", "https://www.youtube.com");
    headers_24.put("x-youtube-client-name", "1");
    headers_24.put("x-youtube-client-version", "2.20220325.00.00");
    
    String uri01 = "https://jnn-pa.googleapis.com/$rpc/google.internal.waa.v1.Waa";
    
    String uri02 = "https://www.youtube.com";
    
    String uri03 = "https://youtube.com";
    
    String uri04 = "https://yt3.ggpht.com";
    
    String uri05 = "https://googleads.g.doubleclick.net/pagead/id";
    
    String uri07 = "https://www.google.com";
    
    String uri08 = "https://www.google.co.in/pagead/lvz";
    
    String uri09 = "https://fonts.googleapis.com";
    
    String uri10 = "https://suggestqueries-clients6.youtube.com";

    ScenarioBuilder scn = scenario("YoutubeSimulation")
      .exec(
        http("request_0")
          .get(uri03 + "/")
          .headers(headers_0)
          .resources(
            http("request_1")
              .get(uri09 + "/css2?family=Roboto:wght@300;400;500;700&family=YouTube+Sans:wght@300..900&display=swap"),
            http("request_2")
              .get(uri02 + "/")
              .headers(headers_2)
          )
      )
      .pause(1)
      .exec(
        http("request_3")
          .get(uri05)
          .headers(headers_3)
          .resources(
            http("request_4")
              .get(uri02 + "/manifest.webmanifest")
              .headers(headers_4),
            http("request_5")
              .get(uri07 + "/pagead/lvz?evtid=AKB78civN-6nEw7vCyZzbSMExSMo610i1guetcgPIt3Xt1lkmaBNFHPaqFEn9iY8_wgCj_uF_MH85cu2c-NwoXcgyHSYultjeg&req_ts=1648541071&pg=MainAppBootstrap%3AHome&az=1&sigh=AKFpyYXetC--lRmONvWlcgcF8EgAJh7Lpw")
              .headers(headers_5),
            http("request_6")
              .get(uri08 + "?evtid=AKB78civN-6nEw7vCyZzbSMExSMo610i1guetcgPIt3Xt1lkmaBNFHPaqFEn9iY8_wgCj_uF_MH85cu2c-NwoXcgyHSYultjeg&req_ts=1648541071&pg=MainAppBootstrap%3AHome&az=1&sigh=AKFpyYXetC--lRmONvWlcgcF8EgAJh7Lpw")
              .headers(headers_5),
            http("request_7")
              .post(uri02 + "/youtubei/v1/guide?key=AIzaSyAO_FJ2SlqU8Q4STEHLGCilw_Y9_11qcW8&prettyPrint=false")
              .headers(headers_7)
              .body(RawFileBody("youtubesimulation/0007_request.json")),
            http("request_8")
              .get("/vi/ftIPUowtX2Q/hq720.jpg?sqp=-oaymwEcCNAFEJQDSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLCx0EO8V0BDH2Z1cSyvb_bcwmvlTQ")
              .headers(headers_5),
            http("request_9")
              .get("/vi/7BOi0H59tXY/hq720.jpg?sqp=-oaymwEcCNAFEJQDSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLArk9CTBCHKJuyEGIxDdLcWUSy3lQ")
              .headers(headers_5),
            http("request_10")
              .get("/vi/NrJiXKwUjPI/hq720.jpg?sqp=-oaymwEcCNAFEJQDSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLAy_SGNgt720rne7coYI37VnpCMfQ")
              .headers(headers_5),
            http("request_11")
              .get("/vi/-S6gIx_EdpE/hqdefault.jpg?sqp=-oaymwEcCOADEI4CSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLCSRV4FFD6YNFDSQWpQAu39c6hLBw")
              .headers(headers_5),
            http("request_12")
              .post(uri02 + "/youtubei/v1/feedback?key=AIzaSyAO_FJ2SlqU8Q4STEHLGCilw_Y9_11qcW8&prettyPrint=false")
              .headers(headers_7)
              .body(RawFileBody("youtubesimulation/0012_request.json")),
            http("request_13")
              .get(uri04 + "/ytc/AKedOLTiJmFfGT-aofkUujqk3xp2Puaf7ZIZH2bNTDHcNK6JQb2VBinVrG_Yd8WE-XjF=s88-c-k-c0x00ffffff-no-rj-mo")
              .headers(headers_5),
            http("request_14")
              .post(uri02 + "/youtubei/v1/notification/get_unseen_count?key=AIzaSyAO_FJ2SlqU8Q4STEHLGCilw_Y9_11qcW8&prettyPrint=false")
              .headers(headers_14)
              .body(RawFileBody("youtubesimulation/0014_request.json")),
            http("request_15")
              .get(uri09 + "/css?family=Roboto:300italic,400italic,500italic,700italic"),
            http("request_16")
              .get(uri09 + "/css?family=Roboto+Mono:400"),
            http("request_17")
              .post(uri01 + "/Create")
              .headers(headers_17)
              .body(RawFileBody("youtubesimulation/0017_request.dat")),
            http("request_18")
              .get(uri10 + "/generate_204")
              .headers(headers_18),
            http("request_19")
              .get(uri10 + "/complete/search?client=youtube&hl=en&gl=in&gs_rn=64&gs_ri=youtube&tok=cr_qrDb6v_p_ORboYb6FDg&ds=yt&cp=0&gs_id=1&q=&callback=google.sbox.p50&gs_gbg=NsjIJa1Ug")
              .headers(headers_19),
            http("request_20")
              .post(uri01 + "/GenerateIT")
              .headers(headers_17)
              .body(RawFileBody("youtubesimulation/0020_request.dat")),
            http("request_21")
              .post(uri02 + "/youtubei/v1/log_event?alt=json&key=AIzaSyAO_FJ2SlqU8Q4STEHLGCilw_Y9_11qcW8")
              .headers(headers_21)
              .body(RawFileBody("youtubesimulation/0021_request.json")),
            http("request_22")
              .post(uri02 + "/youtubei/v1/log_event?alt=json&key=AIzaSyAO_FJ2SlqU8Q4STEHLGCilw_Y9_11qcW8")
              .headers(headers_21)
              .body(RawFileBody("youtubesimulation/0022_request.json"))
          )
      )
      .pause(1)
      .exec(
        http("request_23")
          .get(uri07 + "/gen_204?oq=&gs_l=youtube.1.0.35i362i39k1l10.0.0.0.2397.1.1.0.0.0.0.0.0..1.0....0...1ac..64.youtube..0.1.165.10...165.aDmT8v3hZT4")
          .headers(headers_5)
          .resources(
            http("request_24")
              .post(uri02 + "/youtubei/v1/search?key=AIzaSyAO_FJ2SlqU8Q4STEHLGCilw_Y9_11qcW8&prettyPrint=false")
              .headers(headers_24)
              .body(RawFileBody("youtubesimulation/0024_request.json")),
            http("request_25")
              .get("/vi/6Uc--YQMwf4/hq720.jpg?sqp=-oaymwEcCOgCEMoBSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLDPiBRx-FSx0tDbyq6iUyDjdDvpxQ"),
            http("request_26")
              .get(uri04 + "/ytc/AKedOLTKYjirNpyn49TaGZeaoeZx-Sj1txjnaXpwTmt3=s68-c-k-c0x00ffffff-no-rj"),
            http("request_27")
              .get("/vi/viNlhp_cJTk/hq720.jpg?sqp=-oaymwEcCOgCEMoBSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLBR52zwmfxAiSVXBV_ADtZpL82a6A"),
            http("request_28")
              .get(uri04 + "/ytc/AKedOLS1WWhxruaXGy0IN3hLBi_Asv6kMtEH8bV9M__wng=s68-c-k-c0x00ffffff-no-rj")
          )
      )
      .pause(1)
      .exec(
        http("request_29")
          .get("/vi/vsIlU-PXnEE/hq720.jpg?sqp=-oaymwEcCOgCEMoBSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLDWBysUM3rpk8BatlbXebDaZizB5g")
          .resources(
            http("request_30")
              .get("/vi/Mn2llTIEzSI/hq720.jpg?sqp=-oaymwEcCOgCEMoBSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLD8Aqt6q8USwfkad02waKFg-0zezg"),
            http("request_31")
              .get(uri04 + "/ytc/AKedOLRbsgYPb9T6GdbM35LsgczNYmF7fLW2YK1rgrXF=s68-c-k-c0x00ffffff-no-rj"),
            http("request_32")
              .get("/vi/aF-TuBghT9U/hqdefault.jpg?sqp=-oaymwEcCOADEI4CSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLA9DGF00ViKa77doTo9X5mquECjAA"),
            http("request_33")
              .get(uri04 + "/ytc/AKedOLR-0dHakbr9-L-2r8Xw2ddvM2dbxbajKSfE0AVSQkQ=s68-c-k-c0x00ffffff-no-rj"),
            http("request_34")
              .get("/an_webp/vsIlU-PXnEE/mqdefault_6s.webp?du=3000&sqp=CJPtipIG&rs=AOn4CLCCoyRGFjcryxYafABeqvNQcewO3A")
          )
      )
      .pause(1)
      .exec(
        http("request_35")
          .get("/vi/xudCSVTJMjQ/hq720.jpg?sqp=-oaymwEcCOgCEMoBSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLAnYahA1sErZ6MttJpGfoyHwszzUA")
          .resources(
            http("request_36")
              .get(uri04 + "/viPktvqVt5hRSZmMqCQCww6Dpt0318hUMcBt3XIj3YLkPB4QJjg8knMzwMNK7LMH5RkyTjXSatU=s68-c-k-c0x00ffffff-no-rj"),
            http("request_37")
              .get("/vi/5MYuQBQZ8Ys/hq720.jpg?sqp=-oaymwEcCOgCEMoBSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLCWnA6sm0psQUR0p2499B5JqxcM8w")
              .headers(headers_5),
            http("request_38")
              .get("/vi/o993CvUz4GQ/hq720.jpg?sqp=-oaymwEcCOgCEMoBSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLAjy1szLGUxRy2t8rEk5nHzGAqk_w")
              .headers(headers_5),
            http("request_39")
              .get("/vi_webp/o993CvUz4GQ/hqdefault.webp")
              .headers(headers_5),
            http("request_40")
              .get("/an_webp/xudCSVTJMjQ/mqdefault_6s.webp?du=3000&sqp=CMTFipIG&rs=AOn4CLBWBNrxauH25we6QRZFtY2n6WsRbA")
              .headers(headers_5)
          )
      );

	  setUp(scn.injectOpen(atOnceUsers(1))).protocols(httpProtocol);
  }
}
