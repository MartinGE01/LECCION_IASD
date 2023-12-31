// lista_de_libros.dart

class ListaDeLibros {
  static List<Libro> obtenerLista() {
    return [
      Libro(
        titulo: 'Cien años de soledad',
        autor: 'Gabriel García Márquez',
        genero: 'Realismo mágico',
      ),
      Libro(
        titulo: '1984',
        autor: 'George Orwell',
        genero: 'Ciencia ficción',
      ),
      Libro(
        titulo: 'To Kill a Mockingbird',
        autor: 'Harper Lee',
        genero: 'Ficción histórica',
      ),
      // Agrega más libros según sea necesario
    ];
  }
}

class Libro {
  final String titulo;
  final String autor;
  final String genero;

  Libro({
    required this.titulo,
    required this.autor,
    required this.genero,
  });
}
