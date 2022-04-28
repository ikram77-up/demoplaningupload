package org.demoplaningupload.servce;

import org.demoplaningupload.model.Planing;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface PlaningService {

    void save(MultipartFile file);
    List<Planing> getAllPlaning();

}
