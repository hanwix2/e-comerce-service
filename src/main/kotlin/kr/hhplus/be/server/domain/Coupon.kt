package kr.hhplus.be.server.domain

import jakarta.persistence.*

@Entity
class Coupon(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0L,

    var name: String = "",

    var discountAmount: Long = 0L,

    @Enumerated(EnumType.STRING)
    var discountType: DiscountType = DiscountType.PRICE,

    var issueLimit: Long = 0L,

    var issuedRemain: Long = 0L,

    var issuable: Boolean = true,

    @Version
    var version: Long = 1L
) {

    fun decreaseIssuedRemain() {
        if (issuedRemain <= 0) {
            throw IllegalStateException("No remaining coupons to issue.")
        }
        issuedRemain--
    }

}