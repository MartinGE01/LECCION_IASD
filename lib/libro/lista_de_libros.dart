import 'package:flutter/material.dart';

class ListaDeLibros extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text('Lista de Libros'),
      ),
      body: Container(
        decoration: BoxDecoration(
          image: DecorationImage(
            image: AssetImage('assets/images/fondo1.jpg'),
            fit: BoxFit.cover,
          ),
        ),
        child: GridView.count(
          crossAxisCount: 2,
          children: [
            LibroCard(
              titulo: 'Lecciones',
              descripcion: 'Lecciones diarias para aprender.',
              colorTexto: Colors.blue,
              imagen: 'assets/images/fondo2.jpg',
            ),
            LibroCard(
              titulo: 'Leccion 2024',
              descripcion: 'Material para Escuela Sabática 2024.',
              colorTexto: Colors.green,
              imagen: 'assets/images/fondo02.jpg',
            ),
            LibroCard(
              titulo: 'Matutinas',
              descripcion: 'Devocionales matutinos para inspirarte.',
              colorTexto: Colors.orange,
              imagen: 'assets/images/matutina.jpg',
            ),
            LibroCard(
              titulo: 'Año Bíblico',
              descripcion: 'Plan de lectura para el Año Bíblico.',
              colorTexto: Colors.purple,
              imagen: 'assets/images/año.jpg',
            ),
          ],
        ),
      ),
    );
  }
}

class LibroCard extends StatelessWidget {
  final String titulo;
  final String descripcion;
  final Color colorTexto;
  final String imagen;

  LibroCard({
    required this.titulo,
    required this.descripcion,
    required this.colorTexto,
    required this.imagen,
  });

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
        shape: RoundedRectangleBorder(
          borderRadius: BorderRadius.circular(15.0),
        ),
        child: Column(
          children: [
            Expanded(
              child: ClipRRect(
                borderRadius: BorderRadius.circular(15.0),
                child: Container(
                  decoration: BoxDecoration(
                    image: DecorationImage(
                      image: AssetImage(imagen),
                      fit: BoxFit.cover,
                    ),
                  ),
                ),
              ),
            ),
            Padding(
              padding: const EdgeInsets.all(8.0),
              child: Text(
                titulo,
                style: TextStyle(fontSize: 18, fontWeight: FontWeight.bold, color: colorTexto),
                textAlign: TextAlign.center,
              ),
            ),
            Padding(
              padding: const EdgeInsets.all(8.0),
              child: Text(
                descripcion,
                textAlign: TextAlign.center,
                style: TextStyle(color: colorTexto, fontSize: 14),
              ),
            ),
          ],
        ),
      ),
    );
  }
}
