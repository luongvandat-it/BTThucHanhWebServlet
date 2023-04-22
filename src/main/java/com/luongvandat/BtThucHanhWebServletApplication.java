package com.luongvandat;

import com.luongvandat.models.ImportGoods;
import com.luongvandat.models.Order_;
import com.luongvandat.models.Product;
import com.luongvandat.services.ImportGoodsServices;
import com.luongvandat.services.OrderServices;
import com.luongvandat.services.ProductServices;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class BtThucHanhWebServletApplication {

    public static void main(String[] args) {
        SpringApplication.run(BtThucHanhWebServletApplication.class, args);
    }

//    @Bean
    public CommandLineRunner addData(ProductServices productServices, OrderServices orderServices, ImportGoodsServices importGoodsServices) {
        return args -> {
            productServices.save(new Product("Product1", "Desc product 1","image 1", "manu 1", 0));
            productServices.save(new Product("Product2", "Desc product 2","image 2", "manu 2", 1));
            orderServices.save(new Order_(new Date(), "Emp name 1", "Address 1"));
            orderServices.save(new Order_(new Date(), "Emp name 2", "Address 2"));
            importGoodsServices.save(new ImportGoods(new Date(), "Emp name 1", "Manu 1"));
            importGoodsServices.save(new ImportGoods(new Date(), "Emp name 2", "Manu 2"));
        };
    }
}
