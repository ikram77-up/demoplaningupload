package org.demoplaningupload.servce;


import org.demoplaningupload.model.Planing;
import org.demoplaningupload.repositories.PlaningRepository;
import org.demoplaningupload.uploadfileexel.ExcelHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;


@Service
public class PlaningImpl implements PlaningService{


    @Autowired
    PlaningRepository repository;


    @Override
    public void save(MultipartFile file) {
        try {
            List<Planing> planings = ExcelHelper.excelToPlaning(file.getInputStream());

            repository.saveAll(planings);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Planing> getAllPlaning() {
        return repository.findAll();
    }
}
