paquete  c3actividad1 ;


importar  c3actividad1*;

 clase  pública Principal {

    public  static  void  main ( String [] args ) {

        Libro1 = Libro nuevo ( 1 , "El Gato Feliz" , 2016 );
        Libro2 = Libro nuevo  (2 , "Ana Frank" , 2020 );
        Libro3 = Libro nuevo  (3 , "Cien años de soledad" , 2021 );
        Revista1 = nueva  Revista ( 17 , "Top 10 mejores juegos actuales" , 2022 , 235 );
        Revista2 = nueva  Revista ( 25 , "People" , 2015 , 55 );
        Revista2 = nueva  Revista ( 200 , "La pandemia" , 2019 , 45 );

        l2 . prestar ();

        sistema _ fuera _ println ( l2 . toString ());

        Publicacion [] lista = { l1 , l2 , r1 , r2 };

        Biblioteca  b = nueva  Biblioteca ();

        sistema _ fuera _ println ( b . cuentaPrestados ( lista ));

        sistema _ fuera _ println ( b . publicacionesAnterioresA ( 1990 , lista ));


    }

