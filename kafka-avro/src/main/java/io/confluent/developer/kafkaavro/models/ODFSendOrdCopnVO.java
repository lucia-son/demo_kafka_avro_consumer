
/**

 * @Description : 주문등록
 * @FileName : ODFMblCopnRsndDtlVO.java
 */
package io.confluent.developer.kafkaavro.models;

import java.math.BigDecimal;
import java.util.List;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @ClassName : ODFSendOrdCopnVO
 * @Description : 쿠폰 전송
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
public class ODFSendOrdCopnVO {
    
    @Schema(description = "구매자모바일전화지역번호", example = "")    
    private String    byrMblTela;   //senderMobileDdd

    //@Schema(description = "쿠폰 정보 리스트", example = "")
    List<ODFSendOrdCopnDtlVO> odfSendOrdCopnDtlVO;

    public ODFSendOrdCopnVO(String byrMblTela, List<ODFSendOrdCopnDtlVO> odfSendOrdCopnDtlVO) {
        this.byrMblTela = byrMblTela;
        this.odfSendOrdCopnDtlVO = odfSendOrdCopnDtlVO;
    }
}
