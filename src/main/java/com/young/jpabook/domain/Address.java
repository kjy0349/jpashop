package com.young.jpabook.domain;

import jakarta.persistence.Embeddable;
import lombok.Getter;

@Embeddable
@Getter
public class Address {
    private String city;
    private String street;
    private String zipcode;

    protected Address() {}
    /* 함부로 new로 생성하면 안됨.
    값 타입은 변경 불가능하게 설계해야 한다.
    public으로 두는 것 보다는 protected로 설정하는것이 더 안전함.
    이런 제약을 두는 이유는, JPA 구현 라이브러리가 리플렉션 같은 기술을 사용할 수 있게 하기 위해.
     */
}
