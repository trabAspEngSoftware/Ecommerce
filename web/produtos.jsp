<%-- 
    Document   : produtos
    Created on : 31/05/2016, 17:31:35
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
	
	<link rel="stylesheet" type="text/css" href="css/bootstrap.css">

        <title>Produtos</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <h1 style="margin-left:5%;">Produtos</h1>
        
        <%@include file="cabecalho.jsp" %>
		<br>
		<table class="table" style="margin: 0 auto; width: 50%;margin-top:5%">
		
			<tr>
			  <th scope="row"></th>
			  <td>Notebook</td>
			  <td>RS 2.500</td>
			  <td><button class="btn btn-primary" type="submit" >Adicionar ao Carrinho</button></td>
			</tr>

			<tr>
			  <th scope="row"></th>
			  <td>Frigobar</td>
			  <td>RS 3.000</td>
			  <td><button class="btn btn-primary">Adicionar ao Carrinho</button></td>
			</tr>
			
		</table>
    		<button class="btn btn-success" style="margin-top:5%;margin-left:80%;">Finalizar Compra</button>
    </body>
</html>