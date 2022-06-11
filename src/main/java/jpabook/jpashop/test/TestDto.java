package jpabook.jpashop.test;

import lombok.Data;

@Data
public class TestDto {

    private Long id;
    private String name;

    public TestDto(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
