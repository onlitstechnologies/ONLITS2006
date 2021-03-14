<html>

<head>
    <title></title>
</head>

<body>
    <form method="POST">
        <input type="text" name="userid" id="userid">
        <input type="password" name="password" id="password">
        <button type="submit" name="submit">Login</button>
    </form>
</body>

</html>

<?php
if (isset($_POST['submit'])) {
    $username = $_POST['userid'];
    $password = $_POST['password'];

    if ($username == 'root' && $password == 'pwd') {
        header('Location:Dashboard.php');
        session_start();
        $_SESSION['userid'] = $username;
    } else {
        echo "Authentication Failed!";
    }
}
?>