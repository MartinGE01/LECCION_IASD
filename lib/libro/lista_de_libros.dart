// lista_de_libros.dart
import 'package:flutter/material.dart';

class ListaDeLibros extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text('Lista de Libros'),
      ),
      body: GridView.count(
        crossAxisCount: 2, // Puedes ajustar el número de columnas según tus necesidades
        children: [
          LibroCard(titulo: 'Lecciónes'),
          LibroCard(titulo: 'Leccion Escuela Sabática 2024'),
          LibroCard(titulo: 'Matutinas'),
          LibroCard(titulo: 'Año Bíblico'),
        ],
      ),
    );
  }
}

class LibroCard extends StatelessWidget {
  final String titulo;

  LibroCard({required this.titulo});

  @override
  Widget build(BuildContext context) {
    return GestureDetector(
      onTap: () {
        // Agrega la lógica aquí para manejar la selección del tipo de libro
        // Puedes navegar a una nueva pantalla o realizar acciones específicas según el tipo de libro seleccionado
        print('Tipo de libro seleccionado: $titulo');
      },
      child: Card(
        margin: EdgeInsets.all(16),
        child: Padding(
          padding: EdgeInsets.all(16),
          child: Center(
            child: Text(
              titulo,
              style: TextStyle(fontSize: 18, fontWeight: FontWeight.bold),
            ),
          ),
        ),
      ),
    );
  }
}
