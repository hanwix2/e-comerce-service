package kr.hhplus.be.server.domain

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UserPointHistoryRepository : JpaRepository<UserPointHistory, Long>