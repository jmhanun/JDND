package com.udacity.pricing.service;

import com.udacity.pricing.domain.price.Price;

public interface PricingServiceInterface {
    public Price getPrice(Long vehicleId) throws PriceException;
}
