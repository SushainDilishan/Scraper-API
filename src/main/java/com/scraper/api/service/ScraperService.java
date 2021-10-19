package com.scraper.api.service;

import com.scraper.api.model.ResponseDTO;

import java.util.Set;

public interface ScraperService {

    Set<ResponseDTO> getVehicleByModel(String vehicleModel);
}
