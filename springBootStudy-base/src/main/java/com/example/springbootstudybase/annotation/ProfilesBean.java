package com.example.springbootstudybase.annotation;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * Created by yhb on 2022-02-08
 */
@Profile("dev")
@Component
@EnableConfigurationProperties(ProfilesBean.class)
@ConfigurationProperties(prefix = "properties")
@Data
public class ProfilesBean {

    private Map<String, Object> map;
}
