package com.example.bff.service

import com.example.bff.builder.DetailsZipCodeScreenBuilder
import org.springframework.stereotype.Service

@Service
class DetailsZipCodeService {
    fun createDetailsZipCodeScreen() = DetailsZipCodeScreenBuilder
}