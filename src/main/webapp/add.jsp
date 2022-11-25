<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">


    <link rel="stylesheet" href="./css/add.css">

</head>

<body>



    <!-- partial:index.partial.html -->
    <div id="MainDivContainer">
        <form id="loginForm">
            <h2>ADD NEW PROPERTY</h2>

            <label for="proID">Property ID</label>
            <input placeholder="Property ID" class="inputField" type="text" id="proID" name="proID" required><i class="validation"><span></span><span></span></i>

            <label for="ProName">Property Name</label>
            <input placeholder="Property Name" class="inputField" type="text" id="ProName" name="proName" required><i class="validation"><span></span><span></span></i>

            <label for="location">Location</label>
            <input placeholder="Location" class="inputField" type="text" id="location" name="location" required><i class="validation"><span></span><span></span></i>

            <label for="price">Price</label>
            <input placeholder="Price" class="inputField" type="text" id="price" name="price" required><i class="validation"><span></span><span></span></i>

            <label for="des">Description</label>
            <input placeholder="Description" class="inputField" type="text" id="des" name="des" required><i class="validation"><span></span><span></span></i>
            <br/>

            <input class="submitButton" type="submit" id="sub" value="Submit">

        </form>

    </div>
    <!--create-account-wrap-->
    <!--login-form-wrap-->
    <!-- partial -->




</body>

</html>