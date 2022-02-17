package befiecole.befi.web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import befiecole.befi.DAO.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.http.ResponseEntity.BodyBuilder;
import java.io.IOException;
import befiecole.befi.Entity.*;


@RestController
@CrossOrigin("*")
public class evenementConsole {

    @Autowired
    private evenementRep evenementrep ;

    @PostMapping("/upload")
    public BodyBuilder uplaodImage(@RequestParam("imageFile") MultipartFile file) throws IOException {
        evenement E=new evenement(null,file.getOriginalFilename(), file.getContentType(), file.getBytes());
       /* System.out.println("Original Image Byte Size - " + file.getBytes().length);
        E.setNameImage(file.getOriginalFilename());
        E.setTypeImage(file.getContentType());
        E.setPicByte(file.getBytes());
        */
        evenementrep.save(E);
        return ResponseEntity.status(HttpStatus.OK);
    }
}
