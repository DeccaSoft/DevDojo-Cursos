import 'package:flutter/material.dart';

class GithubSearchDelegate extends SearchDelegate<String>{
  @override
  List<Widget>? buildActions(BuildContext context) { //Ao abrir a tela terá as ações do lado
    if(query.isNotEmpty){ //query é uma variável que recebe o que o usuário digita
      return [
        IconButton(onPressed: () => query = "", icon: Icon(Icons.clear))
      ];
    }
    return [Container()];
  }

  @override
  Widget? buildLeading(BuildContext context) { //Ação no canto superior esquerdo
    return IconButton(
        onPressed: () => close(context, ""),
        icon: AnimatedIcon(
          icon: AnimatedIcons.menu_close,
          progress: transitionAnimation,
        )
    );
  }

  @override
  Widget buildResults(BuildContext context) { //Resultados para pesquisas
    if(query.isEmpty){
      return Container();
    }
    return Text("Busca Bem Sucedidia!!!");
  }

  @override
  Widget buildSuggestions(BuildContext context) { //Sugestões de Pesquisa
    if(query.isEmpty){
      return Container();
    }
    return ListTile(
      leading: const Icon(Icons.book),
      title: Text("Repositórios com $query"),
      onTap: () => showResults(context),
    );
  }

}