// main.dart
import 'package:flutter/material.dart';
import 'libro/lista_de_libros.dart';


void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      title: 'BOOK APP',
      theme: ThemeData(
        scaffoldBackgroundColor: Colors.white,
        textTheme: Theme.of(context).textTheme.apply(
          displayColor: Colors.black,
        ),
      ),
      initialRoute: '/',
      routes: {
        '/': (context) => WelcomeScreen(),
        '/lista_de_libros': (context) => ListaDeLibros(),
      },
    );
  }
}

class WelcomeScreen extends StatefulWidget {
  @override
  _WelcomeScreenState createState() => _WelcomeScreenState();
}

class _WelcomeScreenState extends State<WelcomeScreen>
    with SingleTickerProviderStateMixin {
  late AnimationController _controller;
  late Animation<double> _fadeAnimation;

  @override
  void initState() {
    super.initState();

    _controller = AnimationController(
      vsync: this,
      duration: Duration(seconds: 2),
    );

    _fadeAnimation = Tween<double>(begin: 0.0, end: 1.0).animate(
      CurvedAnimation(parent: _controller, curve: Curves.easeInOut),
    );

    _controller.forward(); // Start the animation
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      body: AnimatedBuilder(
        animation: _controller,
        builder: (context, child) {
          return Opacity(
            opacity: _fadeAnimation.value,
            child: Container(
              width: double.infinity,
              decoration: BoxDecoration(
                image: DecorationImage(
                  image: AssetImage("assets/images/Bitmap.png"),
                  fit: BoxFit.fill,
                ),
              ),
              child: Column(
                mainAxisAlignment: MainAxisAlignment.center,
                children: <Widget>[
                  Column(
                    children: <Widget>[
                      RichText(
                        text: TextSpan(
                          style: Theme.of(context).textTheme.headline3,
                          children: [
                            TextSpan(
                              text: "Leccion ", // Add your text here
                            ),
                            TextSpan(
                              text: "ISD",
                              style: TextStyle(fontWeight: FontWeight.bold),
                            ),
                          ],
                        ),
                      ),
                      RoundedButton(
                        text: "star",
                        fontSize: 20,
                        verticalPadding: 16,
                        horizontalPadding: 30,
                        press: () {
                          Navigator.pushNamed(context, '/lista_de_libros');
                        },
                      ),
                    ],
                  ),
                ],
              ),
            ),
          );
        },
      ),
    );
  }

  @override
  void dispose() {
    _controller.dispose();
    super.dispose();
  }
}

class RoundedButton extends StatefulWidget {
  final String text;
  final Function()? press;
  final double verticalPadding;
  final double horizontalPadding;
  final double fontSize;

  RoundedButton({
    Key? key,
    required this.text,
    required this.press,
    this.verticalPadding = 16,
    this.horizontalPadding = 30,
    this.fontSize = 16,
  }) : super(key: key);

  @override
  _RoundedButtonState createState() => _RoundedButtonState();
}

class _RoundedButtonState extends State<RoundedButton>
    with SingleTickerProviderStateMixin {
  late AnimationController _controller;
  late Animation<double> _slideAnimation;

  @override
  void initState() {
    super.initState();

    _controller = AnimationController(
      vsync: this,
      duration: Duration(seconds: 1),
    );

    _slideAnimation = Tween<double>(begin: 0.0, end: 1.0).animate(
      CurvedAnimation(parent: _controller, curve: Curves.easeInOut),
    );

    _controller.forward(); // Start the animation
  }

  @override
  Widget build(BuildContext context) {
    return AnimatedBuilder(
      animation: _controller,
      builder: (context, child) {
        return Transform.translate(
          offset: Offset(0.0, 100 * (1 - _slideAnimation.value)),
          child: GestureDetector(
            onTap: widget.press,
            child: Container(
              width: double.infinity,
              alignment: Alignment.center,
              margin: EdgeInsets.symmetric(vertical: 16),
              padding: EdgeInsets.symmetric(
                vertical: widget.verticalPadding,
                horizontal: widget.horizontalPadding,
              ),
              decoration: BoxDecoration(
                color: Colors.white,
                borderRadius: BorderRadius.circular(30),
                boxShadow: [
                  BoxShadow(
                    offset: Offset(0, 15),
                    blurRadius: 30,
                    color: Color(0xFF666666).withOpacity(.11),
                  ),
                ],
              ),
              child: Text(
                widget.text,
                style: TextStyle(
                  fontSize: widget.fontSize,
                  fontWeight: FontWeight.bold,
                ),
              ),
            ),
          ),
        );
      },
    );
  }

  @override
  void dispose() {
    _controller.dispose();
    super.dispose();
  }
}