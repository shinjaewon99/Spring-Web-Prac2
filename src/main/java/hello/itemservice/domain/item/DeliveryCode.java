package hello.itemservice.domain.item;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DeliveryCode {
    // code는 Fast 같은 시스템에서 전달하는값, displayName은 "빠른 배송" 같이 고객에게 보여주는 값
    private String code;
    private String displayName;
}
