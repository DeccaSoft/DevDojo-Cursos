import 'package:flutter/material.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return MaterialApp( //Contem as informações do Tema do Aplicativo (Cor, Fonte, Etc..)
      title: "Aplicativo IMC",
      theme: ThemeData( //Classe de definição do Tema (Cor, Fonte, etc..)
        primarySwatch: Colors.blue
      ),
      home: Home(), //Widget carregado inicialmente
    );
  }
}

class Home extends StatefulWidget {
  const Home({Key? key}) : super(key: key);

  @override
  State<Home> createState() => _HomeState();
}

class _HomeState extends State<Home> {

  //Para capturar valores dos inputs precisamos de controladores
  //que serão criados a seguir
  TextEditingController nome = TextEditingController();
  TextEditingController altura = TextEditingController();
  TextEditingController peso = TextEditingController();
  String msg = "";

  @override
  Widget build(BuildContext context) {
    return Scaffold(  //Widget de criação de Tela padrão
                  // com todos os setores(Barra Superior e Inferior, corpo, etc)
      appBar: AppBar( //Widget da Barra Superior
        title: Text("Aplicativo IMC"),
        centerTitle: true,
      ),
      body: SingleChildScrollView(
        child: Column(
          children: [
            Padding(
              padding: const EdgeInsets.all(8.0),
              child: Image.network("https://pt.calcuworld.com/wp-content/uploads/sites/6/2019/07/imc-.png"),
              //Aqui quero ajustar o tamanho da imagem!!!
            ),
            Padding(
              padding: const EdgeInsets.all(8.0),
              child: TextField(
                controller: nome,
                decoration: InputDecoration(
                  labelText: "Nome",
                  border: OutlineInputBorder()
                ),
              ),
            ),
            Padding(
              padding: const EdgeInsets.all(8.0),
              child: TextField(
                controller: altura,
                keyboardType: TextInputType.number,
                decoration: InputDecoration(
                    labelText: "Altura",
                    border: OutlineInputBorder()
                ),
              ),
            ),
            Padding(
              padding: const EdgeInsets.all(8.0),
              child: TextField(
                controller: peso,
                keyboardType: TextInputType.number,
                decoration: InputDecoration(
                    labelText: "Peso",
                    border: OutlineInputBorder()
                ),
              ),
            ),
            RaisedButton(
              onPressed: (){
                final imc = double.parse(peso.text) / (double.parse(altura.text) * double.parse(altura.text));
                setState(() { //Reconstrói o layout, para a mensagem aparecer
                  msg = "Olá, ${nome.text}, seu IMC é: ${imc.toStringAsFixed(2)}. Você está ${estado(imc)}";
                });
              },
              textColor: Colors.white,
              color: Colors.blue,
              child: Text("Calcular"),
            ),
            Padding(
              padding: const EdgeInsets.all(8.0),
              child: Text(msg),
            ),
          ],
        ),
      ),
    );
  }
}

String estado(double valor){
  if(valor <= 18.5){
    return "Magro";
  }
  if(valor > 18.5 && valor < 24.9){
    return "Normal";
  }
  return "Sobrepeso";
}