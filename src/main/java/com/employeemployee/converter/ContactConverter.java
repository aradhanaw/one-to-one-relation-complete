package com.employeemployee.converter;
import com.employeemployee.dto.ContactDTO;
import com.employeemployee.model.Contact;
import org.springframework.stereotype.Component;

@Component
public class ContactConverter extends Convertable<Contact, ContactDTO>{
    public Contact convertToEntity(ContactDTO dto) {
        return this.copyConvertToEntity(dto,new Contact());
    }
    public ContactDTO convertToDto(Contact entity) {
        if(entity == null){
            return null;
        }
        ContactDTO dto = new ContactDTO();
        dto.setContactid(entity.getId());
        dto.setPhonenumber1(entity.getPhonenumber1());
        dto.setPhonenumber2(entity.getPhonenumber2());
        return dto;
    }

    @Override
    public Contact copyConvertToEntity(ContactDTO dto, Contact entity) {
        if(dto == null || entity == null) {
            return entity;
        }
//        entity.setId(dto.getId());
//        entity.setId(dto.getContactid());
        entity.setPhonenumber1(dto.getPhonenumber1());
        entity.setPhonenumber2(dto.getPhonenumber2());


        return entity;
    }
}


