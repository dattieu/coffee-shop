package com.coffeeshop.orderservice.service;

import com.coffeeshop.orderservice.dto.StoreDto;
import com.coffeeshop.orderservice.entity.Store;
import com.coffeeshop.orderservice.repository.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoreService {
    @Autowired
    StoreRepository storeRepository;

    public void updateStore(Long id, StoreDto storeDto){
       Store existedStore = storeRepository.findOneById(id);
        existedStore.setPhoneNumber(storeDto.getPhoneNumber());
        existedStore.setNumberOfQueue(storeDto.getNumberOfQueue());
        existedStore.setOpeningTime(storeDto.getOpeningTime());
        existedStore.setClosingTime(storeDto.getClosingTime());
    }

    public List<Store> getAllStores(){
        return storeRepository.findAll();
    }
}
