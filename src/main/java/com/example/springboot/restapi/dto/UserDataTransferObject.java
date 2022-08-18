package com.example.springboot.restapi.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserDataTransferObject {
    private int id;
    private String name;
    private String address;
}
