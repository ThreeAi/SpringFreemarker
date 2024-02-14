<!DOCTYPE html>
<html>
<head>
        <title>BUYSELL</title>
</head>
<body>
        <h1>BUYSELL</h1>
        <h4>All prouducts</h4>
        <form action="/" method="get">
                Search by title: <input type="text" name="title"><br>
                <input type="submit" value="Search">
        </form>
        <#list products as product>
            <div>
                    <p><b>${product.title}</b> ${product.price} rub. | <a href="/product/${product.id}">More...</a>
            </div>
                <#else>
                <h3>product list empty</h3>
        </#list>
        <hr>
        <h3>Create new product</h3>
        <form action="/product/create" method="post" enctype="multipart/form-data">
                Name product: <input type="text" name="title"/><br><br>
                Description: <input type="text" name="description"/><br><br>
                Price: <input type="number" name="price"/><br><br>
                City: <input type="text" name="city"/><br><br>
                Name seller: <input type="text" name="author"/><br><br>
                Photo 1: <input type="file" name="file1"/><br><br>
                Photo 2: <input type="file" name="file2"/><br><br>
                Photo 3: <input type="file" name="file3"/><br><br>
                <input type="submit" value="add product">
        </form>
</body>
</html>