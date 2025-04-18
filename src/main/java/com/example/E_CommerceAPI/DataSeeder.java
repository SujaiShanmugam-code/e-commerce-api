package com.example.E_CommerceAPI;

import com.example.E_CommerceAPI.model.Product;
import com.example.E_CommerceAPI.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class DataSeeder implements CommandLineRunner
{
    @Autowired
    ProductRepo productRepo;

    public void run(String... args) throws Exception
    {
        if(productRepo.count() == 0)
        {
            List < Product> products = Arrays.asList(
                    new Product("Smartphone", 699.99, "Latest Android smartphone with AMOLED display", 4.5, "Electronics", "TechZone", 120, 87,Arrays.asList("https://picsum.photos/id/1/200/300")),
                    new Product("Wireless Headphones", 129.99, "Noise-canceling over-ear headphones", 4.7, "Audio", "SoundWave", 85, 42,Arrays.asList("https://picsum.photos/id/1/200/300")),
                    new Product("Running Shoes", 89.99, "Lightweight and comfortable running shoes", 4.2, "Footwear", "FitWear", 200, 65,Arrays.asList("https://picsum.photos/id/1/200/300")),
                    new Product("Smartwatch", 199.99, "Fitness tracking smartwatch with GPS", 4.6, "Wearables", "TimeTech", 60, 34,Arrays.asList("https://picsum.photos/id/1/200/300")),
                    new Product("Coffee Maker", 59.99, "Automatic drip coffee maker with timer", 4.3, "Home Appliances", "KitchenKing", 150, 78,Arrays.asList("https://picsum.photos/id/1/200/300"))
            );
            productRepo.saveAll(products);
            System.out.println("Demo data added!");

        }
    }

}
