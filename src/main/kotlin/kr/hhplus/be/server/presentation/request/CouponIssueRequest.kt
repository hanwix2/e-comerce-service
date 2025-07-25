package kr.hhplus.be.server.presentation.request

import io.swagger.v3.oas.annotations.media.Schema

@Schema(description = "쿠폰 발급 요청")
data class CouponIssueRequest(

    @Schema(description = "유저 ID", example = "1")
    val userId: Long,

    @Schema(description = "발급받을 쿠폰 ID", example = "12345")
    val couponId: Long
)
