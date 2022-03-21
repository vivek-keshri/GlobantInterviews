package Others;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Builder
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
class ApiClientConfiguration {

    private String host;
    private int port;
    private boolean useHttps;

    private long connectTimeout;
    private long readTimeout;

    private String username;
    private String password;

    // Whatever other options you may thing.

    // Empty constructor? All combinations?

    // getters... and setters?
}

public class Lombok_Demo {
    public static void main(String[] args) {
        ApiClientConfiguration config =
                ApiClientConfiguration.builder()
                        .host("api.server.com")
                        .port(443)
                        .useHttps(true)
                        .connectTimeout(15_000L)
                        .readTimeout(5_000L)
                        .username("username")
                        .password("secret")
                        .build();
        System.out.println(config);
    }

}
