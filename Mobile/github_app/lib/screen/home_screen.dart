import 'package:flutter/material.dart';
import 'package:flutter/widgets.dart';
import 'package:github_app/delegate/github_search_delegate.dart';

class HomeScreen extends StatefulWidget {
  const HomeScreen({Key? key}) : super(key: key);

  @override
  State<HomeScreen> createState() => _HomeScreenState();
}

class _HomeScreenState extends State<HomeScreen> {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: const Text("Bem Vindo ao GitHubApp"),
        actions: [  //Botões que ficam do lada da barra de tarefas
          IconButton(
            onPressed: (){
              showSearch(
                context: context,
                delegate: GithubSearchDelegate(),
            );
          },
          icon: const Icon(Icons.search))
        ],
      ),
      body: Center(child: const Text("Buscar Repositórios Públicos"),),
    );
  }
}
