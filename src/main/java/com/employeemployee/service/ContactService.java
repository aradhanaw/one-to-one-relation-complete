package com.employeemployee.service;

import com.employeemployee.dto.ContactDTO;

import java.util.List;

public interface ContactService {
    List<ContactDTO> getAll();
    ContactDTO save(ContactDTO contactDTO);
    ContactDTO getById(long id);
    void deleteById(long id);

    ContactDTO updateCon(long id, ContactDTO contactDTO);
}
