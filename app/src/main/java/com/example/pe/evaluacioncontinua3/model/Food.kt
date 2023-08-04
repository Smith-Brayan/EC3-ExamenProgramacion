package com.example.pe.evaluacioncontinua3.model

import java.io.Serializable

data class Food(
    val name: String = "",
    val detail: String = "",
    val image: String = "",
    val price: Double = 0.0,
    val ingredient: String = ""
) : Serializable {

    fun createListOfFoots(): List<Food> {
        return listOf(
            Food(
                "Ceviche",
                "El ceviche es uno de los platos más emblemáticos de la gastronomía peruana. Se prepara con pescado fresco y jugo de limón, que actúa como una especie de \"cocina ácida\", marinando y cocinando el pescado. La combinación de limón, ají amarillo, cebolla roja y cilantro le da un sabor fresco y picante. Se sirve con camote (batata), maíz tierno y lechuga, lo que proporciona una experiencia de sabores y texturas verdaderamente única y refrescante.",
                "https://cevicheweb.com/wp-content/uploads/2019/04/83.-ceviche-blanco-peruano.jpg",
                18.00,
                "● 1 lb de pescado blanco fresco, cortado en cubos\n" +
                        "● 1 taza de jugo de limón fresco\n" +
                        "● 1 cebolla roja grande, cortada en juliana\n" +
                        "● 1 ají amarillo fresco, sin semillas y picado en cubos pequeños\n" +
                        "● 1 ramita de cilantro fresco, picado\n" +
                        "● Sal y pimienta al gusto\n" +
                        "● Camote cocido, en rodajas\n" +
                        "● Maíz tierno cocido\n" +
                        "● Hojas de lechuga para decorar"
            ),
            Food(
                "Lomo Saltado",
                "El lomo saltado es una deliciosa fusión de la cocina peruana y la china. Es un plato wok que combina tiras de carne de res, cebolla, tomate y ají amarillo, todo salteado a fuego alto para mantener la textura jugosa de la carne y las verduras. Luego, se mezcla con papas fritas crujientes y se sazona con salsa de soja, vinagre y especias. El resultado es una explosión de sabores y una mezcla perfecta entre la comida criolla y la oriental.",
                "https://buenazo.cronosmedia.glr.pe/original/2022/06/20/62aea00d119a8801813a563b.jpg",
                24.56,
                "● 1 lb de carne de res, cortada en tiras\n" +
                        "● 1 cebolla roja, cortada en tiras\n" +
                        "● 2 tomates medianos, cortados en tiras\n" +
                        "● 1 ají amarillo fresco, cortado en tiras\n" +
                        "● 3 cucharadas de salsa de soja\n" +
                        "● 2 cucharadas de vinagre\n" +
                        "● 2 cucharadas de aceite vegetal\n" +
                        "● Papas fritas\n" +
                        "● Arroz cocido"
            ),
            Food(
                "Aji de Gallina",
                "El aji de gallina es un guiso cremoso y reconfortante que tiene sus raíces en la época colonial. Se prepara con pollo desmenuzado y cocinado en una deliciosa salsa de ají amarillo, nueces, leche y pan remojado. Esta combinación de ingredientes le da al plato su característico sabor suave y ligeramente picante. Se sirve con arroz blanco, papas cocidas y rodajas de huevo duro, lo que crea una experiencia de sabor equilibrado y satisfactorio.",
                "https://decomidaperuana.com/wp-content/uploads/2017/09/receta-de-aji-de-gallina.jpg",
                19.90,
                "● 1 pechuga de pollo cocida, desmenuzada\n" +
                        "● 4 ajíes amarillos frescos, sin semillas y desvenados\n" +
                        "● 4 galletas de soda (o pan remojado en leche)\n" +
                        "● 1 taza de leche evaporada\n" +
                        "● 1 cebolla grande, picada\n" +
                        "● 3 dientes de ajo\n" +
                        "● 1/2 taza de nueces\n" +
                        "● 1 rebanada de pan de molde\n" +
                        "● 2 cucharadas de aceite vegetal\n" +
                        "● 4 papas amarillas cocidas, cortadas en rodajas\n" +
                        "● Aceitunas negras y huevos duros para decorar\n" +
                        "● Arroz blanco cocido"
            ),
            Food(
                "Anticuchos",
                "Los anticuchos son una delicia popular en los puestos de comida callejera en Perú. Se trata de brochetas de carne, tradicionalmente hechas con corazón de res, aunque también se pueden encontrar de pollo o pescado. La carne se adoba en una mezcla de ají panca, vinagre, ajo y otras especias, lo que le da un sabor deliciosamente picante y sabroso. Los anticuchos se asan a la parrilla y se sirven acompañados de papas y choclo (maíz tierno), lo que los convierte en una opción ideal para disfrutar con amigos y familiares.",
                "https://comidasperuanas.net/wp-content/uploads/2015/06/Anticuchos-de-Coraz%C3%B3n-Peruanos.jpg",
                22.50,
                "● 1 lb de corazón de res, cortado en cubos\n" +
                        "● 1/4 taza de vinagre tinto\n" +
                        "● 1/4 taza de ají panca molido\n" +
                        "● 2 dientes de ajo\n" +
                        "● 1 cucharadita de comino molido\n" +
                        "● Sal y pimienta al gusto\n" +
                        "● Brochetas de madera\n" +
                        "● Papas cocidas y choclo para acompañar"
            ),
            Food(
                "Causa Limeña",
                "Causa limeña un plato frío y refrescante, perfecto para los días calurosos. Consiste en capas de puré de papa amarilla sazonado con ají amarillo y limón. Entre las capas, se coloca una deliciosa mezcla de pollo, atún o mariscos, con mayonesa y algunos toques de ají amarillo. La presentación es colorida y atractiva, ya que suele decorarse con aceitunas, huevo duro y perejil, lo que le da un aspecto festivo y apetitoso.",
                "https://cdn0.recetasgratis.net/es/posts/8/6/2/causa_limena_31268_orig.jpg",
                13.50,
                "● 3 tazas de puré de papa amarilla\n" +
                        "● 1/4 taza de ají amarillo molido\n" +
                        "● 1 limón (su jugo)\n" +
                        "● 2 cucharadas de aceite vegetal\n" +
                        "● Sal y pimienta al gusto\n" +
                        "● 2 latas de atún en agua, escurrido\n" +
                        "● 1 taza de mayonesa\n" +
                        "● 1 cucharada de pasta de ají amarillo\n" +
                        "● Hojas de lechuga y rodajas de huevo duro para decorar"
            ),
            Food(
                "Rocoto Relleno",
                "El rocoto relleno es un plato característico de la región de Arequipa en Perú. El rocoto es un pimiento picante y se rellena con una mezcla de carne molida (generalmente res o cerdo), cebolla, ajo, nueces y queso fresco. La preparación del rocoto incluye un paso importante para reducir su picor, que consiste en remojarlo en agua con sal y vinagre. Luego, los rocotos se gratinan con queso y se sirven acompañados de papas cocidas, logrando una combinación deliciosa entre lo picante del rocoto y lo reconfortante de la carne y el queso derretido.",
                "https://mirecetadehoy.com/wp-content/uploads/2022/11/rocoto-relleno_700x466.jpg",
                15.00,
                "● 6 rocotos medianos\n" +
                        "● 1 lb de carne molida de res o cerdo\n" +
                        "● 1/2 taza de cebolla picada\n" +
                        "● 2 dientes de ajo picados\n" +
                        "● 1/4 taza de ají panca molido\n" +
                        "● 1/4 taza de ají amarillo molido\n" +
                        "● 1 taza de queso fresco rallado\n" +
                        "● 1 taza de leche evaporada\n" +
                        "● 2 cucharadas de aceite vegetal\n" +
                        "● Papas cocidas para acompañar"
            ),
            Food(
                "Arroz con Mariscos",
                "El arroz con mariscos es un plato que combina lo mejor de la cocina peruana y su abundante mariscos frescos. Se prepara con arroz, mariscos diversos como camarones, calamares y mejillones, y se cocina en un caldo de pescado sazonado con ají amarillo, cerveza y salsa de tomate. El resultado es un plato sabroso y lleno de sabor, con el arroz absorbiendo los jugos de los mariscos y convirtiéndose en una delicia de mar y tierra.",
                "https://i.ytimg.com/vi/9SoBTd0OdA4/maxresdefault.jpg",
                25.00,
                "● 2 tazas de arroz\n" +
                        "● 1 lb de mariscos variados (camarones, calamares, mejillones, etc.)\n" +
                        "● 1 cebolla grande, picada\n" +
                        "● 2 dientes de ajo, picados\n" +
                        "● 1/4 taza de ají amarillo molido\n" +
                        "● 1/2 taza de cerveza\n" +
                        "● 1/2 taza de salsa de tomate\n" +
                        "● 2 cucharadas de aceite vegetal\n" +
                        "● Caldo de pescado\n" +
                        "● Sal y pimienta al gusto\n" +
                        "● Cilantro fresco picado para decorar"
            )
        )
    }
}
