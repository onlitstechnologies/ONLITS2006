<?php
    session_start();
    if(!isset($_SESSION['userid'])){
        header("Location:index.php");
    }
?>
<html>

<head>
    <title></title>
</head>

<body>
    <form action="" method="POST">
        <h1>Dashboard</h1>
        <h3><?php session_start();
            echo $_SESSION['userid']; ?></h3>
        <button type="submit" name="logout">Logout</button>
    </form>
</body>

</html>

<?php
    if(isset($_POST['logout'])) {
        session_destroy();
        header("Location:index.php");
    }
?>