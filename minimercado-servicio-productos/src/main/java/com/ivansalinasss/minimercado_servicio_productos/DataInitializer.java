package com.ivansalinasss.minimercado_servicio_productos;

import com.ivansalinasss.minimercado_servicio_productos.model.Producto;
import com.ivansalinasss.minimercado_servicio_productos.model.Unidad;
import com.ivansalinasss.minimercado_servicio_productos.repository.ProductoRepository;
import com.ivansalinasss.minimercado_servicio_productos.repository.UnidadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;

@Component
@Profile("dev")
public class DataInitializer implements CommandLineRunner {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Autowired
    private ProductoRepository productoRepository;

    @Autowired
    private UnidadRepository unidadRepository;

    @Override
    public void run(String... args) throws Exception {

        mongoTemplate.getDb().drop();

        System.out.println("Poblando la base de datos con algunos productos");
        Unidad item = new Unidad("Item", "item", 0);
        Unidad kilos = new Unidad("Kilogramos", "kgs");

        unidadRepository.save(item);
        unidadRepository.save(kilos);

        List<Producto> productos = new LinkedList<Producto>();
        productos.add(new Producto("Alfajor", 5, item, 5000));
        productos.add(new Producto("Comida para gatos", 8.9, kilos, 3500));
        productos.add(new Producto("Manzana", 35.5, kilos, 14000));
        productos.add(new Producto("Yerba Mate 500gr.", 40, item, 5500));
        productos.add(new Producto("Coca Cola 500ml", 80, item, 5000));
        productos.add(new Producto("Arroz a granel", 36, kilos, 2300));
        productos.add(new Producto("Leche Entera 1L", 90, item, 6000));
        productos.add(new Producto("Pan Integral 500gr.", 50, item, 4500));
        productos.add(new Producto("Huevos Docena", 120, item, 9000));
        productos.add(new Producto("Mantequilla 200gr.", 30, item, 7500));
        productos.add(new Producto("Queso Mozzarella", 15, kilos, 25000));
        productos.add(new Producto("Jamón", 45, kilos, 8000));
        productos.add(new Producto("Azúcar 1kg", 70, item, 3200));
        productos.add(new Producto("Café 250gr.", 55, item, 15000));
        productos.add(new Producto("Té Verde 20 sobres", 65, item, 7000));
        productos.add(new Producto("Aceite de Girasol 1L", 40, item, 9000));
        productos.add(new Producto("Fideos Spaghetti 500gr.", 85, item, 3500));
        productos.add(new Producto("Harina de Trigo 1kg", 60, item, 3000));
        productos.add(new Producto("Jabón de Tocador", 150, item, 2500));
        productos.add(new Producto("Shampoo 500ml", 35, item, 12000));
        productos.add(new Producto("Papel Higiénico 4 rollos", 20, item, 8000));
        productos.add(new Producto("Cerveza 500ml", 100, item, 6000));
        productos.add(new Producto("Vino Tinto 750ml", 10, item, 30000));
        productos.add(new Producto("Jugo de Naranja 1L", 85, item, 7000));
        productos.add(new Producto("Galletas de Chocolate 200gr.", 60, item, 4000));
        productos.add(new Producto("Chocolates 100gr.", 55, item, 12000));
        productos.add(new Producto("Mermelada de Frutilla 400gr.", 75, item, 7500));
        productos.add(new Producto("Mayonesa 250gr.", 95, item, 5000));
        productos.add(new Producto("Salsa de Tomate 350gr.", 50, item, 5500));
        productos.add(new Producto("Avena 500gr.", 60, item, 6500));
        productos.add(new Producto("Miel 300gr.", 40, item, 9000));
        productos.add(new Producto("Detergente 1L", 50, item, 7000));
        productos.add(new Producto("Suavizante 1L", 45, item, 8000));
        productos.add(new Producto("Lavandina 1L", 75, item, 4000));
        productos.add(new Producto("Jabón en Polvo 1kg", 35, item, 12000));
        productos.add(new Producto("Gaseosa Lima-Limón 1L", 90, item, 5500));
        productos.add(new Producto("Cereal de Maíz 300gr.", 85, item, 8000));
        productos.add(new Producto("Maní Tostado 200gr.", 60, item, 5000));
        productos.add(new Producto("Ajo 250gr.", 70, item, 2500));
        productos.add(new Producto("Tomate", 50, kilos, 6000));
        productos.add(new Producto("Zanahoria", 60, kilos, 5000));
        productos.add(new Producto("Papas", 40, kilos, 4000));
        productos.add(new Producto("Cebolla", 30, kilos, 3500));
        productos.add(new Producto("Lechuga", 55, kilos, 4500));
        productos.add(new Producto("Pollo Entero", 25, kilos, 14000));
        productos.add(new Producto("Carne Molida", 20, kilos, 18000));
        productos.add(new Producto("Pescado Filete", 30, kilos, 22000));
        productos.add(new Producto("Yogur Natural 500gr.", 40, item, 6000));
        productos.add(new Producto("Queso Crema 200gr.", 65, item, 8500));
        productos.add(new Producto("Crema de Leche 200ml", 50, item, 7000));
        productos.add(new Producto("Manteca 250gr.", 35, item, 5500));
        productos.add(new Producto("Zumo de Manzana 1L", 80, item, 6500));
        productos.add(new Producto("Salsa Boloñesa 400gr.", 45, item, 9000));
        productos.add(new Producto("Pizza Congelada", 20, item, 15000));
        productos.add(new Producto("Helado de Vainilla 1L", 50, item, 10000));
        productos.add(new Producto("Papas Fritas Bolsa 200gr.", 120, item, 3500));
        productos.add(new Producto("Salsa de Soya 200ml", 90, item, 5000));
        productos.add(new Producto("Sal 1kg", 150, item, 2000));
        productos.add(new Producto("Pimienta Negra Molida 50gr.", 110, item, 6000));
        productos.add(new Producto("Curry en Polvo 100gr.", 85, item, 7000));
        productos.add(new Producto("Canela en Polvo 50gr.", 100, item, 5500));
        productos.add(new Producto("Cilantro Fresco 50gr.", 130, item, 4000));
        productos.add(new Producto("Laurel 20gr.", 95, item, 3000));
        productos.add(new Producto("Orégano 50gr.", 80, item, 2500));
        productos.add(new Producto("Vinagre de Manzana 500ml", 70, item, 3500));
        productos.add(new Producto("Mostaza 250gr.", 110, item, 4500));
        productos.add(new Producto("Ketchup 500gr.", 90, item, 4000));
        productos.add(new Producto("Aceitunas Verdes 250gr.", 75, item, 8000));
        productos.add(new Producto("Pepinillos en Vinagre 250gr.", 85, item, 6000));
        productos.add(new Producto("Atún en Lata 170gr.", 50, item, 9000));
        productos.add(new Producto("Sardinas en Lata 125gr.", 60, item, 7000));
        productos.add(new Producto("Sopa Instantánea 70gr.", 180, item, 1500));
        productos.add(new Producto("Fideos Instantáneos 80gr.", 200, item, 2500));
        productos.add(new Producto("Hummus 200gr.", 45, item, 10000));
        productos.add(new Producto("Yogur Griego 150gr.", 75, item, 5000));
        productos.add(new Producto("Tortillas de Trigo 300gr.", 65, item, 6000));
        productos.add(new Producto("Ensalada de Frutas 250gr.", 100, item, 7000));
        productos.add(new Producto("Muesli 500gr.", 80, item, 8000));
        productos.add(new Producto("Barritas de Granola 100gr.", 95, item, 5500));
        productos.add(new Producto("Cacao en Polvo 200gr.", 70, item, 8500));
        productos.add(new Producto("Leche de Almendras 1L", 55, item, 12000));
        productos.add(new Producto("Bebida Energética 500ml", 110, item, 9000));
        productos.add(new Producto("Turrón de Maní 100gr.", 150, item, 3000));
        productos.add(new Producto("Gelatina en Polvo 85gr.", 170, item, 2500));
        productos.add(new Producto("Crema para Café 250ml", 130, item, 6500));
        productos.add(new Producto("Caramelos Surtidos 200gr.", 60, item, 3500));
        productos.add(new Producto("Gomitas 150gr.", 120, item, 3000));
        productos.add(new Producto("Mentas 100gr.", 140, item, 2500));
        productos.add(new Producto("Chocolate en Barra 200gr.", 100, item, 10000));
        productos.add(new Producto("Cerveza Negra 500ml", 50, item, 8000));
        productos.add(new Producto("Whisky 750ml", 25, item, 55000));
        productos.add(new Producto("Vodka 750ml", 30, item, 40000));
        productos.add(new Producto("Gin 700ml", 20, item, 35000));
        productos.add(new Producto("Ron 750ml", 40, item, 30000));
        productos.add(new Producto("Tequila 750ml", 10, item, 50000));
        productos.add(new Producto("Champagne 750ml", 15, item, 60000));
        productos.add(new Producto("Sidra 1L", 35, item, 25000));
        productos.add(new Producto("Licor de Café 500ml", 55, item, 45000));
        productos.add(new Producto("Batido de Proteína 500gr.", 45, item, 7000));
        productos.add(new Producto("Frutas Secas 200gr.", 150, item, 9000));
        productos.add(new Producto("Almendras 150gr.", 80, item, 8500));
        productos.add(new Producto("Nueces 200gr.", 70, item, 12000));
        productos.add(new Producto("Pasas de Uva 250gr.", 100, item, 6000));
        productos.add(new Producto("Ciruelas Secas 200gr.", 90, item, 7000));
        productos.add(new Producto("Dátiles 200gr.", 85, item, 8000));
        productos.add(new Producto("Papaya Deshidratada 150gr.", 60, item, 7500));
        productos.add(new Producto("Mango Deshidratado 150gr.", 75, item, 8500));
        productos.add(new Producto("Ananá Deshidratado 150gr.", 55, item, 9000));
        productos.add(new Producto("Castañas de Cajú 200gr.", 95, item, 10000));
        productos.add(new Producto("Avellanas 200gr.", 130, item, 11000));
        productos.add(new Producto("Piña en Almíbar 500gr.", 65, item, 5500));
        productos.add(new Producto("Melocotones en Almíbar 500gr.", 75, item, 6500));
        productos.add(new Producto("Manzana Verde 1kg", 40, kilos, 16000));
        productos.add(new Producto("Naranjas 1kg", 50, kilos, 14000));
        productos.add(new Producto("Pera", 55, kilos, 15000));
        productos.add(new Producto("Kiwi", 45, kilos, 18000));
        productos.add(new Producto("Uva", 60, kilos, 20000));
        productos.add(new Producto("Duraznos", 70, kilos, 17000));
        productos.add(new Producto("Mandarinas", 90, kilos, 15000));
        productos.add(new Producto("Sandía", 80, kilos, 9000));
        productos.add(new Producto("Melón", 85, kilos, 11000));
        productos.add(new Producto("Frutilla", 100, kilos, 22000));
        productos.add(new Producto("Espinaca", 150, kilos, 12000));
        productos.add(new Producto("Coliflor", 130, kilos, 13000));
        productos.add(new Producto("Brócoli", 140, kilos, 14000));
        productos.add(new Producto("Berenjena", 110, kilos, 12000));
        productos.add(new Producto("Zucchini", 90, kilos, 10000));
        productos.add(new Producto("Pimiento Rojo", 95, kilos, 15000));
        productos.add(new Producto("Pepino", 75, kilos, 8000));
        productos.add(new Producto("Calabaza", 65, kilos, 6000));
        productos.add(new Producto("Choclo", 50, kilos, 5000));
        productos.add(new Producto("Apio", 45, kilos, 5500));
        productos.add(new Producto("Cebolla Morada", 40, kilos, 7000));
        productos.add(new Producto("Remolacha", 35, kilos, 6500));
        productos.add(new Producto("Albahaca Fresca 50gr.", 60, item, 4000));
        productos.add(new Producto("Perejil 50gr.", 70, item, 3500));
        productos.add(new Producto("Romero 50gr.", 80, item, 3000));
        productos.add(new Producto("Tomillo 50gr.", 90, item, 2500));
        productos.add(new Producto("Jengibre Fresco 200gr.", 55, item, 4500));
        productos.add(new Producto("Aguacate", 85, kilos, 12000));
        productos.add(new Producto("Champiñones", 75, kilos, 8000));
        productos.add(new Producto("Rúcula", 65, kilos, 4000));
        productos.add(new Producto("Espárragos", 60, kilos, 14000));
        productos.add(new Producto("Garbanzos en lata 500gr.", 85, item, 7000));
        productos.add(new Producto("Lentejas en lata 500gr.", 75, item, 6000));
        productos.add(new Producto("Porotos paquete 1kg", 55, item, 900));

        productoRepository.saveAll(productos);
        System.out.println("Se pobló la db");
    }

}
