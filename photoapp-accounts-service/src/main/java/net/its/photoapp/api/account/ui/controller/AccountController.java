/**
 * Copyright (c) 2021, by Arlo Technologies, Inc. All rights reserved.
 *
 * This software is the confidential and proprietary information of Arlo Technologies, Inc.
 * ("Confidential Information"). You shall not disclose such Confidential Information and
 * shall use it only in accordance with the terms of the license agreement you entered into with
 * Arlo Technologies, Inc.
 */
package net.its.photoapp.api.account.ui.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    @GetMapping("/status/check")
    public String status() {
        return "Working";
    }
}
