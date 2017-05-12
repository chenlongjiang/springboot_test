package com.chenlong.configuration;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by dell、 on 2017/5/12.
 */

@Setter@Getter
@ConfigurationProperties(prefix = "girl")
@Component
public class GirlProperties {

    private String cupsize;
    private String age;


}
