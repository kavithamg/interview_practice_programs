<html>  
<body>  
<form method="post">
    Enter the starting range of a number<input type="text" name="number1"> <br />
    Enter the ending range of a number<input type="text" name="number2"> <br />
    <input type="submit" value="Submit">  
</form>  
</body>  
</html>

<?php
if($_POST){
    $number1 = $_POST['number1'];
    $number2 = $_POST['number2'];

    for($i = $number1; $i <= $number2; $i++){
        if($i % 2 != 0)
        {
            echo "{$i} is an odd number <br />";
        }
        else{
            echo "{$i} is not an odd number <br />";
        }
    }
}
?>  