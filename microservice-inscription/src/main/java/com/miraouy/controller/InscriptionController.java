package com.miraouy.controller;

import com.miraouy.Dto.Request.InscriptionRequestDto;
import com.miraouy.Dto.Response.InscriptionReesponseDto;
import com.miraouy.service.ServiceInscription;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/inscriptions")
@CrossOrigin("*")
public class InscriptionController {

    private  ServiceInscription serviceInscription;
    public InscriptionController(ServiceInscription serviceInscription) {
        this.serviceInscription = serviceInscription;
    }

    @PostMapping
    public InscriptionReesponseDto addInscription(@RequestBody InscriptionRequestDto inscription) {
        return serviceInscription.addInscription(inscription);
    }

    @GetMapping("/{id}")
    public InscriptionReesponseDto getInscription(@PathVariable  Long id) {
        return serviceInscription.getInscription(id);
    }


    public List<InscriptionReesponseDto> getAllInscription() {
        return serviceInscription.getAllInscription();
    }
}
