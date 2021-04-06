package com.example.bff.service

import com.example.bff.builder.ZipCodeScreenBuilder
import org.springframework.stereotype.Service

@Service
class ZipCodeService {
    fun createZipCodeScreen() = ZipCodeScreenBuilder
}