
/**
 * Copyright(c) 2022-2023 Hyundai Mall All right reserved. This software is the proprietary
 * information of Hyundai Mall.
 * 
 * @Description : 주문등록
 * @FileName : ODFMblCopnRsndDtlVO.java
 * @Date : 2023.1.16
 * @Author : 신지원
 */
package io.confluent.developer.kafkaavro.models;

import java.math.BigDecimal;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @ClassName : ODFSendOrdCopnDtlVO
 * @Description : 쿠폰 전송 상세
 * @Author : 
 * @Since : 

 */
@ToString
@Getter
@Setter
public class ODFSendOrdCopnDtlVO {
    
    @Schema(description = "협력사코드", example = "")    
    private String    venCd;

    @Schema(description = "주문번호", example = "")    
    private String    ordNo;

    public ODFSendOrdCopnDtlVO(String venCd, String ordNo) {
        this.venCd = venCd;
        this.ordNo = ordNo;
    }
}
