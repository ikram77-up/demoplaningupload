package org.demoplaningupload.model;


import org.demoplaningupload.dto.EntiteGenericDTO;

public abstract class EntiteGeneric {



    public abstract <T extends EntiteGenericDTO>T convertToDTO();
}
