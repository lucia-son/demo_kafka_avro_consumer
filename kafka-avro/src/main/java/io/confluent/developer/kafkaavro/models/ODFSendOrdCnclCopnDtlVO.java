
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

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @ClassName : ODFSendOrdCnclCopnDtlVO
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
public class ODFSendOrdCnclCopnDtlVO {

    @Schema(description = "주문번호", example = "")    
    private String    ordNo;
    
    @Schema(description = "주문상세순번", example = "")    
    private Integer    ordPtcSeq;
    
    @Schema(description = "모바일쿠폰주문수량", example = "")    
    private Integer    mblCopnOrdQty;
    
    @Schema(description = "모바일쿠폰주문번호", example = "")    
    private String    mblCopnOrdNo;
    
    @Schema(description = "모바일쿠폰상품코드", example = "")    
    private String    mblCopnItemCd;
    
    @Schema(description = "파라미터전송성공여부", example = "")    
    private String    paraSendSuccYn;
    
    @Schema(description = "모바일쿠폰쿠폰번호", example = "")    
    private String    mblCopnCopnNo;

    @Schema(description = "비고", example = "")    
    private String    rmrk;

    public ODFSendOrdCnclCopnDtlVO(String ordNo, Integer ordPtcSeq, Integer mblCopnOrdQty, String mblCopnOrdNo, String mblCopnItemCd,String paraSendSuccYn, String mblCopnCopnNo,String rmrk) {
        this.ordNo = ordNo;
        this.ordPtcSeq = ordPtcSeq;
        this.mblCopnOrdQty = mblCopnOrdQty;
        this.mblCopnOrdNo = mblCopnOrdNo;
        this.mblCopnItemCd = mblCopnItemCd;
        this.paraSendSuccYn = paraSendSuccYn;
        this.mblCopnCopnNo = mblCopnCopnNo;
        this.rmrk = rmrk;
    }
}
