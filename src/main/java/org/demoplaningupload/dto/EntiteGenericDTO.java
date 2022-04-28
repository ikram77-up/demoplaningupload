package org.demoplaningupload.dto;


import org.demoplaningupload.model.EntiteGeneric;

public abstract class EntiteGenericDTO {

    Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public abstract <T extends EntiteGeneric>T convertToEntity();
}
