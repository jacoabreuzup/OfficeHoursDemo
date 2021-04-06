package com.example.bff.controller

import com.example.bff.service.DetailsZipCodeService
import com.example.bff.service.ZipCodeService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ScreenController(
    private val zipCodeService: ZipCodeService,
    private val detailsZipCodeService: DetailsZipCodeService
) {
    @GetMapping("/zipCode")
    fun getZipCodeScreen() = zipCodeService.createZipCodeScreen()

    @GetMapping("/details")
    fun getDetailsScreen() = detailsZipCodeService.createDetailsZipCodeScreen()
}