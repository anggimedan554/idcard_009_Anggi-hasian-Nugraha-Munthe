/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pws.c.idcardproject;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author Lenovo
 */
public class Controlleridcard {
    
    @RequestMapping("/Projectidcard")
    @ResponseBody
    public String Projectidcard (@RequestParam ("Name") String text,
                                 @RequestParam ("Tanggal")@DateTimeFormat(pattern = "EEE-yyy-MM-dd")Date date,
                                 @RequestParam ("image") MultipartFile file, Model model )
            
                                 throws IOException {
        SimpleDateFormat tanggal = new SimpleDateFormat("EEE-yyy-MM-dd");
        
        String newTanggal = tanggal.format(date);
        
        String blob = Base64.encodeBase64String(file.getBytes());
        String gambar = "data:iamge/jpeg;base64,".concat(blob);
        
         model.addAttribute("Nm", text);
         model.addAttribute("tgl", newTanggal);
         model.addAttribute("gmbr",gambar);
         
        
         
         return "card";
         
         
         
         
         
                        
    }
    
    
    
}
