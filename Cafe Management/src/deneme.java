

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class deneme {

    public static void main(String[] args) {
        String dosya = "deneme.txt";
        String path = "C:\\Users\\MSI\\Desktop\\" + dosya;
        File file = new File(path);
        try {
            if (!file.exists()) {

                file.createNewFile();
            } else {
                System.out.println("dosya mevcut");
                System.out.println(file.getName());//dosyanın adı
                System.out.println(file.getAbsolutePath());//dosyanın yolu
            }
        } catch (IOException ex) {
            System.out.println("Hata: " + ex.toString());
        }

        //okuma-1
        
        char veriler[] = new char[(int)file.length()];
        
            /*
        try {
            FileReader f2 = new FileReader(file);
            f2.read(veriler); read metodu içi boş olan dosyada -1 döner
            String okunan = new String(veriler);
            System.out.println(veriler);
        } catch (IOException ex) {
            Logger.getLogger(deneme.class.getName()).log(Level.SEVERE, null, ex);
        }
         */
        
        /*
        //okuma-2
        
        char veriler[] = new char[(int)file.length()];
        
            
        try {
            FileReader f2 = new FileReader(file);
            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine()){
                String okunan = scanner.nextLine();
                System.out.println(okunan);
            }
        } catch (IOException ex) {
            Logger.getLogger(deneme.class.getName()).log(Level.SEVERE, null, ex);
        }
        */
        
        
        
        
        
        
        
        
        
        
        
        // file.delete(); dosyayı siler
        /*
            dosyanın okunabilir-yazılabilir olduğunu kontrol etme
            System.out.println(file.canRead());
            System.out.println(file.canWrite());
            
            
            dosyanın adını değiştirme
            File file2 = new File("C:\\Users\\MSI\\Desktop\\test.txt");
            file.renameTo(file2);
         */
 /*
            //klasor
            String klasor="denemeKlasor";
            path="C:\\Users\\MSI\\Desktop\\"+klasor;
            File file2 = new File(path);
            file2.mkdir(); // klasör oluşturma
         */
    }
}
