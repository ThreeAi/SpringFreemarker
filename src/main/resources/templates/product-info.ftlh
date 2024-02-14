<!DOCTYPE html>
<html>
<head>
    <title>BUYSELL</title>
</head>
<body>
<h1>BUYSELL</h1>
<h4>Information about product</h4>
<#list images as img>
    <img src="/images/${img.id}" height="60px"><br><br>
</#list>
<b>Name product: </b> ${product.title}<br>
<b>Description product: </b> ${product.description}<br>
<b>Price: </b> ${product.price}<br>
<b>City: </b> ${product.city}<br>
<b>Name seller: </b> ${product.author}<br>
<hr>
<h3></h3>
<form action="/product/delete/${product.id}" method="post">
    <input type="submit" value="delete product">
</form>
</body>
</html>