package API.TodayWeather;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TodayWeatherAPI {
    public static String TodayWeather() {
        HttpURLConnection conn = null;
        BufferedReader rd = null;
        try {
            // 30분전 시간을 구해온다.
            LocalDateTime t = LocalDateTime.now().minusMinutes(30);
            StringBuilder urlBuilder = new StringBuilder(
                    "http://apis.data.go.kr/1360000/VilageFcstInfoService_2.0/getUltraSrtNcst"); // URL
            // 인증키 (sample사용시에는 호출시 제한됩니다.)
            urlBuilder.append("?" + URLEncoder.encode("ServiceKey", "UTF-8")
                    + "=fGafHLOhEHmjLJ7RYkP8GcvmkGFi2ZRMEYCx43ZVSWVqS0U4yU4G8CQ3Xyrk%2Fd0sZkRfWIjwwWt91NX4%2F%2FxZOQ%3D%3D");
            // 요청파일타입 (xml,xmlf,xls,json) */
            urlBuilder.append("&" + URLEncoder.encode("dataType", "UTF-8") + "=" + URLEncoder.encode("JSON", "UTF-8"));
            // 한 페이지 결과 수 Default: 10 */
            urlBuilder.append("&" + URLEncoder.encode("numOfRows", "UTF-8") + "=" + URLEncoder.encode("10", "UTF-8"));
            // 페이지번호 */
            urlBuilder.append("&" + URLEncoder.encode("pageNo", "UTF-8") + "=" + URLEncoder.encode("1", "UTF-8"));
            // 발표일 */
            urlBuilder.append(
                    "&" + URLEncoder.encode("base_date", "UTF-8") + "="
                            + URLEncoder.encode(t.format(DateTimeFormatter.ofPattern("yyyyMMdd")), "UTF-8"));
            // hh시 발표 정시단위 - 매시각 40분 이후 호출 */
            urlBuilder.append("&" + URLEncoder.encode("base_time", "UTF-8") + "="
                    + URLEncoder.encode(t.format(DateTimeFormatter.ofPattern("HHmm")), "UTF-8"));
            // 예보지점의 X 좌표값 */
            urlBuilder.append("&" + URLEncoder.encode("nx", "UTF-8") + "=" + URLEncoder.encode("59", "UTF-8"));
            // 예보지점의 Y 좌표값 */
            urlBuilder.append("&" + URLEncoder.encode("ny", "UTF-8") + "=" + URLEncoder.encode("73", "UTF-8"));

            URL url = new URL(urlBuilder.toString());
            conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Content-type", "application/json");
            System.out.println("Response code: " + conn.getResponseCode()); // 연결 자체에 대한 확인이 필요하므로 추가합니다. */

            // 서비스코드가 정상이면 200~300사이의 숫자가 나옵니다.
            if (conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
                rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            } else {
                rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
            }
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = rd.readLine()) != null) {
                sb.append(line);
            }
            return sb.toString();
        } catch (ConnectException e){
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rd != null)
                    rd.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            conn.disconnect();
        }
        return null;
    }
}