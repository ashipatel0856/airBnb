package com.ashish.projects.VrboApp.dto;
import com.ashish.projects.VrboApp.entity.HotelContactInfo;

import lombok.Data;

@Data
public class HotelDto {
    private Long id;
    private String name;
    private String city;
    private String[] photos;
    private String[] amenities;
    private HotelContactInfo contactInfo;
    private Boolean active;
}
