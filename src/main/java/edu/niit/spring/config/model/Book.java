package edu.niit.spring.config.model;

import lombok.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * @author WU, Homer
 * @version 1.0
 * @date 2020/3/11 9:06
 */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Component
@ConfigurationProperties(prefix = "book")
public class Book {
    private String isdn;
    private String name;
    private String author;
    private Float price;
//   或者@Value(value = "description")
    @Value(value = "${book.description}")
    private String description;
    private List<String> fans;
    private Map<String,Integer> ranks;
}
