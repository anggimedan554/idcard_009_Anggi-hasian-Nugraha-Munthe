/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pws.c.idcardproject;

import java.io.IOException;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Lenovo
 */
public class Controlleridcard {
    
    @RequestMapping("/Projectidcard")
    public String Projectidcard (@RequestParam ("Name") String text,
                                 @RequestParam ("Tanggal")@DateTimeFormat(pattern = "yyy-MM-dd")Date date )
                                 throws IOException {
    
}
