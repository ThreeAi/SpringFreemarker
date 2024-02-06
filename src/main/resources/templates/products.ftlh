<!DOCTYPE html>
<html>
<head>
        <title>BUYSELL</title>
</head>
<body>
        <h1>BUYSELL</h1>
        <h4>All prouducts</h4>
        <#list products as product>
            <div>
                    <p><b>${product.title}</b> ${product.price} rub. | <a href="/product/${product.id}">More...</a>
            </div>
        </#list>
        <hr>
        <h3>Create new product</h3>
        <form action="/product/create" method="post">
                Name product: <input type="text" name="title"/><br><br>
                Description: <input type="text" name="description"/><br><br>
                Price: <input type="number" name="price"/><br><br>
                City: <input type="text" name="city"/><br><br>
                Name seller: <input type="text" name="author"/><br><br>
                <input type="submit" value="add product">
        </form>
</body>
</html>