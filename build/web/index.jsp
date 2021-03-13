<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hi Diogo!</title>        
    </head>
    <body>
        <h2>Hello World! Java Server Page</h2>
        <hr>
        <%
            String nome = "<i>Diogo</i>";
            int idade = 35;
            boolean inteligente = true; 
            int soma = 10 + 10;
            //System.out.println(nome);
            //out.print(nome);
        %>
        <strong>Nome: </strong> <%=nome%><br>
        <strong>Idade: </strong> <%=idade%><br>
        <strong>Inteligente?: </strong>
        <%=inteligente ? "Sim" : "Não" %><br>
        <strong>Resultado da soma: </strong><%=soma%><br>
    </body>
</html>
