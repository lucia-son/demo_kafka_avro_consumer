
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

import java.util.List;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @ClassName : ODFSendOrdCnclCopnVO
 * @Description : 쿠폰 전송 취소 
 * @Author : 
 * @Since : 
 * 
 * <pre>
 *   date           author         description
 *   ========       ========       ===============
 *     
 * </pre>
 */
@ToString
@Getter
@Setter
public class ODFSendOrdCnclCopnVO {
    
    @Schema(description = "모바일쿠폰유형 구분코드", example = "")    
    private String    mblCopnTypeGbcd;
    
    List<ODFSendOrdCnclCopnDtlVO> odfSendOrdCnclCopnDtlVO;
}
