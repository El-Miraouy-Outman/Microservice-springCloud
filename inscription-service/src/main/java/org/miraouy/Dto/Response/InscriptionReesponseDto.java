package org.miraouy.Dto.Response;

import lombok.Builder;
import lombok.Data;

import java.util.Date;
@Data
@Builder
public class InscriptionReesponseDto {

        private String specialite;
        private Date dateinscription;
        private String niveau;
       // private int idClient;
        private ClientResponse clientResponse;
    }

