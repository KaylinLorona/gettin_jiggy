package com.example.demo.bootstrap;

import com.example.demo.domain.InhousePart;
import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.repositories.InhousePartRepository;
import com.example.demo.repositories.OutsourcedPartRepository;
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.service.OutsourcedPartService;
import com.example.demo.service.OutsourcedPartServiceImpl;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

/**
 *
 *
 *
 *
 */
@Component
public class BootStrapData implements CommandLineRunner {

    private final PartRepository partRepository;
    private final ProductRepository productRepository;

    private final OutsourcedPartRepository outsourcedPartRepository;

    public BootStrapData(PartRepository partRepository, ProductRepository productRepository, OutsourcedPartRepository outsourcedPartRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
        this.outsourcedPartRepository=outsourcedPartRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        if (partRepository.count() == 0) {

            //Creating object from the Part class
            InhousePart guitarPick = new InhousePart();
            InhousePart guitarString = new InhousePart();
            InhousePart ampCord = new InhousePart();
            InhousePart guitarBridge = new InhousePart();
            InhousePart guitarStrap = new InhousePart();

            //Setting the values for guitarPick
            guitarPick.setName("Guitar Pick");
            guitarPick.setPrice(2.99);
            guitarPick.setInv(75);
            //Saving in the repository
            partRepository.save(guitarPick);

            //Setting the values for guitarString
            guitarString.setName("Guitar String (4 strings mix & match)");
            guitarString.setPrice(15.99);
            guitarString.setInv(100);
            //Saving in the repository
            partRepository.save(guitarString);

            //Setting the values for ampCord
            ampCord.setName("Amp Cord");
            ampCord.setPrice(10.00);
            ampCord.setInv(15);
            //Saving in the repository
            partRepository.save(ampCord);

            //Setting the values for guitarBridge
            guitarBridge.setName("Guitar Bridge");
            guitarBridge.setPrice(9.50);
            guitarBridge.setInv(20);
            //Saving in the repository
            partRepository.save(guitarBridge);

            //Setting the values for guitarStrap
            guitarStrap.setName("Guitar Strap");
            guitarStrap.setPrice(10.50);
            guitarStrap.setInv(40);
            //Saving in the repository
            partRepository.save(guitarStrap);

        }

        if (productRepository.count() == 0) {

            //Creating object form the Product Class
            Product acousticGuitar = new Product("Acoustic Guitar",129.99,4);
            Product electricGuitar = new Product("Electric Guitar", 299.99, 2);
            Product fourStringBass = new Product("Four String Bass", 179.99, 5);
            Product electricGuitarAmp = new Product("Electric Guitar Amp", 99.99, 5);
            Product electricBassAmp = new Product("Electric Bass Amp", 99.99, 3);

            //Saving in the repository
            productRepository.save(acousticGuitar);
            productRepository.save(electricGuitar);
            productRepository.save(fourStringBass);
            productRepository.save(electricGuitarAmp);
            productRepository.save(electricBassAmp);

        }
       /*
        OutsourcedPart o= new OutsourcedPart();
        o.setCompanyName("Western Governors University");
        o.setName("out test");
        o.setInv(5);
        o.setPrice(20.0);
        o.setId(100L);
        outsourcedPartRepository.save(o);
        OutsourcedPart thePart=null;
        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            if(part.getName().equals("out test"))thePart=part;
        }

        System.out.println(thePart.getCompanyName());
        */
        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            System.out.println(part.getName()+" "+part.getCompanyName());
        }

        /*
        Product bicycle= new Product("bicycle",100.0,15);
        Product unicycle= new Product("unicycle",100.0,15);
        productRepository.save(bicycle);
        productRepository.save(unicycle);
        */

        System.out.println("Started in Bootstrap");
        System.out.println("Number of Products"+productRepository.count());
        System.out.println(productRepository.findAll());
        System.out.println("Number of Parts"+partRepository.count());
        System.out.println(partRepository.findAll());

    }
}
